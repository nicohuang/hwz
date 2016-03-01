package com.hwz;

/**
 * Created by nico on 16/2/25.
 */

public class StorageServiceException extends Exception
{
    public StorageServiceException()
    {
        super();
    }

    public StorageServiceException(String message)
    {
        super(message);
    }

    public StorageServiceException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public StorageServiceException(Throwable cause)
    {
        super(cause);
    }

    protected StorageServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
