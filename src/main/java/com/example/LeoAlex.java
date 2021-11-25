package com.example;

import java.util.HashMap;

public class LeoAlex extends Lion{

    public LeoAlex(Feline feline) throws Exception {
        super(feline, "Самец");
    }

    public HashMap<String, String> getFriends(){
        HashMap<String, String> friendsAlexs = new HashMap<>();
        friendsAlexs.put("Зебра", "Марти");
        friendsAlexs.put("Бегемот", "Глория");
        friendsAlexs.put("Жираф", "Мелман");
        return friendsAlexs;
    }

    public String getPlaceOfLiving (){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
