package com.solo.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        return "client/main";
    }

    @GetMapping("/join")
    public String join() {
        return "client/join";
    }

    @GetMapping("/findId")
    public String findId() {
        return "client/findId";
    }

    @GetMapping("/findPw")
    public String findPw() {
        return "client/findPw";
    }

}
