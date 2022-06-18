package com.eim.cloud.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping("/fallback")
public class GatewayController {

    @GetMapping("/userServiceFallback")
    public ResponseEntity <String> userServiceFallback(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("User service is not available. Please contact production support team.");
    }

    @GetMapping("/departmentServiceFallback")
    public ResponseEntity <String> departmentServiceFallback(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Department service is not available. Please contact production support team.");
    }

}