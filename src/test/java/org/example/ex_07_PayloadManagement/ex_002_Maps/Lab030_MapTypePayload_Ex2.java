package org.example.ex_07_PayloadManagement.ex_002_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab030_MapTypePayload_Ex2 {

    public static void main(String[] args) {

        List<HashMap<String,Object>> fruits = new ArrayList<>();

        HashMap<String,Object> apple_detail = new HashMap<>();
        apple_detail.put("type","Pome");
        apple_detail.put("season","Fall");

        HashMap<String,Object> apple_nutrients = new HashMap<>();
        apple_nutrients.put("calories",52);
        apple_nutrients.put("fiber","2.4g");
        apple_nutrients.put("vitaminC","4.6mg");


        HashMap<String,Object> banana_detail = new HashMap<>();
        banana_detail.put("type","Berry");
        banana_detail.put("season","Year-round");

        HashMap<String,Object> banana_nutrients = new HashMap<>();
        banana_nutrients.put("calories",89);
        banana_nutrients.put("fiber","2.6g");
        banana_nutrients.put("pottasium","358mg");


        HashMap<String,Object> apple = new HashMap<>();
        apple.put("name","Apple");
        apple.put("color","#FF0000");
        apple.put("details",apple_detail);
        apple.put("nutrients",apple_nutrients);


        HashMap<String,Object> banana = new HashMap<>();
        banana.put("name","Banana");
        banana.put("color","#FFFF00");
        banana.put("details",banana_detail);
        banana.put("nutrients",banana_nutrients);

        fruits.add(apple);
        fruits.add(banana);

        HashMap<String,Object> fruit_map = new HashMap<>();
        fruit_map.put("fruit",fruits);

        System.out.println(fruit_map);

    }

}
