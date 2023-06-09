package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> result = new HashMap<>();
        for(int i=1;i<=sourceMap.size();i++){
            System.out.println(i+" "+sourceMap.get(i));
            if (sourceMap.get(i) != null){
                result.put(sourceMap.get(i),i);
            }
        }
        return result;
    }
}
