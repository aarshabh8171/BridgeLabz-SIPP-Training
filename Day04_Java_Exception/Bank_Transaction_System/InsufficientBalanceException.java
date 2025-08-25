package Day04_Java_Exception.Bank_Transaction_System;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
