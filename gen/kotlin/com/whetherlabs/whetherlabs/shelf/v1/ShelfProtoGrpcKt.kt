package com.whetherlabs.whetherlabs.shelf.v1

import com.whetherlabs.whetherlabs.shelf.v1.ShelfServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for whetherlabs.shelf.v1.ShelfService.
 */
public object ShelfServiceGrpcKt {
  public const val SERVICE_NAME: String = ShelfServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listShelvesMethod: MethodDescriptor<ListShelvesRequest, ListShelvesResponse>
    @JvmStatic
    get() = ShelfServiceGrpc.getListShelvesMethod()

  public val getShelfMethod: MethodDescriptor<GetShelfRequest, GetShelfResponse>
    @JvmStatic
    get() = ShelfServiceGrpc.getGetShelfMethod()

  public val createShelfMethod: MethodDescriptor<CreateShelfRequest, CreateShelfResponse>
    @JvmStatic
    get() = ShelfServiceGrpc.getCreateShelfMethod()

  public val updateShelfMethod: MethodDescriptor<UpdateShelfRequest, UpdateShelfResponse>
    @JvmStatic
    get() = ShelfServiceGrpc.getUpdateShelfMethod()

  public val deleteShelfMethod: MethodDescriptor<DeleteShelfRequest, DeleteShelfResponse>
    @JvmStatic
    get() = ShelfServiceGrpc.getDeleteShelfMethod()

  public val addToShelfMethod: MethodDescriptor<AddToShelfRequest, AddToShelfResponse>
    @JvmStatic
    get() = ShelfServiceGrpc.getAddToShelfMethod()

  public val removeFromShelfMethod:
      MethodDescriptor<RemoveFromShelfRequest, RemoveFromShelfResponse>
    @JvmStatic
    get() = ShelfServiceGrpc.getRemoveFromShelfMethod()

  public val moveToShelfMethod: MethodDescriptor<MoveToShelfRequest, MoveToShelfResponse>
    @JvmStatic
    get() = ShelfServiceGrpc.getMoveToShelfMethod()

  public val getBookShelvesMethod: MethodDescriptor<GetBookShelvesRequest, GetBookShelvesResponse>
    @JvmStatic
    get() = ShelfServiceGrpc.getGetBookShelvesMethod()

  /**
   * A stub for issuing RPCs to a(n) whetherlabs.shelf.v1.ShelfService service as suspending coroutines.
   */
  @StubFor(ShelfServiceGrpc::class)
  public class ShelfServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ShelfServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ShelfServiceCoroutineStub = ShelfServiceCoroutineStub(channel, callOptions)

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
    public suspend fun listShelves(request: ListShelvesRequest, headers: Metadata = Metadata()): ListShelvesResponse = unaryRpc(
      channel,
      ShelfServiceGrpc.getListShelvesMethod(),
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
    public suspend fun getShelf(request: GetShelfRequest, headers: Metadata = Metadata()): GetShelfResponse = unaryRpc(
      channel,
      ShelfServiceGrpc.getGetShelfMethod(),
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
    public suspend fun createShelf(request: CreateShelfRequest, headers: Metadata = Metadata()): CreateShelfResponse = unaryRpc(
      channel,
      ShelfServiceGrpc.getCreateShelfMethod(),
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
    public suspend fun updateShelf(request: UpdateShelfRequest, headers: Metadata = Metadata()): UpdateShelfResponse = unaryRpc(
      channel,
      ShelfServiceGrpc.getUpdateShelfMethod(),
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
    public suspend fun deleteShelf(request: DeleteShelfRequest, headers: Metadata = Metadata()): DeleteShelfResponse = unaryRpc(
      channel,
      ShelfServiceGrpc.getDeleteShelfMethod(),
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
    public suspend fun addToShelf(request: AddToShelfRequest, headers: Metadata = Metadata()): AddToShelfResponse = unaryRpc(
      channel,
      ShelfServiceGrpc.getAddToShelfMethod(),
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
    public suspend fun removeFromShelf(request: RemoveFromShelfRequest, headers: Metadata = Metadata()): RemoveFromShelfResponse = unaryRpc(
      channel,
      ShelfServiceGrpc.getRemoveFromShelfMethod(),
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
    public suspend fun moveToShelf(request: MoveToShelfRequest, headers: Metadata = Metadata()): MoveToShelfResponse = unaryRpc(
      channel,
      ShelfServiceGrpc.getMoveToShelfMethod(),
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
    public suspend fun getBookShelves(request: GetBookShelvesRequest, headers: Metadata = Metadata()): GetBookShelvesResponse = unaryRpc(
      channel,
      ShelfServiceGrpc.getGetBookShelvesMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the whetherlabs.shelf.v1.ShelfService service based on Kotlin coroutines.
   */
  public abstract class ShelfServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for whetherlabs.shelf.v1.ShelfService.ListShelves.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listShelves(request: ListShelvesRequest): ListShelvesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.shelf.v1.ShelfService.ListShelves is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.shelf.v1.ShelfService.GetShelf.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getShelf(request: GetShelfRequest): GetShelfResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.shelf.v1.ShelfService.GetShelf is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.shelf.v1.ShelfService.CreateShelf.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createShelf(request: CreateShelfRequest): CreateShelfResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.shelf.v1.ShelfService.CreateShelf is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.shelf.v1.ShelfService.UpdateShelf.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateShelf(request: UpdateShelfRequest): UpdateShelfResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.shelf.v1.ShelfService.UpdateShelf is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.shelf.v1.ShelfService.DeleteShelf.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteShelf(request: DeleteShelfRequest): DeleteShelfResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.shelf.v1.ShelfService.DeleteShelf is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.shelf.v1.ShelfService.AddToShelf.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addToShelf(request: AddToShelfRequest): AddToShelfResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.shelf.v1.ShelfService.AddToShelf is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.shelf.v1.ShelfService.RemoveFromShelf.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeFromShelf(request: RemoveFromShelfRequest): RemoveFromShelfResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.shelf.v1.ShelfService.RemoveFromShelf is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.shelf.v1.ShelfService.MoveToShelf.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun moveToShelf(request: MoveToShelfRequest): MoveToShelfResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.shelf.v1.ShelfService.MoveToShelf is unimplemented"))

    /**
     * Returns the response to an RPC for whetherlabs.shelf.v1.ShelfService.GetBookShelves.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getBookShelves(request: GetBookShelvesRequest): GetBookShelvesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method whetherlabs.shelf.v1.ShelfService.GetBookShelves is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShelfServiceGrpc.getListShelvesMethod(),
      implementation = ::listShelves
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShelfServiceGrpc.getGetShelfMethod(),
      implementation = ::getShelf
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShelfServiceGrpc.getCreateShelfMethod(),
      implementation = ::createShelf
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShelfServiceGrpc.getUpdateShelfMethod(),
      implementation = ::updateShelf
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShelfServiceGrpc.getDeleteShelfMethod(),
      implementation = ::deleteShelf
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShelfServiceGrpc.getAddToShelfMethod(),
      implementation = ::addToShelf
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShelfServiceGrpc.getRemoveFromShelfMethod(),
      implementation = ::removeFromShelf
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShelfServiceGrpc.getMoveToShelfMethod(),
      implementation = ::moveToShelf
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShelfServiceGrpc.getGetBookShelvesMethod(),
      implementation = ::getBookShelves
    )).build()
  }
}
