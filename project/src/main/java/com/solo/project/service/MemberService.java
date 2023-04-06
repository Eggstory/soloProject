package com.solo.project.service;

import com.solo.project.dto.MemberRequestDTO;
import com.solo.project.entity.Member;
import com.solo.project.entity.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository repository;

    public void memberSave(MemberRequestDTO dto) {
        Member member = dto.toSaveEntity();
        repository.save(member);
    }
}
