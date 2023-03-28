package com.yuchang.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author yuchang
 */
@AllArgsConstructor
@Getter
public enum LoadBalanceEnum {

    LOADBALANCE("loadBalance");

    private final String name;
}
