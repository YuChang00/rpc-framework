package com.yuchang.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author yuchang
 */
@AllArgsConstructor
@Getter
public enum ServiceRegistryEnum {

    ZK("zk");

    private final String name;
}
