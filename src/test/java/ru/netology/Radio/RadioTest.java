package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldCreateStationsWithLimits() {
        Radio radio = new Radio(6);
        Assertions.assertEquals(5, radio.getMaxStation());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumbStation() {
        Radio radio = new Radio();

        radio.setMaxNumbStation();

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumbStation() {
        Radio radio = new Radio();

        radio.setMinNumbStation();

        int expected = 0;
        int actual = radio.getMinStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

     @Test
    public void shouldPrevStation1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(58);

        int expected = 58;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxVol() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetBelowMinVol() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
