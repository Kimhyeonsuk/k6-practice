package hello;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: message/hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "hello.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = hello.Hello.HelloRequest.class,
      responseType = hello.Hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<hello.Hello.HelloRequest, hello.Hello.HelloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = HelloServiceGrpc.getSayHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getSayHelloMethod = HelloServiceGrpc.getSayHelloMethod) == null) {
          HelloServiceGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<hello.Hello.HelloRequest, hello.Hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello.Hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> getLotsOfRepliesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LotsOfReplies",
      requestType = hello.Hello.HelloRequest.class,
      responseType = hello.Hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> getLotsOfRepliesMethod() {
    io.grpc.MethodDescriptor<hello.Hello.HelloRequest, hello.Hello.HelloResponse> getLotsOfRepliesMethod;
    if ((getLotsOfRepliesMethod = HelloServiceGrpc.getLotsOfRepliesMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getLotsOfRepliesMethod = HelloServiceGrpc.getLotsOfRepliesMethod) == null) {
          HelloServiceGrpc.getLotsOfRepliesMethod = getLotsOfRepliesMethod =
              io.grpc.MethodDescriptor.<hello.Hello.HelloRequest, hello.Hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LotsOfReplies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello.Hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("LotsOfReplies"))
              .build();
        }
      }
    }
    return getLotsOfRepliesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> getLotsOfGreetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LotsOfGreetings",
      requestType = hello.Hello.HelloRequest.class,
      responseType = hello.Hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> getLotsOfGreetingsMethod() {
    io.grpc.MethodDescriptor<hello.Hello.HelloRequest, hello.Hello.HelloResponse> getLotsOfGreetingsMethod;
    if ((getLotsOfGreetingsMethod = HelloServiceGrpc.getLotsOfGreetingsMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getLotsOfGreetingsMethod = HelloServiceGrpc.getLotsOfGreetingsMethod) == null) {
          HelloServiceGrpc.getLotsOfGreetingsMethod = getLotsOfGreetingsMethod =
              io.grpc.MethodDescriptor.<hello.Hello.HelloRequest, hello.Hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LotsOfGreetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello.Hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("LotsOfGreetings"))
              .build();
        }
      }
    }
    return getLotsOfGreetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> getBidiHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidiHello",
      requestType = hello.Hello.HelloRequest.class,
      responseType = hello.Hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<hello.Hello.HelloRequest,
      hello.Hello.HelloResponse> getBidiHelloMethod() {
    io.grpc.MethodDescriptor<hello.Hello.HelloRequest, hello.Hello.HelloResponse> getBidiHelloMethod;
    if ((getBidiHelloMethod = HelloServiceGrpc.getBidiHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getBidiHelloMethod = HelloServiceGrpc.getBidiHelloMethod) == null) {
          HelloServiceGrpc.getBidiHelloMethod = getBidiHelloMethod =
              io.grpc.MethodDescriptor.<hello.Hello.HelloRequest, hello.Hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BidiHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  hello.Hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("BidiHello"))
              .build();
        }
      }
    }
    return getBidiHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sayHello(hello.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    default void lotsOfReplies(hello.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLotsOfRepliesMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<hello.Hello.HelloRequest> lotsOfGreetings(
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLotsOfGreetingsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<hello.Hello.HelloRequest> bidiHello(
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidiHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HelloService.
   */
  public static abstract class HelloServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HelloServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(hello.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lotsOfReplies(hello.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getLotsOfRepliesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hello.Hello.HelloRequest> lotsOfGreetings(
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getLotsOfGreetingsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<hello.Hello.HelloRequest> bidiHello(
        io.grpc.stub.StreamObserver<hello.Hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidiHelloMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public hello.Hello.HelloResponse sayHello(hello.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<hello.Hello.HelloResponse> lotsOfReplies(
        hello.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getLotsOfRepliesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HelloService.
   */
  public static final class HelloServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<hello.Hello.HelloResponse> sayHello(
        hello.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_LOTS_OF_REPLIES = 1;
  private static final int METHODID_LOTS_OF_GREETINGS = 2;
  private static final int METHODID_BIDI_HELLO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((hello.Hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<hello.Hello.HelloResponse>) responseObserver);
          break;
        case METHODID_LOTS_OF_REPLIES:
          serviceImpl.lotsOfReplies((hello.Hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<hello.Hello.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOTS_OF_GREETINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.lotsOfGreetings(
              (io.grpc.stub.StreamObserver<hello.Hello.HelloResponse>) responseObserver);
        case METHODID_BIDI_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidiHello(
              (io.grpc.stub.StreamObserver<hello.Hello.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              hello.Hello.HelloRequest,
              hello.Hello.HelloResponse>(
                service, METHODID_SAY_HELLO)))
        .addMethod(
          getLotsOfRepliesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              hello.Hello.HelloRequest,
              hello.Hello.HelloResponse>(
                service, METHODID_LOTS_OF_REPLIES)))
        .addMethod(
          getLotsOfGreetingsMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              hello.Hello.HelloRequest,
              hello.Hello.HelloResponse>(
                service, METHODID_LOTS_OF_GREETINGS)))
        .addMethod(
          getBidiHelloMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              hello.Hello.HelloRequest,
              hello.Hello.HelloResponse>(
                service, METHODID_BIDI_HELLO)))
        .build();
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return hello.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HelloServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getLotsOfRepliesMethod())
              .addMethod(getLotsOfGreetingsMethod())
              .addMethod(getBidiHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
