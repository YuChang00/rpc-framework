package com.yuchang.remoting.transport;

import com.yuchang.extension.SPI;
import com.yuchang.remoting.dto.RpcRequest;

/**
 * send RpcRequest。
 *
 * @author yuchang
 */
@SPI
public interface RpcRequestTransport {
    /**
     * send rpc request to server and get result
     *
     * @param rpcRequest message body
     * @return data from server
     */
    Object sendRpcRequest(RpcRequest rpcRequest);
}
