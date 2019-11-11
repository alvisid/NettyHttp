//package example.time;
//
//import io.netty.buffer.ByteBuf;
//import io.netty.buffer.ByteBufAllocator;
//import io.netty.channel.*;
//import io.netty.util.Attribute;
//import io.netty.util.AttributeKey;
//import io.netty.util.concurrent.EventExecutor;
//
//import java.net.SocketAddress;
//
//public class TimeServerHandler implements ChannelHandlerContext {
//
////    @Override
//    public void channelActive(final ChannelHandlerContext ctx) {//1
//        final ByteBuf time = ctx.alloc().buffer(4); //2
//        time.writeInt((int) (System.currentTimeMillis() / 1000L + 2208988800L));
//
//        final ChannelFuture f = ctx.writeAndFlush(time); //3
//        f.addListener(new ChannelFutureListener() {
//
//            @Override
//            public void operationComplete(ChannelFuture future) {
//                assert f == future;
//                ctx.close();
//            }
//        }); //4
//
//    }
//
////    @Override
//    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
//        cause.printStackTrace();
//        ctx.close();
//    }
//
//    public Channel channel() {
//        return null;
//    }
//
//    public EventExecutor executor() {
//        return null;
//    }
//
//    public String name() {
//        return null;
//    }
//
//    public ChannelHandler handler() {
//        return null;
//    }
//
//    public boolean isRemoved() {
//        return false;
//    }
//
//    public ChannelHandlerContext fireChannelRegistered() {
//        return null;
//    }
//
//    public ChannelHandlerContext fireChannelUnregistered() {
//        return null;
//    }
//
//    public ChannelHandlerContext fireChannelActive() {
//        return null;
//    }
//
//    public ChannelHandlerContext fireChannelInactive() {
//        return null;
//    }
//
//    public ChannelHandlerContext fireExceptionCaught(Throwable throwable) {
//        return null;
//    }
//
//    public ChannelHandlerContext fireUserEventTriggered(Object o) {
//        return null;
//    }
//
//    public ChannelHandlerContext fireChannelRead(Object o) {
//        return null;
//    }
//
//    public ChannelHandlerContext fireChannelReadComplete() {
//        return null;
//    }
//
//    public ChannelHandlerContext fireChannelWritabilityChanged() {
//        return null;
//    }
//
//    public ChannelFuture bind(SocketAddress socketAddress) {
//        return null;
//    }
//
//    public ChannelFuture connect(SocketAddress socketAddress) {
//        return null;
//    }
//
//    public ChannelFuture connect(SocketAddress socketAddress, SocketAddress socketAddress1) {
//        return null;
//    }
//
//    public ChannelFuture disconnect() {
//        return null;
//    }
//
//    public ChannelFuture close() {
//        return null;
//    }
//
//    public ChannelFuture deregister() {
//        return null;
//    }
//
//    public ChannelFuture bind(SocketAddress socketAddress, ChannelPromise channelPromise) {
//        return null;
//    }
//
//    public ChannelFuture connect(SocketAddress socketAddress, ChannelPromise channelPromise) {
//        return null;
//    }
//
//    public ChannelFuture connect(SocketAddress socketAddress, SocketAddress socketAddress1, ChannelPromise channelPromise) {
//        return null;
//    }
//
//    public ChannelFuture disconnect(ChannelPromise channelPromise) {
//        return null;
//    }
//
//    public ChannelFuture close(ChannelPromise channelPromise) {
//        return null;
//    }
//
//    public ChannelFuture deregister(ChannelPromise channelPromise) {
//        return null;
//    }
//
//    public ChannelHandlerContext read() {
//        return null;
//    }
//
//    public ChannelFuture write(Object o) {
//        return null;
//    }
//
//    public ChannelFuture write(Object o, ChannelPromise channelPromise) {
//        return null;
//    }
//
//    public ChannelHandlerContext flush() {
//        return null;
//    }
//
//    public ChannelFuture writeAndFlush(Object o, ChannelPromise channelPromise) {
//        return null;
//    }
//
//    public ChannelFuture writeAndFlush(Object o) {
//        return null;
//    }
//
//    public ChannelPromise newPromise() {
//        return null;
//    }
//
//    public ChannelProgressivePromise newProgressivePromise() {
//        return null;
//    }
//
//    public ChannelFuture newSucceededFuture() {
//        return null;
//    }
//
//    public ChannelFuture newFailedFuture(Throwable throwable) {
//        return null;
//    }
//
//    public ChannelPromise voidPromise() {
//        return null;
//    }
//
//    public ChannelPipeline pipeline() {
//        return null;
//    }
//
//    public ByteBufAllocator alloc() {
//        return null;
//    }
//
//    public <T> Attribute<T> attr(AttributeKey<T> attributeKey) {
//        return null;
//    }
//
//    public <T> boolean hasAttr(AttributeKey<T> attributeKey) {
//        return false;
//    }
//}
