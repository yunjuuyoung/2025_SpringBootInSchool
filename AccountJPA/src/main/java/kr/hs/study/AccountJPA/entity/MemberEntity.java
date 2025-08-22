package kr.hs.study.AccountJPA.entity;

import jakarta.persistence.*;
import kr.hs.study.AccountJPA.dto.MemberDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="memberJpa")

public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    public static MemberDto toDto(MemberEntity entity) {
        return MemberDto.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .name(entity.getName())
                .build();
    }
}

