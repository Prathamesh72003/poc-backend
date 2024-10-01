package com.ideaclick.poc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideaclick.poc.dto.studentDTO;
import com.ideaclick.poc.service.studentService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/poc/student")
public class studentController {
    
    private studentService studentService;

    @PostMapping("")
    public ResponseEntity<studentDTO> postStudent(@RequestBody studentDTO StudentData) {
        return new ResponseEntity<>(studentService.createStudent(StudentData), HttpStatus.OK);
    }
    
}
