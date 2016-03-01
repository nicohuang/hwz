package com.hwz.service;

import com.hwz.StorageServiceException;

/**
 * Created by nico on 16/2/25.
 */
public interface FileSaveService
{
    String save(String namespace,String filename,byte[] data) throws StorageServiceException;

    void doDao();
}
