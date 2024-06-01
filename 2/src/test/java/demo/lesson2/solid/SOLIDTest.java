package demo.lesson2.solid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.max.demo.lesson2.solid.*;

public class SOLIDTest {

    @Test
    @Disabled
    void testSuperSensorSingleResponsibility() {
        //given
        SuperSensor sensor = new SuperSensor(10, 100);
        //when
        sensor.getSmokeSignal(150);
        sensor.getTemperatureSignal(15);
        //then
        Assertions.assertTrue(sensor.isAlarm());

    }

    @Test
    @Disabled
    void testSensorsSingleResponsibility() {
        //given
        ISensor sensorTemperature = new TemperatureSensor(100);
        ISensor sensorSmoke = new SmokeSensor(100, false);
        //when
        sensorTemperature.getSignal(3);
        sensorSmoke.getSignal(10);
        //then
        Assertions.assertFalse(sensorTemperature.isAlarm());
        Assertions.assertFalse(sensorSmoke.isAlarm());

    }

    @Test
    @Disabled
    void testOpenClosed() {
        //given
        TemperatureOpenSensor sensor = new TemperatureOpenSensor(100);
        //when
        sensor.getSignal(13);
        if(sensor.isAlarm()) sensor.sendSms();
        //then
        Assertions.assertTrue(sensor.isAlarm());
        Assertions.assertTrue(sensor.getSmsSend() > 0);

    }

    @Test
    @Disabled
    void testLiskov() {
        //given
        ISensor sensor = new ColdSensor(100);
        //when
        sensor.getSignal(13);
        //then
        Assertions.assertNull(sensor.isAlarm());

    }
}
