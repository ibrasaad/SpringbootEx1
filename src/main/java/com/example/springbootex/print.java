package com.example.springbootex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class print {
    @GetMapping("/name")
    public String Name(){
        return " my name is :ibrahim saad alsaeed";
    }
    @GetMapping("/age")
    public String age(){
        return "my age is : 24";
    }
    @GetMapping("/status")
    public String status(){
        return "Everthing is OK";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping("/names")
    public ArrayList<String> getarry(){
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add(0,"ibrahim");
        arrayList.add(1,"saad");
        return arrayList;
    }
}
