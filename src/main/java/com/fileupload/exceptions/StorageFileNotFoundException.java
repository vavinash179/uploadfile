package com.fileupload.exceptions;

public class StorageFileNotFoundException extends StorageException {

	private static final long serialVersionUID = -5868639002007736553L;

	public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}