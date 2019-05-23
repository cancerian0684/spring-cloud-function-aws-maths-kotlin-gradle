package com.shunya.reverse

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler

class Handler : SpringBootRequestHandler<NumberInput, NumberOutput>(LambdaApp::class.java)