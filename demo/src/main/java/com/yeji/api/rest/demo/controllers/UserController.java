package com.yeji.api.rest.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    /*로그인*/
    @PostMapping("/login")
    public String login(){
        return "user/login";
    }
    /*로그아웃*/
    @PatchMapping("/logout")
    public static void logout(){

    }
    /*회원가입*/
    @PostMapping("join")
    public static void join(){

    }

}
