package com.mkk.werehouse.controller;

import com.mkk.werehouse.dto.ResponseResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/login")
    public ResponseResult<String> login() {
        return ResponseResult.success("登录成功");
    }

    @PostMapping("/registry")
    public ResponseResult<String> registry() {
        return ResponseResult.success("注册成功");
    }

    @GetMapping("/logout")
    public ResponseResult<String> logout() {
        return ResponseResult.success("登出成功");
    }
}
