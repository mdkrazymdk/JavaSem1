package org.example;

public class InsufficientFundsException extends Exception{
    InsufficientFundsException(String massage)
    {
        super(massage);
    }
}
