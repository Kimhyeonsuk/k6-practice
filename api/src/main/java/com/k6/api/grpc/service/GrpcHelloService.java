package com.k6.api.grpc.service;

import com.k6.api.service.HelloService;
import hello.Hello;
import hello.HelloServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class GrpcHelloService extends HelloServiceGrpc.HelloServiceImplBase {
    @Autowired
    HelloService helloService;

    @Override
    public void sayHello(Hello.HelloRequest request, io.grpc.stub.StreamObserver<Hello.HelloResponse> responseObserver) {
        String reply = helloService.sayHello();
        Hello.HelloResponse response = Hello.HelloResponse.newBuilder().setReply(reply).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
