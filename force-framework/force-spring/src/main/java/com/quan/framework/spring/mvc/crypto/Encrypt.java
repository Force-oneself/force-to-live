package com.quan.framework.spring.mvc.crypto;

import java.lang.annotation.*;

/**
 * @author Force-oneself
 * @date 2023-03-03
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Encrypt {

}
