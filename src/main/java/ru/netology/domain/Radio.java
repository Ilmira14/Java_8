package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentStationFromPanel;
    private int numberOfRadioStations = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = numberOfRadioStations - 1;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
        this.maxRadioStation = numberOfRadioStations - 1;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentStationFromPanel() {
        return currentStationFromPanel;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentStationFromPanel(int currentStationFromPanel) {
        if (currentStationFromPanel > maxRadioStation) {
            return;
        }
        if (currentStationFromPanel < minRadioStation) {
            return;
        }
        this.currentStationFromPanel = currentStationFromPanel;
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
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation += 1;
    }

    public void setToPrevStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
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
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume -= 1;
    }
}

