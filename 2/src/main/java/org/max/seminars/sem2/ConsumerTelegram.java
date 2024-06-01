package org.max.seminars.sem2;

public class ConsumerTelegram implements IConsumer {

    private int count = 0;

    @Override
    public void getMessage(String mes) {
        System.out.printf("ConsumerTelegram get message: %s\n", mes);
        count++;
    }

    @Override
    public int getCount() {
        return count;
    }
}
