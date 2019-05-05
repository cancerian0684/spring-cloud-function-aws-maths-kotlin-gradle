package com.shunya.reverse.handler.aws;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.shunya.reverse.domain.NumberInput;
import com.shunya.reverse.domain.NumberOutput;

public class ReverseFunctionHandler extends SpringBootRequestHandler<NumberInput, NumberOutput> {
}
