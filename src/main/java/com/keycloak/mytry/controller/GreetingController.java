package com.keycloak.mytry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    @GetMapping("admin/try")
    public String getAdminOk() {
        return "OK";
    }

    @GetMapping("user/try")
    public String getUserOk() {
        return "OK";
    }

}
