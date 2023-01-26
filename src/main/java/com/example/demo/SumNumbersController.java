package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SumNumbersController {

    SumNumbersService sumNumbersService;

    @Autowired
    public SumNumbersController(SumNumbersService sumNumbersService) {
        this.sumNumbersService = sumNumbersService;
    }

    @GetMapping("/sum-numbers")
    public String sumNumbers(Model model, int n) {
        sumNumbersService.getSumNumbers(n);
        model.addAttribute("sumNumbers", sumNumbersService.getSumNumbers(n));
        return "numbers2";
    }
}
