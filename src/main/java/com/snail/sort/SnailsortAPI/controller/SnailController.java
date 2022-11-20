package com.snail.sort.SnailsortAPI.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.snail.sort.SnailsortAPI.model.SnailArrays;
import com.snail.sort.SnailsortAPI.service.SnailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.snail.sort.SnailsortAPI.service.SnailService.*;

@RestController
@RequestMapping("/api/v0.2.0")
public class SnailController {

    // Constructor
    public SnailController(List<SnailArrays> list) {
        this.list = list;
    }

    // List of SnailArrays Object
    final List<SnailArrays> list;
    private SnailArrays snailArrays;


    // Get body sample
    @GetMapping("/getsample")
    public SnailArrays example(){
        SnailArrays ex = getSnailArray();
        list.add(ex);
        return ex;
    }

    // Method to provide all arrays in the list
    @GetMapping("/arrays")
    public List<SnailArrays> theList(){
        // Provide a template of body request
        // First endpoint to GET all arrays
        return list;
    }
}
