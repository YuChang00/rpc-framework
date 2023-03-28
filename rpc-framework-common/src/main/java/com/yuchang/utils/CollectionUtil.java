package com.yuchang.utils;

import java.util.Collection;

/**
 * 集合工具类
 *
 * @author yuchang
 */
public class CollectionUtil {

    public static boolean isEmpty(Collection<?> c) {
        return c == null || c.isEmpty();
    }

}
