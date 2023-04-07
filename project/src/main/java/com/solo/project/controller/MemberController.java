package com.solo.project.controller;

import com.solo.project.dto.MemberRequestDTO;
import com.solo.project.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @PostMapping("/joinAction")
    @ResponseBody
    public String join(@Valid @RequestBody MemberRequestDTO dto) {

        service.memberSave(dto);

        // @ResponseBody 쓸때 리턴값에 뭐라도 넣어주기 (빈값안됨)
        return "";

    }


    @PostMapping("/loginAction")
    public String login(@RequestParam(value = "userId") String userId,@RequestParam(value = "userPw") String userPw) {

        return "";

    }
}
