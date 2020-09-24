package com.zhanglz.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @RequestMapping(value = {"","/index"})
    public String index(Model model){
        model.addAttribute("msg","hello word!");
        return "index";
    }

}
