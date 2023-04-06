package com.solo.project.dto;

import com.solo.project.entity.Member;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequestDTO {

    private Long memberIdx;
    private String memberId;
    private String memberPw;


    public Member toSaveEntity() {
        return Member.builder()
                .memberId(this.memberId)
                .memberPw(this.memberPw)
                .build();
    }

}
