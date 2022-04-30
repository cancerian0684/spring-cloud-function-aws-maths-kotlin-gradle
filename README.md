# Spring cloud function aws lambda

An example repository for an article about running Spring Cloud Functions on AWS Lambda.


Follow this blog for description:

https://www.javacodemonk.com/spring-cloud-function-for-aws-lambda-with-java-7fa84cf6

## Specify AWS Handler
When asked about handler you specify the handler which is a generic request handler:

    org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest
