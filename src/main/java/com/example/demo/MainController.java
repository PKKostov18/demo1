package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/numbers/n=20")
    public String printNumbers(Model model , @RequestParam int n ){
        List<Integer> numbersDividedByThree = new ArrayList<>();
        for(int i = 2; i <= n;i++){
            if(i%3==0){
                numbersDividedByThree.add(i);
            }
        }
        model.addAttribute("numbers1", numbersDividedByThree);
        return "numbers1";
    }


}
