package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.replaceAll("\\pP","").toLowerCase();
        Map<String, Integer> result = new HashMap<>();
        for(String s : sentence.split(" ")){
            Integer count = result.get(s);
            if(!s.isEmpty()){
                result.put(s, count==null ? 1 : count+1);
            }
        }
        return result;
    }
}
