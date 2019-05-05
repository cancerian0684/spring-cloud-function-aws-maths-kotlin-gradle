package com.shunya.reverse.service;

import com.shunya.reverse.domain.NumberInput;
import com.shunya.reverse.domain.NumberOutput;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ReverseFunction implements Function<NumberInput, NumberOutput> {

    private final MathService mathService;

    public ReverseFunction(final MathService mathService) {
        this.mathService = mathService;
    }

    @Override
    public NumberOutput apply(final NumberInput input) {
        return new NumberOutput(mathService.reverse(input.getInput()));
    }
}
