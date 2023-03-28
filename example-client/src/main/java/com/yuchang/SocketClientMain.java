package com.yuchang;

import com.yuchang.config.RpcServiceConfig;
import com.yuchang.proxy.RpcClientProxy;
import com.yuchang.remoting.transport.RpcRequestTransport;
import com.yuchang.remoting.transport.socket.SocketRpcClient;

/**
 * @author yuchang
 */
public class SocketClientMain {
    public static void main(String[] args) {
        RpcRequestTransport rpcRequestTransport = new SocketRpcClient();
        RpcServiceConfig rpcServiceConfig = new RpcServiceConfig();
        RpcClientProxy rpcClientProxy = new RpcClientProxy(rpcRequestTransport, rpcServiceConfig);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        String hello = helloService.hello(new Hello("111", "222"));
        System.out.println(hello);
    }
}
