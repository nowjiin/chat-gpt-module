package com.example.chatgptmodule.controller;

import com.example.chatgptmodule.service.GPTService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GPTController {
    private final GPTService gptService;

    @PostMapping("/send-gpt")
    public ResponseEntity<Map<String, Object>> getGptResponse(@RequestBody Map<String, String> request) {
        String prompt = request.get("prompt");
        Map<String, Object> response = gptService.getChatResponse(prompt);
        return ResponseEntity.ok(response);
    }
}