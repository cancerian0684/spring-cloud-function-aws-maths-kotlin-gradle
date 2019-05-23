package com.shunya.reverse

import org.springframework.stereotype.Service

@Service
class MathService {

    fun reverse(num: Long): Long {
        var num = num
        var sum: Long = 0
        while (num != 0L) {
            val lastDigit = num % 10
            sum = sum * 10 + lastDigit
            num /= 10
        }
        return sum
    }
}
