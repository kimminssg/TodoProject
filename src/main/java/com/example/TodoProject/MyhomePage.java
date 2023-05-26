package com.example.TodoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Rest (API)를 처리하는 컨트롤러 클래스
public class MyhomePage {
    @GetMapping("/MyhomePage") // hello 경로를 노출할 때 해당 메소드가 처리합니다. 주소입력
    public String hello(@RequestParam(value = "name", defaultValue = "Worlds") String name) {
        // name 파라미터를 받아서 String 타입의 name 변수에 할당함.
        return String.format("Hello %s!", name); //
    }
}
