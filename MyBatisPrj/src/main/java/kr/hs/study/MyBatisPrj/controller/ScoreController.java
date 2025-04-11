package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.ScoreDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/score")
public class ScoreController {
    @GetMapping()
    public String score() {
        return "score";
    }

    @PostMapping()
    public String score(ScoreDto dto, Model model) {
        String result = "이름 : " + dto.getName() + "\n";

        int sumScore = dto.getEngScore() + dto.getKorScore() + dto.getMathScore();
        double avgScore = sumScore / 3.0;

        result += "국어 : " + dto.getKorScore() + "\n";
        result += "영어 : " + dto.getEngScore() + "\n";
        result += "수학 : " + dto.getMathScore() + "\n";
        result += "총점 : " + sumScore + "\n";
        result += "평균 : " + avgScore + "\n";

        model.addAttribute("list", result.replaceAll("\\r?\\n", "<br/>"));

        return "result";
    }
}
