package ru.Skoba.javaqa;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationAmount;
    
    public Radio(){
        stationAmount = 10;
    }
    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > stationAmount - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation >= stationAmount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0 & newCurrentVolume <= 10) {
            currentVolume = newCurrentVolume;
        }
    }

    public void volumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }

}
