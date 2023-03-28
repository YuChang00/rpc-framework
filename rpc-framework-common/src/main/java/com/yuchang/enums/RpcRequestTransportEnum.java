package com.yuchang.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author yuchang
 */
@AllArgsConstructor
@Getter
public enum RpcRequestTransportEnum {

    NETTY("netty"),
    SOCKET("socket");

    private final String name;
}
