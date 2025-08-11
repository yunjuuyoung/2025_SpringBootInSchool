package kr.hs.study.FirstJPA.dto;

import kr.hs.study.FirstJPA.entity.MemoEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemoDto {
    private Long id;
    private String title;
    private String content;

    // dto -> entity
    public static MemoEntity toEntity(MemoDto dto) {
        return MemoEntity.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();
    }
}
