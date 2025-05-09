package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.dto.MemoDto;
import kr.hs.study.MyBatisPrj.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/memo")
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping()
    public String memo(Model model) {
        List<MemoDto> memoList = service.listAll();
        model.addAttribute("memoList", memoList);
        return "memo";
        }

    @PostMapping()
    public String insert(MemoDto dto) {
        service.insert(dto);
        return "redirect:/memo";
    }

//    @GetMapping("/list")
//    public String listAll(Model model) {
//        List<MemoDto> memoList = service.listAll();
//        model.addAttribute("memoList", memoList);
//        return "memo";
//    }
}
