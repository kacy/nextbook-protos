package com.whetherlabs.whetherlabs.user.v1

import com.whetherlabs.whetherlabs.user.v1.UserServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for whetherlabs.user.v1.UserService.
 */
public object UserServiceGrpcKt {
  public const val SERVICE_NAME: String = UserServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getProfileMethod: MethodDescriptor<GetProfileRequest, GetProfileResponse>
    @JvmStatic
    get() = UserServiceGrpc.getGetProfileMethod()

  public val updateProfileMethod: MethodDescriptor<UpdateProfileRequest, UpdateProfileResponse>
    @JvmStatic
    get() = UserServiceGrpc.getUpdateProfileMethod()

  public val getPublicProfileMethod:
      MethodDescriptor<GetPublicProfileRequest, GetPublicProfileResponse>
    @JvmStatic
    get() = UserServiceGrpc.getGetPublicProfileMethod()

  public val uploadContactsMethod: MethodDescriptor<UploadContactsRequest, UploadContactsResponse>
    @JvmStatic
    get() = UserServiceGrpc.getUploadContactsMethod()

  public val claimPhoneNumberMethod:
      MethodDescriptor<ClaimPhoneNumberRequest, ClaimPhoneNumberResponse>
    @JvmStatic
    get() = UserServiceGrpc.getClaimPhoneNumberMethod()

  public val requestAccountDeletionMethod:
      MethodDescriptor<RequestAccountDeletionRequest, RequestAccountDeletionResponse>
    @JvmStatic
    get() = UserServiceGrpc.getRequestAccountDeletionMethod()

  public val confirmAccountDeletionMethod:
      MethodDescriptor<ConfirmAccountDeletionRequest, ConfirmAccountDeletionResponse>
    @JvmStatic
    get() = UserServiceGrpc.getConfirmAccountDeletionMethod()

  /**
   * A stub for issuing RPCs to a(n) whetherlabs.user.v1.UserService service as suspending coroutines.
   */
  @StubFor(UserServiceGrpc::class)
  public class UserServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<UserServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): UserServiceCoroutineStub = UserServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getProfile(request: GetProfileRequest, headers: Metadata = Metadata()): GetProfileResponse = unaryRpc(
      channel,
      UserServiceGrpc.getGetProfileMethod(),
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
    public suspend fun updateProfile(request: UpdateProfileRequest, headers: Metadata = Metadata()): UpdateProfileResponse = unaryRpc(
      channel,
      UserServiceGrpc.getUpdateProfileMethod(),
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
    public suspend fun getPublicProfile(request: GetPublicProfileRequest, headers: Metadata = Metadata()): GetPublicProfileResponse = unaryRpc(
      channel,
      UserServiceGrpc.getGetPublicProfileMethod(),
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
    public suspend fun uploadContacts(request: UploadContactsRequest, headers: Metadata = Metadata()): UploadContactsResponse = unaryRpc(
      channel,
      UserServiceGrpc.getUploadContactsMethod(),
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
    public suspend fun claimPhoneNumber(request: ClaimPhoneNumberRequest, headers: Metadata = Metadata()): ClaimPhoneNumberResponse = unaryRpc(
      channel,
      UserServiceGrpc.getClaimPhoneNumberMethod(),
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
    public suspend fun requestAccountDeletion(request: RequestAccountDeletionRequest, headers: Metadata = Metadata()): RequestAccountDeletionResponse = unaryRpc(
      channel,
      UserServiceGrpc.getRequestAccountDeletionMethod(),
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
    public suspend fun confirmAccountDeletion(request: ConfirmAccountDeletionRequest, headers: Metadata = Metadata()): ConfirmAccountDeletionResponse = unaryRpc(
      channel,
      UserServiceGrpc.getConfirmAccountDeletionMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the whetherlabs.user.v1.UserService service based on Kotlin coroutines.
   */
  public abstract class UserServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for whetherlabs.user.v1.UserService.GetProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getProfile(request: GetProfileRequest): GetProfileResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.user.v1.UserService.GetProfile is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.user.v1.UserService.UpdateProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateProfile(request: UpdateProfileRequest): UpdateProfileResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.user.v1.UserService.UpdateProfile is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.user.v1.UserService.GetPublicProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getPublicProfile(request: GetPublicProfileRequest): GetPublicProfileResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.user.v1.UserService.GetPublicProfile is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.user.v1.UserService.UploadContacts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadContacts(request: UploadContactsRequest): UploadContactsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.user.v1.UserService.UploadContacts is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.user.v1.UserService.ClaimPhoneNumber.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun claimPhoneNumber(request: ClaimPhoneNumberRequest): ClaimPhoneNumberResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.user.v1.UserService.ClaimPhoneNumber is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.user.v1.UserService.RequestAccountDeletion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun requestAccountDeletion(request: RequestAccountDeletionRequest): RequestAccountDeletionResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.user.v1.UserService.RequestAccountDeletion is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.user.v1.UserService.ConfirmAccountDeletion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun confirmAccountDeletion(request: ConfirmAccountDeletionRequest): ConfirmAccountDeletionResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.user.v1.UserService.ConfirmAccountDeletion is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getGetProfileMethod(),
      implementation = ::getProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getUpdateProfileMethod(),
      implementation = ::updateProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getGetPublicProfileMethod(),
      implementation = ::getPublicProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getUploadContactsMethod(),
      implementation = ::uploadContacts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getClaimPhoneNumberMethod(),
      implementation = ::claimPhoneNumber
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getRequestAccountDeletionMethod(),
      implementation = ::requestAccountDeletion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserServiceGrpc.getConfirmAccountDeletionMethod(),
      implementation = ::confirmAccountDeletion
    )).build()
  }
}
