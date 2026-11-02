package lab.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: delivery.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeliveryServiceGrpc {

  private DeliveryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "quickbite.DeliveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lab.grpc.EtaRequest,
      lab.grpc.EtaReply> getGetEtaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEta",
      requestType = lab.grpc.EtaRequest.class,
      responseType = lab.grpc.EtaReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab.grpc.EtaRequest,
      lab.grpc.EtaReply> getGetEtaMethod() {
    io.grpc.MethodDescriptor<lab.grpc.EtaRequest, lab.grpc.EtaReply> getGetEtaMethod;
    if ((getGetEtaMethod = DeliveryServiceGrpc.getGetEtaMethod) == null) {
      synchronized (DeliveryServiceGrpc.class) {
        if ((getGetEtaMethod = DeliveryServiceGrpc.getGetEtaMethod) == null) {
          DeliveryServiceGrpc.getGetEtaMethod = getGetEtaMethod =
              io.grpc.MethodDescriptor.<lab.grpc.EtaRequest, lab.grpc.EtaReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.grpc.EtaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.grpc.EtaReply.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryServiceMethodDescriptorSupplier("GetEta"))
              .build();
        }
      }
    }
    return getGetEtaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.grpc.TrackRequest,
      lab.grpc.RiderLocation> getTrackRiderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackRider",
      requestType = lab.grpc.TrackRequest.class,
      responseType = lab.grpc.RiderLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<lab.grpc.TrackRequest,
      lab.grpc.RiderLocation> getTrackRiderMethod() {
    io.grpc.MethodDescriptor<lab.grpc.TrackRequest, lab.grpc.RiderLocation> getTrackRiderMethod;
    if ((getTrackRiderMethod = DeliveryServiceGrpc.getTrackRiderMethod) == null) {
      synchronized (DeliveryServiceGrpc.class) {
        if ((getTrackRiderMethod = DeliveryServiceGrpc.getTrackRiderMethod) == null) {
          DeliveryServiceGrpc.getTrackRiderMethod = getTrackRiderMethod =
              io.grpc.MethodDescriptor.<lab.grpc.TrackRequest, lab.grpc.RiderLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackRider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.grpc.TrackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.grpc.RiderLocation.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryServiceMethodDescriptorSupplier("TrackRider"))
              .build();
        }
      }
    }
    return getTrackRiderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab.grpc.RiderLocation,
      lab.grpc.RouteSummary> getUploadRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadRoute",
      requestType = lab.grpc.RiderLocation.class,
      responseType = lab.grpc.RouteSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<lab.grpc.RiderLocation,
      lab.grpc.RouteSummary> getUploadRouteMethod() {
    io.grpc.MethodDescriptor<lab.grpc.RiderLocation, lab.grpc.RouteSummary> getUploadRouteMethod;
    if ((getUploadRouteMethod = DeliveryServiceGrpc.getUploadRouteMethod) == null) {
      synchronized (DeliveryServiceGrpc.class) {
        if ((getUploadRouteMethod = DeliveryServiceGrpc.getUploadRouteMethod) == null) {
          DeliveryServiceGrpc.getUploadRouteMethod = getUploadRouteMethod =
              io.grpc.MethodDescriptor.<lab.grpc.RiderLocation, lab.grpc.RouteSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.grpc.RiderLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab.grpc.RouteSummary.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryServiceMethodDescriptorSupplier("UploadRoute"))
              .build();
        }
      }
    }
    return getUploadRouteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeliveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceStub>() {
        @java.lang.Override
        public DeliveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceStub(channel, callOptions);
        }
      };
    return DeliveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeliveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceBlockingStub>() {
        @java.lang.Override
        public DeliveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceBlockingStub(channel, callOptions);
        }
      };
    return DeliveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeliveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceFutureStub>() {
        @java.lang.Override
        public DeliveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceFutureStub(channel, callOptions);
        }
      };
    return DeliveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary: one request, one response. Feels like calling a local method.
     * </pre>
     */
    default void getEta(lab.grpc.EtaRequest request,
        io.grpc.stub.StreamObserver<lab.grpc.EtaReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEtaMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server streaming: one request, a stream of responses (live rider location).
     * </pre>
     */
    default void trackRider(lab.grpc.TrackRequest request,
        io.grpc.stub.StreamObserver<lab.grpc.RiderLocation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrackRiderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client streaming (stretch): the rider app streams GPS points, server replies once at the end.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<lab.grpc.RiderLocation> uploadRoute(
        io.grpc.stub.StreamObserver<lab.grpc.RouteSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadRouteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DeliveryService.
   */
  public static abstract class DeliveryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DeliveryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DeliveryService.
   */
  public static final class DeliveryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DeliveryServiceStub> {
    private DeliveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary: one request, one response. Feels like calling a local method.
     * </pre>
     */
    public void getEta(lab.grpc.EtaRequest request,
        io.grpc.stub.StreamObserver<lab.grpc.EtaReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEtaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server streaming: one request, a stream of responses (live rider location).
     * </pre>
     */
    public void trackRider(lab.grpc.TrackRequest request,
        io.grpc.stub.StreamObserver<lab.grpc.RiderLocation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getTrackRiderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client streaming (stretch): the rider app streams GPS points, server replies once at the end.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<lab.grpc.RiderLocation> uploadRoute(
        io.grpc.stub.StreamObserver<lab.grpc.RouteSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadRouteMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DeliveryService.
   */
  public static final class DeliveryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DeliveryServiceBlockingStub> {
    private DeliveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary: one request, one response. Feels like calling a local method.
     * </pre>
     */
    public lab.grpc.EtaReply getEta(lab.grpc.EtaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEtaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server streaming: one request, a stream of responses (live rider location).
     * </pre>
     */
    public java.util.Iterator<lab.grpc.RiderLocation> trackRider(
        lab.grpc.TrackRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getTrackRiderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DeliveryService.
   */
  public static final class DeliveryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DeliveryServiceFutureStub> {
    private DeliveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary: one request, one response. Feels like calling a local method.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<lab.grpc.EtaReply> getEta(
        lab.grpc.EtaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEtaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ETA = 0;
  private static final int METHODID_TRACK_RIDER = 1;
  private static final int METHODID_UPLOAD_ROUTE = 2;

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
        case METHODID_GET_ETA:
          serviceImpl.getEta((lab.grpc.EtaRequest) request,
              (io.grpc.stub.StreamObserver<lab.grpc.EtaReply>) responseObserver);
          break;
        case METHODID_TRACK_RIDER:
          serviceImpl.trackRider((lab.grpc.TrackRequest) request,
              (io.grpc.stub.StreamObserver<lab.grpc.RiderLocation>) responseObserver);
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
        case METHODID_UPLOAD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadRoute(
              (io.grpc.stub.StreamObserver<lab.grpc.RouteSummary>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetEtaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lab.grpc.EtaRequest,
              lab.grpc.EtaReply>(
                service, METHODID_GET_ETA)))
        .addMethod(
          getTrackRiderMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              lab.grpc.TrackRequest,
              lab.grpc.RiderLocation>(
                service, METHODID_TRACK_RIDER)))
        .addMethod(
          getUploadRouteMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              lab.grpc.RiderLocation,
              lab.grpc.RouteSummary>(
                service, METHODID_UPLOAD_ROUTE)))
        .build();
  }

  private static abstract class DeliveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeliveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lab.grpc.Delivery.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeliveryService");
    }
  }

  private static final class DeliveryServiceFileDescriptorSupplier
      extends DeliveryServiceBaseDescriptorSupplier {
    DeliveryServiceFileDescriptorSupplier() {}
  }

  private static final class DeliveryServiceMethodDescriptorSupplier
      extends DeliveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DeliveryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DeliveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeliveryServiceFileDescriptorSupplier())
              .addMethod(getGetEtaMethod())
              .addMethod(getTrackRiderMethod())
              .addMethod(getUploadRouteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
