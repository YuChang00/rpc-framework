package com.yuchang.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author yuchang
 */
@AllArgsConstructor
@Getter
public enum ServiceDiscoveryEnum {

    ZK("zk");

    private final String name;
}
