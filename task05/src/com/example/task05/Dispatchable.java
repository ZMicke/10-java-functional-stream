package com.example.task05;

public interface Dispatchable<T> {
    String getTo();
    String getFrom();
    T getContent();
}
