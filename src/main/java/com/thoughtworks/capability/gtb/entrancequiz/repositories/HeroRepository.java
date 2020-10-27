package com.thoughtworks.capability.gtb.entrancequiz.repositories;

import com.thoughtworks.capability.gtb.entrancequiz.entities.Hero;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HeroRepository {
    private static final List<Hero> HERO_LIST = new ArrayList<>();
    static {
        HERO_LIST.add(new Hero(1,  "成吉思汗"));
        HERO_LIST.add(new Hero(2,  "鲁班七号"));
        HERO_LIST.add(new Hero(3,  "太乙真人"));
        HERO_LIST.add(new Hero(4,  "钟无艳"));
        HERO_LIST.add(new Hero(5,  "花木兰"));
        HERO_LIST.add(new Hero(6,  "雅典娜"));
        HERO_LIST.add(new Hero(7,  "芈月"));
        HERO_LIST.add(new Hero(8,  "白起"));
        HERO_LIST.add(new Hero(9,  "刘禅"));
        HERO_LIST.add(new Hero(10,  "庄周"));
        HERO_LIST.add(new Hero(11,  "马超"));
        HERO_LIST.add(new Hero(12,  "刘备"));
        HERO_LIST.add(new Hero(13,  "哪吒"));
        HERO_LIST.add(new Hero(14,  "大乔"));
        HERO_LIST.add(new Hero(15,  "蔡文姬"));
    }

    public List<Hero> get() {
        return HERO_LIST;
    }
}
