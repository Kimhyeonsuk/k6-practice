package com.k6.api.config;

import com.k6.api.grpc.service.GrpcHelloService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class GrpcServerConfig {
    private static final Logger logger = LoggerFactory.getLogger(GrpcServerConfig.class);

    @Autowired
    private GrpcHelloService helloService;

    private Server server;

    @Value("${grpc.server.port}")
    private int port;

    @PostConstruct
    public void startServer() throws IOException {
        server = ServerBuilder
                .forPort(port)
                .addService(helloService)  // Your gRPC service implementation
                .build();

        server.start();
        logger.info("gRPC server started on port {}", port);
        logger.info("gRPC service name: {}", helloService.getClass().getSimpleName());
    }

    @PreDestroy
    public void stopServer() {
        if (server != null) {
            server.shutdown();
        }
        logger.info("gRPC server stopped");
    }
}