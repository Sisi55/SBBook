package com.sisi.ubic.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 컨트롤러를 JSON 을 반환하는 컨트롤러로 만들어준다.
// 메소드마다 @ResponseBody 를 선언할 필요가 없어진다.
@RestController
public class HelloController {

    // HTTP Method 인 Get 요청을 받을 수 있는 API 를 만들어준다.
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
