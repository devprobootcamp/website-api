package com.devprobpptcamp.websiteapi.controller;

import com.devprobpptcamp.websiteapi.domain.Program;
import com.devprobpptcamp.websiteapi.service.ProgramService;
import com.devprobpptcamp.websiteapi.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    private HomeService homeService;
    private ProgramService programService;

    public HomeController(HomeService homeService, ProgramService programService) {
        this.homeService = homeService;
        this.programService = programService;
    }

    @GetMapping("/home")
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok(homeService.welcome());
    }

    @GetMapping("programs")
    public ResponseEntity<List<Program>> GetPrograms(){
        return ResponseEntity.ok(programService.getProgramList());
    }
}
