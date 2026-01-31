package com.whetherlabs.whetherlabs.review.v1

import com.whetherlabs.whetherlabs.review.v1.ReviewServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for whetherlabs.review.v1.ReviewService.
 */
public object ReviewServiceGrpcKt {
  public const val SERVICE_NAME: String = ReviewServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val rateBookMethod: MethodDescriptor<RateBookRequest, RateBookResponse>
    @JvmStatic
    get() = ReviewServiceGrpc.getRateBookMethod()

  public val reviewBookMethod: MethodDescriptor<ReviewBookRequest, ReviewBookResponse>
    @JvmStatic
    get() = ReviewServiceGrpc.getReviewBookMethod()

  public val getMyReviewMethod: MethodDescriptor<GetMyReviewRequest, GetMyReviewResponse>
    @JvmStatic
    get() = ReviewServiceGrpc.getGetMyReviewMethod()

  public val deleteReviewMethod: MethodDescriptor<DeleteReviewRequest, DeleteReviewResponse>
    @JvmStatic
    get() = ReviewServiceGrpc.getDeleteReviewMethod()

  public val getBookReviewsMethod: MethodDescriptor<GetBookReviewsRequest, GetBookReviewsResponse>
    @JvmStatic
    get() = ReviewServiceGrpc.getGetBookReviewsMethod()

  public val getUserReviewsMethod: MethodDescriptor<GetUserReviewsRequest, GetUserReviewsResponse>
    @JvmStatic
    get() = ReviewServiceGrpc.getGetUserReviewsMethod()

  /**
   * A stub for issuing RPCs to a(n) whetherlabs.review.v1.ReviewService service as suspending coroutines.
   */
  @StubFor(ReviewServiceGrpc::class)
  public class ReviewServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ReviewServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ReviewServiceCoroutineStub = ReviewServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun rateBook(request: RateBookRequest, headers: Metadata = Metadata()): RateBookResponse = unaryRpc(
      channel,
      ReviewServiceGrpc.getRateBookMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun reviewBook(request: ReviewBookRequest, headers: Metadata = Metadata()): ReviewBookResponse = unaryRpc(
      channel,
      ReviewServiceGrpc.getReviewBookMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getMyReview(request: GetMyReviewRequest, headers: Metadata = Metadata()): GetMyReviewResponse = unaryRpc(
      channel,
      ReviewServiceGrpc.getGetMyReviewMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteReview(request: DeleteReviewRequest, headers: Metadata = Metadata()): DeleteReviewResponse = unaryRpc(
      channel,
      ReviewServiceGrpc.getDeleteReviewMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getBookReviews(request: GetBookReviewsRequest, headers: Metadata = Metadata()): GetBookReviewsResponse = unaryRpc(
      channel,
      ReviewServiceGrpc.getGetBookReviewsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getUserReviews(request: GetUserReviewsRequest, headers: Metadata = Metadata()): GetUserReviewsResponse = unaryRpc(
      channel,
      ReviewServiceGrpc.getGetUserReviewsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the whetherlabs.review.v1.ReviewService service based on Kotlin coroutines.
   */
  public abstract class ReviewServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for whetherlabs.review.v1.ReviewService.RateBook.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rateBook(request: RateBookRequest): RateBookResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.review.v1.ReviewService.RateBook is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.review.v1.ReviewService.ReviewBook.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reviewBook(request: ReviewBookRequest): ReviewBookResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.review.v1.ReviewService.ReviewBook is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.review.v1.ReviewService.GetMyReview.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMyReview(request: GetMyReviewRequest): GetMyReviewResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.review.v1.ReviewService.GetMyReview is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.review.v1.ReviewService.DeleteReview.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteReview(request: DeleteReviewRequest): DeleteReviewResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.review.v1.ReviewService.DeleteReview is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.review.v1.ReviewService.GetBookReviews.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getBookReviews(request: GetBookReviewsRequest): GetBookReviewsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.review.v1.ReviewService.GetBookReviews is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.review.v1.ReviewService.GetUserReviews.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getUserReviews(request: GetUserReviewsRequest): GetUserReviewsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.review.v1.ReviewService.GetUserReviews is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReviewServiceGrpc.getRateBookMethod(),
      implementation = ::rateBook
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReviewServiceGrpc.getReviewBookMethod(),
      implementation = ::reviewBook
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReviewServiceGrpc.getGetMyReviewMethod(),
      implementation = ::getMyReview
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReviewServiceGrpc.getDeleteReviewMethod(),
      implementation = ::deleteReview
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReviewServiceGrpc.getGetBookReviewsMethod(),
      implementation = ::getBookReviews
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ReviewServiceGrpc.getGetUserReviewsMethod(),
      implementation = ::getUserReviews
    )).build()
  }
}
