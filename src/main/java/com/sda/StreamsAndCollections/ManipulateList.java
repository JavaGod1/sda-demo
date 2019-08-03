package com.sda.StreamsAndCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManipulateList {

    public List<String> getFirstName(List<String> list) {
        List<String> firstWord = new ArrayList<>();
        for (String str : list) {
            int i = str.indexOf(' ');
            String firstName = str.substring(0, i);
            String lastName = str.substring(i);
            if (firstWord.contains(firstName)) {
                firstWord.add(firstName + " " + lastName.charAt(0));
            } else {
                firstWord.add(firstName);
            }

        }
        return firstWord;

    }


//    public List<String> transform(List<String> initialList){
//
//        initialList.forEach(name->getFirstName(name));
//
//        return initialList;
//    }

    public Map<Integer, String> mapNames(List<String> fileLines) {

        Map<Integer, String> map = new HashMap<>();
        int i = 0;
        for (String names : fileLines) {
            map.put(i, names);
            i++;
        }

        return map;
    }


}
