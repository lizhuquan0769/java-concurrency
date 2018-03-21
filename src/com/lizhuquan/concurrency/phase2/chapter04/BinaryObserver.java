package com.lizhuquan.concurrency.phase2.chapter04;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(BinaryObserver.class.getName() + ": " + Integer.toBinaryString(subject.getState()));
    }
}
