package org.example.springboot.web;

import org.example.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //컨트롤러를 json을 반환하는 컨트롤러로 만들어 줌
public class HelloController {
    @GetMapping("/hello") //HTTP method인 Get의 요청을 받을 수 있는 API를 만들어 줌
    //hello로 요청이 오면 문자열 hello를 반환
    public String hello(){
        return "hello";
    }
    @GetMapping
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
