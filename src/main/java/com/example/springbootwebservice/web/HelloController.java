package com.example.springbootwebservice.web;

import com.example.springbootwebservice.web.dto.response.HelloResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String HelloController(){
        return "Hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name")String name,
                                     @RequestParam("amount")int amount){
        return new HelloResponseDto(name, amount);

    }
}
