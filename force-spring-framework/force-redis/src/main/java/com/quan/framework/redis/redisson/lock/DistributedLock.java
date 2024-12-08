package com.quan.framework.redis.redisson.lock;


import org.springframework.lang.NonNull;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * DistributedLock
 *
 * @author Force-oneself
 * @date 2022-08-10
 */
public interface DistributedLock extends Lock {

    /**
     * 不支持条件操作
     *
     * @return 不支持
     */
    @Override
    @NonNull
    default Condition newCondition() {
        throw new UnsupportedOperationException("Unsupported operation");
    }
}
