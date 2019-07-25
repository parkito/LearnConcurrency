package ru.siksmfp.learn.concurrency.basic.exampl_01;

public class PingPong {
    private int count;

    public void print() {
        if (count % 2 == 0) {
            System.out.println("ping " + count + " " + Thread.currentThread().getName());
        } else {
            System.out.println("pong " + count + " " + Thread.currentThread().getName());
        }
        count++;
    }
}