package com.example.jwtauth.controller;

import com.example.jwtauth.service.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Base64;

@RestController
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length()).trim();
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded);
            final String[] values = credentials.split(":", 2);
            if ("user".equals(values[0]) && "pwd".equals(values[1])) {
                String token = jwtService.generateToken(values[0]);
                return ResponseEntity.ok().body("{"token":"" + token + ""}");
            }
        }
        return ResponseEntity.status(401).body("Unauthorized");
    }
}