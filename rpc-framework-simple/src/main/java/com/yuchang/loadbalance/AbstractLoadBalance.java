package com.yuchang.loadbalance;

import com.yuchang.remoting.dto.RpcRequest;
import com.yuchang.utils.CollectionUtil;

import java.util.List;

/**
 * Abstract class for a load balancing policy
 *
 * @author yuchang
 */
public abstract class AbstractLoadBalance implements LoadBalance {
    @Override
    public String selectServiceAddress(List<String> serviceAddresses, RpcRequest rpcRequest) {
        if (CollectionUtil.isEmpty(serviceAddresses)) {
            return null;
        }
        if (serviceAddresses.size() == 1) {
            return serviceAddresses.get(0);
        }
        return doSelect(serviceAddresses, rpcRequest);
    }

    protected abstract String doSelect(List<String> serviceAddresses, RpcRequest rpcRequest);

}
