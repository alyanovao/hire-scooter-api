package ru.aao.hirescooterservice.exception;

public class NoFoundTravelException extends ApplicationException {
    public NoFoundTravelException() {
    }

    public NoFoundTravelException(String message) {
        super(message);
    }
}
