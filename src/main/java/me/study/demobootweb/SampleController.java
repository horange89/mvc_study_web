package me.study.demobootweb;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    // preHandle 1
    // preHandle 2
    // 요청처리
    // postHandle 2
    // postHandle 1
    // 뷰 랜더링
    // afterCompletiton 2
    // afterCompletiton 1

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Person person) {
        return "hello " + person.getName();
    }

    @GetMapping("message")
    public String message(@RequestBody String body) {
        return body;
    }

    @GetMapping("/jsonMessage")
    public Person jsonMessage(@RequestBody Person person) {
        return person;
    }
}
