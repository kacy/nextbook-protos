package com.whetherlabs.whetherlabs.social.v1

import com.whetherlabs.whetherlabs.social.v1.SocialServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for whetherlabs.social.v1.SocialService.
 */
public object SocialServiceGrpcKt {
  public const val SERVICE_NAME: String = SocialServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val followUserMethod: MethodDescriptor<FollowUserRequest, FollowUserResponse>
    @JvmStatic
    get() = SocialServiceGrpc.getFollowUserMethod()

  public val unfollowUserMethod: MethodDescriptor<UnfollowUserRequest, UnfollowUserResponse>
    @JvmStatic
    get() = SocialServiceGrpc.getUnfollowUserMethod()

  public val getFollowingMethod: MethodDescriptor<GetFollowingRequest, GetFollowingResponse>
    @JvmStatic
    get() = SocialServiceGrpc.getGetFollowingMethod()

  public val getFollowersMethod: MethodDescriptor<GetFollowersRequest, GetFollowersResponse>
    @JvmStatic
    get() = SocialServiceGrpc.getGetFollowersMethod()

  public val blockUserMethod: MethodDescriptor<BlockUserRequest, BlockUserResponse>
    @JvmStatic
    get() = SocialServiceGrpc.getBlockUserMethod()

  public val unblockUserMethod: MethodDescriptor<UnblockUserRequest, UnblockUserResponse>
    @JvmStatic
    get() = SocialServiceGrpc.getUnblockUserMethod()

  public val listBlockedUsersMethod:
      MethodDescriptor<ListBlockedUsersRequest, ListBlockedUsersResponse>
    @JvmStatic
    get() = SocialServiceGrpc.getListBlockedUsersMethod()

  public val reportUserMethod: MethodDescriptor<ReportUserRequest, ReportUserResponse>
    @JvmStatic
    get() = SocialServiceGrpc.getReportUserMethod()

  /**
   * A stub for issuing RPCs to a(n) whetherlabs.social.v1.SocialService service as suspending coroutines.
   */
  @StubFor(SocialServiceGrpc::class)
  public class SocialServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<SocialServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): SocialServiceCoroutineStub = SocialServiceCoroutineStub(channel, callOptions)

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
    public suspend fun followUser(request: FollowUserRequest, headers: Metadata = Metadata()): FollowUserResponse = unaryRpc(
      channel,
      SocialServiceGrpc.getFollowUserMethod(),
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
    public suspend fun unfollowUser(request: UnfollowUserRequest, headers: Metadata = Metadata()): UnfollowUserResponse = unaryRpc(
      channel,
      SocialServiceGrpc.getUnfollowUserMethod(),
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
    public suspend fun getFollowing(request: GetFollowingRequest, headers: Metadata = Metadata()): GetFollowingResponse = unaryRpc(
      channel,
      SocialServiceGrpc.getGetFollowingMethod(),
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
    public suspend fun getFollowers(request: GetFollowersRequest, headers: Metadata = Metadata()): GetFollowersResponse = unaryRpc(
      channel,
      SocialServiceGrpc.getGetFollowersMethod(),
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
    public suspend fun blockUser(request: BlockUserRequest, headers: Metadata = Metadata()): BlockUserResponse = unaryRpc(
      channel,
      SocialServiceGrpc.getBlockUserMethod(),
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
    public suspend fun unblockUser(request: UnblockUserRequest, headers: Metadata = Metadata()): UnblockUserResponse = unaryRpc(
      channel,
      SocialServiceGrpc.getUnblockUserMethod(),
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
    public suspend fun listBlockedUsers(request: ListBlockedUsersRequest, headers: Metadata = Metadata()): ListBlockedUsersResponse = unaryRpc(
      channel,
      SocialServiceGrpc.getListBlockedUsersMethod(),
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
    public suspend fun reportUser(request: ReportUserRequest, headers: Metadata = Metadata()): ReportUserResponse = unaryRpc(
      channel,
      SocialServiceGrpc.getReportUserMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the whetherlabs.social.v1.SocialService service based on Kotlin coroutines.
   */
  public abstract class SocialServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for whetherlabs.social.v1.SocialService.FollowUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun followUser(request: FollowUserRequest): FollowUserResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.social.v1.SocialService.FollowUser is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.social.v1.SocialService.UnfollowUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun unfollowUser(request: UnfollowUserRequest): UnfollowUserResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.social.v1.SocialService.UnfollowUser is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.social.v1.SocialService.GetFollowing.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFollowing(request: GetFollowingRequest): GetFollowingResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.social.v1.SocialService.GetFollowing is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.social.v1.SocialService.GetFollowers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFollowers(request: GetFollowersRequest): GetFollowersResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.social.v1.SocialService.GetFollowers is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.social.v1.SocialService.BlockUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun blockUser(request: BlockUserRequest): BlockUserResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.social.v1.SocialService.BlockUser is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.social.v1.SocialService.UnblockUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun unblockUser(request: UnblockUserRequest): UnblockUserResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.social.v1.SocialService.UnblockUser is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.social.v1.SocialService.ListBlockedUsers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listBlockedUsers(request: ListBlockedUsersRequest): ListBlockedUsersResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.social.v1.SocialService.ListBlockedUsers is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.social.v1.SocialService.ReportUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reportUser(request: ReportUserRequest): ReportUserResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.social.v1.SocialService.ReportUser is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SocialServiceGrpc.getFollowUserMethod(),
      implementation = ::followUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SocialServiceGrpc.getUnfollowUserMethod(),
      implementation = ::unfollowUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SocialServiceGrpc.getGetFollowingMethod(),
      implementation = ::getFollowing
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SocialServiceGrpc.getGetFollowersMethod(),
      implementation = ::getFollowers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SocialServiceGrpc.getBlockUserMethod(),
      implementation = ::blockUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SocialServiceGrpc.getUnblockUserMethod(),
      implementation = ::unblockUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SocialServiceGrpc.getListBlockedUsersMethod(),
      implementation = ::listBlockedUsers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = SocialServiceGrpc.getReportUserMethod(),
      implementation = ::reportUser
    )).build()
  }
}
