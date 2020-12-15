package ru.zharov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{

    public List<String> createClassicalMusicList(List<String> classicalMusicList){
        classicalMusicList.add("Hungarian Rhapsody");
        classicalMusicList.add("Baby");
        classicalMusicList.add("Natural");
        return classicalMusicList;
    }

    @Override
    public List<String> getSong() {
        List<String> classicalMusicList = new ArrayList<>();
        return createClassicalMusicList(classicalMusicList);
    }
}
