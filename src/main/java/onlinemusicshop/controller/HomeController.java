package onlinemusicshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/","/index","/home"})
    public String showIndexPage(){
        return "index";
    }
}
