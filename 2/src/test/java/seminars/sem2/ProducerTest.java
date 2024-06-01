package seminars.sem2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.max.seminars.sem2.ConsumerTelegram;
import org.max.seminars.sem2.ConsumerViber;
import org.max.seminars.sem2.Producer;

public class ProducerTest {

    @Test
    @Disabled
    void testProducer() {
        //given
        ConsumerTelegram consumerTelegram = new ConsumerTelegram();
        ConsumerViber consumerViber = new ConsumerViber();
        Producer producer = new Producer();
        producer.subscribe(consumerTelegram);
        producer.subscribe(consumerViber);
        //when
        producer.sendMessage("Message from Producer");
        producer.sendMessage("Message from Producer2");
        //then
        Assertions.assertEquals(2, consumerTelegram.getCount());
        Assertions.assertEquals(2, consumerViber.getCount());
    }
}
