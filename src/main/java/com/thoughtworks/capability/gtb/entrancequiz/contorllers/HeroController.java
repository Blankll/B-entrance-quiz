package com.thoughtworks.capability.gtb.entrancequiz.contorllers;

import com.thoughtworks.capability.gtb.entrancequiz.entities.Hero;
import com.thoughtworks.capability.gtb.entrancequiz.repositories.HeroRepository;
import com.thoughtworks.capability.gtb.entrancequiz.utils.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/hero")
public class HeroController {
    @Autowired
    private HeroRepository heroRepository;

    @GetMapping
    public Resp<List<Hero>> getAllHero() {
        return new Resp<>(heroRepository.get());
    }
}
