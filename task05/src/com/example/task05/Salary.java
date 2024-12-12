package com.example.task05;

public class Salary implements Dispatchable<Integer> {
    final private String from;
    final private String to;
    final private Integer amount;

    public Salary(String from, String to, Integer amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public Integer getContent() {
        return amount;
    }
}
