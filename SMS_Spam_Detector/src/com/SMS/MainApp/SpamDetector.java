package com.SMS.MainApp;

import java.util.Map;

public class SpamDetector {
    private Map<String, Integer> keywordMap;
    private final int THRESHOLD = 4;

    public SpamDetector() {
        keywordMap = KeywordDictionary.getKeywordMap();
    }

    public boolean isSpam(String message) {
        int score = calculateScore(message.toLowerCase());
        return score >= THRESHOLD;
    }

    public int calculateScore(String message) {
        int score = 0;
        for (Map.Entry<String, Integer> entry : keywordMap.entrySet()) {
            String keyword = entry.getKey();
            int weight = entry.getValue();
            int occurrences = countOccurrences(message, keyword);

            score += occurrences * weight;
        }
        return score;
    }

    // Helper method to count how many times a keyword appears
    private int countOccurrences(String message, String keyword) {
        int count = 0;
        int index = 0;

        while ((index = message.indexOf(keyword, index)) != -1) {
            count++;
            index += keyword.length();
        }

        return count;
    }
}


