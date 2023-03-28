package com.yuchang.annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * RPC引用注释，自动连接服务实现类
 *
 * @author yuchang
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Inherited
public @interface RpcReference {

    /**
     * 服务版本，默认为空字符串
     */
    String version() default "";

    /**
     * Service group, 默认值为空字符串
     */
    String group() default "";

}
