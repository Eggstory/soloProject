package com.solo.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @PostMapping("/loginAction")
    public String login(@RequestParam(value = "userId") String userId,@RequestParam(value = "userPw") String userPw) {



    }
}
