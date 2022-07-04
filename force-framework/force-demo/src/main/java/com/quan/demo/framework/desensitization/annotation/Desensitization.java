package com.quan.demo.framework.desensitization.annotation;

import com.quan.demo.framework.desensitization.Operation;

import java.lang.annotation.*;

/**
 * Desensitization
 *
 * @author Force-oneself
 * @date 2022-07-03
 */
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Desensitization {

    Class<? extends Operation> ops() default NoOperation.class;

    class NoOperation implements Operation {

        @Override
        public String mask(String content, String maskChar) {
            return content;
        }
    }
}
