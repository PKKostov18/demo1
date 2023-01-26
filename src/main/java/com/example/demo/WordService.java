package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class WordService {

    public String getWords(String word, int n) {
        StringBuilder repeatedWord = new StringBuilder();
        for (int i = 0; i < n; i++) {
            repeatedWord.append(word + " ");
        }
        return repeatedWord.toString();
    }
}
