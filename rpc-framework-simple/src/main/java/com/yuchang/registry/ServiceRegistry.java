package com.yuchang.registry;

import com.yuchang.extension.SPI;

import java.net.InetSocketAddress;

/**
 * service registration
 *
 * @author yuchang
 */
@SPI
public interface ServiceRegistry {
    /**
     * register service
     *
     * @param rpcServiceName    rpc service name
     * @param inetSocketAddress service address
     */
    void registerService(String rpcServiceName, InetSocketAddress inetSocketAddress);

}
