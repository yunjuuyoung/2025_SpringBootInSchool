package kr.hs.study.AccountJPA.dto;

import kr.hs.study.AccountJPA.entity.MemberEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberDto {
    private Long id;
    private String email;
    private String password;
    private String name;

    public static MemberEntity toEntity(MemberDto dto) {
        return MemberEntity.builder()
                .id(dto.getId())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .name(dto.getName())
                .build();
    }
}

