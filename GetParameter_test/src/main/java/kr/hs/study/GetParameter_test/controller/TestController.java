package kr.hs.study.GetParameter_test.controller;

import ch.qos.logback.core.model.Model;
import kr.hs.study.GetParameter_test.dto.Test1DTO;
import kr.hs.study.GetParameter_test.dto.Test2DTO;
import kr.hs.study.GetParameter_test.dto.TestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @PostMapping("/test")
    public String test(@RequestParam Integer[] n) {
        int evenSum = 0, oddSum = 0;

        for (int num : n) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("even sum : " + evenSum);
        System.out.println("odd sum : " + oddSum);

        return "result";
    }

    @PostMapping("/test1")
    public String test1(Test1DTO dto) {
        for (int i = 1; i <= 100; i++) {
            if (i % dto.getN() == 0) {
                System.out.println(dto.getN() + "의 배수 : " + i);
            }
        }

        return "result";
    }

    @PostMapping("/test2")
    public String test2(Test2DTO dto) {
        int less, more;
        if (dto.getN1() > dto.getN2()) {
            more = dto.getN1();
            less = dto.getN2();
        } else {
            more = dto.getN2();
            less = dto.getN1();
        }

        for (int i = more; i >= less; i--) {
            System.out.println("작아진다앙 : " + i);
        }

        return "result";
    }

    @PostMapping("/test3")
    public String test3(Test1DTO dto) {
        int sum = 0;

        for (int i = 1; i <= dto.getN(); i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(dto.getN() + "까지의 5의 배수의 합 : " + sum);

        return "result";
    }

    // test4 작성 필요

    @PostMapping("/test5")
    public String test5(Test2DTO dto) {
        int sum = 0, count = 0;
        int less, more;
        if (dto.getN1() > dto.getN2()) {
            more = dto.getN1();
            less = dto.getN2();
        } else {
            more = dto.getN2();
            less = dto.getN1();
        }

        for (int i = less; i <= more; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("합 : " + sum);
        System.out.println("평균 : " + sum/count);

        return "result";
    }

    @PostMapping("/test6")
    public String test6(Test1DTO dto) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(dto.getN() + "의 배수 : " + i * dto.getN());
        }

        return "result";
    }
}
