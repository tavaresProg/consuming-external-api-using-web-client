package com.tavaresProg.webclientstudies.controller;

import com.tavaresProg.webclientstudies.model.ApiModel;
import com.tavaresProg.webclientstudies.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ApiService numbersAPIServiceImplementation;

    @GetMapping("trivia/{number}")
    public ResponseEntity<String> getNumberTrivia(@PathVariable int number) {

        ApiModel numbersAPI = this.numbersAPIServiceImplementation.getNumberTriviaService(number);
        return ResponseEntity.ok(numbersAPI.getText());

    }

    @GetMapping("math/{number}")
    public ResponseEntity<String> getNumberTriviaWithMath(@PathVariable int number) {

        ApiModel numbersAPI = this.numbersAPIServiceImplementation.getNumberTriviaWithMathService(number);
        return ResponseEntity.ok(numbersAPI.getText());

    }

    @GetMapping("year/{number}")
    public ResponseEntity<String> getNumberYear(@PathVariable int number) {

        ApiModel numbersAPI = this.numbersAPIServiceImplementation.getNumberYearService(number);
        return ResponseEntity.ok(numbersAPI.getText());

    }
}
