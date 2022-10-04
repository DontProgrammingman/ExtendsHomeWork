package pro.sky.ExtendsHomeWork.exception;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException(String message){
        super(message);
    }
}
