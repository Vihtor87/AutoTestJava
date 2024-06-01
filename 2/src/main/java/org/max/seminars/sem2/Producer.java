package org.max.seminars.sem2;

import java.util.ArrayList;
import java.util.List;

public class Producer implements IProducer {

    List<IConsumer> consumerList = new ArrayList<>();

    @Override
    public void subscribe(IConsumer iConsumer) {
        consumerList.add(iConsumer);
    }

    public void subscribeOut(IConsumer iConsumer) {
        consumerList.remove(iConsumer);
    }

    public void sendMessage(String mes) {
        consumerList.forEach(v -> {
            v.getMessage(mes);
        });
    }
}
