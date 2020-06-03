package com.beka.naveriani.davaleba4.exception;

public class GeneralException extends RuntimeException{


    private String errorCode;
    private String errorMessage;

    public GeneralException(String errorCode, String  errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
