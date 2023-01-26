package com.example.demo;

import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/numbers")
    public String printNumbers(Model model , @RequestParam int n ){
        mainService.getNumbers(n);
        model.addAttribute("numbersDividedByThree", mainService.getNumbers(n));
        return "numbers1";
    }

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/numbers3")
    public String getNumbers3() {
        return "numbers3";
    }


}
