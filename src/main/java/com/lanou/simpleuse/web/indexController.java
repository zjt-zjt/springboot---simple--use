package com.lanou.simpleuse.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class indexController  extends SpringBootServletInitializer {

 @RequestMapping("/")
    public  String  welcome(Model model){
        model.addAttribute("msg","欢迎进入");
        return  "index";
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(indexController.class);
    }
}
