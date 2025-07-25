package com.SMS.MainApp;

import java.util.HashMap;
import java.util.Map;

public class KeywordDictionary {
    public static Map<String, Integer> getKeywordMap() {
        Map<String, Integer> keywordMap = new HashMap<>();

        keywordMap.put("win", 3);
        keywordMap.put("prize", 3);
        keywordMap.put("free", 2);
        keywordMap.put("offer", 2);
        keywordMap.put("money", 2);
        keywordMap.put("urgent", 2);
        keywordMap.put("call now", 3);
        keywordMap.put("click here", 3);
        keywordMap.put("buy now", 2);
        keywordMap.put("congratulations", 3);

        return keywordMap;
    }
}

