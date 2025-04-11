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

        dto.setSumScore(dto.getEngScore() + dto.getKorScore() + dto.getMathScore());
        String avg = String.format("%.2f", dto.getSumScore() / 3.0);
        dto.setAvgScore(Double.parseDouble(avg));

        model.addAttribute("list", dto);

        return "score_result";
    }
}
