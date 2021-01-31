package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("talk", new String[]{"Говорить", "Беседовать", "Общаться", "Разговаривать"});
        dictionary.put("Box", new String[]{"сундук,", "коробка", "ящик", "ларь", "козлы"});
        dictionary.put("telephone", new String[]{"Телефон", "смарфон", "", "мобилка"});
        dictionary.put("Car", new String[]{"машина", "железный конь", "", "Автомобиль"});

        for (Map.Entry<String, String[]> one : dictionary.entrySet()) {
            System.out.println("Keys :" + one.getKey() + " Values: " + Arrays.toString(one.getValue()));
        }
        HashMap<String, String[]> hugeDictionary = new HashMap<>();
        hugeDictionary.putAll(dictionary);
        Set<String> keysInMap = dictionary.keySet();
        Iterator<String> iterator = keysInMap.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            for (int i = 0; i < dictionary.get(key).length; i++) {
                ArrayList<String> values = new ArrayList<>();
                Collections.addAll(values, dictionary.get(key));
                String eachOne = values.get(i);
                values.set(i, key);
                String[] newArray = new String[values.size()];
                for (int j = 0; j < values.size(); j++) {
                    newArray[j] = values.get(j);
                }
                hugeDictionary.put(eachOne, newArray);
            }
        }
        for (Map.Entry<String ,String[]> print : hugeDictionary.entrySet()) {
            System.out.println(print.getKey() + " " +Arrays.toString(print.getValue()));
        }
    }
}




