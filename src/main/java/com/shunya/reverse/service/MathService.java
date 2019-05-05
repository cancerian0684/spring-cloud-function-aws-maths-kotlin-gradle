package com.shunya.reverse.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    
    public long reverse(long num) {
        long sum = 0;
        while (num != 0) {
            long lastDigit = (num % 10);
            sum = (sum * 10) + lastDigit;
            num = num / 10;
        }
        return sum;
    }
}
