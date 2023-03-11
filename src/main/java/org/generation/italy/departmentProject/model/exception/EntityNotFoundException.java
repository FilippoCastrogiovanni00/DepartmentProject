package org.generation.italy.departmentProject.model.exception;

public class EntityNotFoundException extends Exception {
    public EntityNotFoundException (String message){
        super(message);
    }
    public EntityNotFoundException (String message, Throwable error){
        super (message, error);
    }
}
