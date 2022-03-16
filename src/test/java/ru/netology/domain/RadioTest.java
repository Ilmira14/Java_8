package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetNumberOfStation() {
        Radio radio = new Radio(11);

        int expected = 11;
        int actual = radio.getNumberOfRadioStations();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio(10);

        int expected = 9;
        int actual = radio.getMaxRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationFromPanel() {
        Radio radio = new Radio(10);
        radio.setCurrentStationFromPanel(7);

        int expected = 7;
        int actual = radio.getCurrentStationFromPanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationFromPanelIfLessThanMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStationFromPanel(-1);

        int expected = 0;
        int actual = radio.getCurrentStationFromPanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationFromPanelIfMoreThanMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStationFromPanel(11);

        int expected = 0;
        int actual = radio.getCurrentStationFromPanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinCurrentRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxCurrentRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationIfLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationIfMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.setToNextStation();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToZeroStationIfCurrentStationIsMax() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation(9);
        radio.setToNextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationIfCurrentStationLessThanMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-6);
        radio.setToNextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationIfCurrentStationMoreThanMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);
        radio.setToNextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.setToPrevStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStationIfCurrentStationIsMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.setToPrevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationIfCurrentStationLessThanMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-2);
        radio.setToPrevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationIfCurrentStationMoreThanMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(12);
        radio.setToPrevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeIfLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeIfMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLeaveVolumeIfItsAtMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfItsLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfItsMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLeaveVolumeIfItsAtMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void shouldDecreaseVolumeIfItsLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIfItsMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}