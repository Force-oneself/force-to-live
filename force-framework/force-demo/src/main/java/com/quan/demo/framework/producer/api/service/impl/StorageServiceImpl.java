package com.quan.demo.framework.producer.api.service.impl;

import com.quan.demo.framework.producer.api.adapter.store.StorageAdapter;
import com.quan.demo.framework.producer.api.adapter.store.StorageAdapterComposite;
import com.quan.demo.framework.producer.api.service.StorageService;

/**
 * @author Force-oneself
 * @description StorageServiceImpl
 * @date 2021-09-28
 **/
public class StorageServiceImpl<T> implements StorageService<T> {

    private final StorageAdapterComposite<T> storageAdapterComposite;

    public StorageServiceImpl(StorageAdapterComposite<T> storageAdapterComposite) {
        this.storageAdapterComposite = storageAdapterComposite;
    }

    @Override
    public StorageAdapter<T> storageAdapter() {
        return storageAdapterComposite;
    }
}
