package kr.hs.study.MyBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/times-tables")
public class TimesTableController {
    @GetMapping()
    public String ttable() {
        return "table_input";
    }

    @PostMapping()
    public String ttable(@RequestParam("number") int number, Model model) {
        String result = "";

        for (int  i = 1; i <= 9; i++) {
            result += number + " * " + i + " = " + (number*i) + "\n";
        }
        System.out.println(result);
        model.addAttribute("list", result.replaceAll("\\r?\\n", "<br/>"));

        return "result";
    }
}
