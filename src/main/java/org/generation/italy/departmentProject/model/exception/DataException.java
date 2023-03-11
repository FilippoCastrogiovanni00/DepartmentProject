package org.generation.italy.departmentProject.model.exception;

public class DataException extends Exception{
    public DataException (String message){
        super(message);
    }
    public DataException (String message, Throwable error){
        super(message,error);
    }

}
