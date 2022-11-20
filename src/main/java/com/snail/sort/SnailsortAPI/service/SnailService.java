package com.snail.sort.SnailsortAPI.service;

import com.snail.sort.SnailsortAPI.model.SnailArrays;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

// This class provides comportment with specials services that set a 2d array to test algorithm & then the method
// which return the array elements arranged from outermost elements to the middle element, traveling clockwise.
@Component
public class SnailService {

    // A logger to see objects attributes in the console
    // private static final Logger logger = (Logger) LoggerFactory.getLogger(SnailService.class);

    // This is for the testSnailArrays() test method
    public SnailArrays getSnailArray(){
        SnailArrays sa = new SnailArrays();
        return sa;
    }
}
