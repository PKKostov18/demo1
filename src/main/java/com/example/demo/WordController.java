package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordController {

    WordService wordService;

    @Autowired
    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping("/words")
    public String printWord(Model model, String word, int n) {
        wordService.getWords(word, n);
        model.addAttribute("words", wordService.getWords(word, n));
        return "numbers3";
    }
}
