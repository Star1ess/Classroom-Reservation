package com.cpt202a19.reservation.controller.ex;


/** 
 * Base class for file upload related exceptions
 * @exception/throws RuntimeException
 */
public class FileUploadException extends RuntimeException {

    public FileUploadException() {
        super();
    }

    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileUploadException(Throwable cause) {
        super(cause);
    }

    protected FileUploadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}