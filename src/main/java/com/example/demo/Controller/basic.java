package com.example.demo.controller;
import org.springframework.web.bind.anno
public class basic{
    @getmapping("/home")
    public String name(){
        return "hello world";
    }
}