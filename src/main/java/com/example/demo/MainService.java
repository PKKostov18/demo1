package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {

    public List<Integer> getNumbers(int n){
        List<Integer> numbersDividedByThree = new ArrayList<>();
        for(int i = 2; i <= n;i++){
            if(i%3==0){
                numbersDividedByThree.add(i);
            }
        }
        return numbersDividedByThree;
    }
}
