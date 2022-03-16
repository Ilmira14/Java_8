package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setToNextStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation += 1;
    }

    public void setToPrevStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation -= 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = 10;
            return;
        }
        this.currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = 0;
            return;
        }
        this.currentVolume -= 1;
    }
}

