package com.solo.project.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberReuestDTO {

    private Long memberIdx;
    private String memberId;
    private String memberPw;

    public void toSaveEntity() {

    }

}
