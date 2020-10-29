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
    //TODO GTB-完成度: * 功能实现过少，无法给出更多的feedback
    //TODO GTB-知识点: - HeroController.java:18 建议Ioc容器管理的bean之间的注入，使用构造器注入
    @Autowired
    private HeroRepository heroRepository;

    @GetMapping
    //TODO GTB-综合: * 正常返回所需资源即可，无需自定义Response
    public Resp<List<Hero>> getAllHero() {
        //TODO GTB-知识点: - HeroController.java:25 三层架构，一层调用一层，最好不要出现跨层调用
        return new Resp<>(heroRepository.get());
    }
}
