package com.charly.market.controller;

import com.charly.market.dto.CategoryDto;
import com.charly.market.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class TestController {

    private final TestService testService;

    @GetMapping("/get-test")
    public ResponseEntity<String> getTest(){
        return ResponseEntity.ok("Test");
    }

    @PostMapping("/category")
    public ResponseEntity<String> createCategory(@RequestBody CategoryDto categoryDto){
        testService.createCategory(categoryDto);
        
        return ResponseEntity.ok("Category");
    }

}
