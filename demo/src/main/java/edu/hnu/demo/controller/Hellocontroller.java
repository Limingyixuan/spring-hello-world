package edu.hnu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class Hellocontroller {
    @ResponseBody
    @RequestMapping("/hello")
    public String handlen(){
        return "hellow,new DFP";
    }
}