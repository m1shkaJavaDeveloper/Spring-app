package ru.zharov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{

    public List<String> createRockMusicList(List<String> rockMusicList){
        rockMusicList.add("Wind cries Mary");
        rockMusicList.add("Godzilla");
        rockMusicList.add("Venom");
        return rockMusicList;
    }

    @Override
    public List<String> getSong() {
        List<String> rockMusicList = new ArrayList<>();
        return createRockMusicList(rockMusicList);
    }
}
