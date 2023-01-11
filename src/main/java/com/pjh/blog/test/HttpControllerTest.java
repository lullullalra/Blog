package com.pjh.blog.test;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpControllerTest {

    @GetMapping("/http/get")
    public String getTest(@RequestParam int id, @RequestParam String username){
        return "get 요청: "+id+ "," + username;
    }

    @PostMapping("/http/post")
    public String postTest(){
        return "post 요청";
    }

    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }
}
