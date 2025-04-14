package kr.hs.study.MyBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mav")
public class MavController {
    @GetMapping()
    public ModelAndView mav() {
        ModelAndView mv = new ModelAndView();

        // 모델 이름과 객체를 전달해야 함
        mv.addObject("item", "lay Devine");
        mv.setViewName("mav");

        return mv;
    }
}
