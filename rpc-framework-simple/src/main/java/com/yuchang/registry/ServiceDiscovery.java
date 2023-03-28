package com.yuchang.registry;

import com.yuchang.extension.SPI;
import com.yuchang.remoting.dto.RpcRequest;

import java.net.InetSocketAddress;

/**
 * service discovery
 *
 * @author yuchang
 */
@SPI
public interface ServiceDiscovery {
    /**
     * lookup service by rpcServiceName
     *
     * @param rpcRequest rpc service pojo
     * @return service address
     */
    InetSocketAddress lookupService(RpcRequest rpcRequest);
}
