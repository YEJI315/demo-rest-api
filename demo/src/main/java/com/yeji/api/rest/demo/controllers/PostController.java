package com.yeji.api.rest.demo.controllers;

import com.yeji.api.rest.demo.exceptions.PostNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {
    @GetMapping
    public String list(){
        return "게시물 목록\n";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable("id") String id) {
        return "게시물 상세: " + id;
    }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody(required = false) String body) {
        return "게시물 생성: " + body;
    }

    @PatchMapping("/{id}")
    public String update(@PathVariable("id") String id, @RequestBody String body) {
        return "게시물 수정: " + id + " with " + body;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        return "게시물 삭제: " + id;
    }

    /*@ExceptionHandler(PostNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND) {
        public String postNotFound(){
            return "게시물을 찾을 수 없습니다\n";
        }
    }*/
}
