package com.example.task04;

public class ConsoleHandler implements Handler {
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }
}
