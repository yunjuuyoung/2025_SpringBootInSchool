package kr.hs.study.MyBatisPrj.dto;

import lombok.Data;

@Data
public class ScoreDto {
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;
    private int sumScore;
    private Double avgScore;
}
