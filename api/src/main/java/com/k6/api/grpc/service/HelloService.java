package com.k6.api.grpc.service;

import hello.Hello;
import hello.HelloServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void sayHello(Hello.HelloRequest request, io.grpc.stub.StreamObserver<Hello.HelloResponse> responseObserver) {
        super.sayHello(request, responseObserver);
    }
}
