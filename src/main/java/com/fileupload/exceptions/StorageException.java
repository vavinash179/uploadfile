package com.fileupload.exceptions;

public class StorageException extends RuntimeException {

	private static final long serialVersionUID = -338112300406596775L;

	public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
