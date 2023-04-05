package com.solo.project.entity;

import jakarta.persistence.Entity;

@Entity
public class Member {

    private Long memberIdx;
    private String memberId;
    private String memberPw;
}
