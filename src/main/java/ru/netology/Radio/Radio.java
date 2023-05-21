package ru.netology.Radio;

public class Radio {

    private int defaultStation = 10;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int generateNewStation) {
        this.currentStation = generateNewStation;
        maxStation = generateNewStation - 1;
    }

    public Radio() {
        this.currentStation = defaultStation - 1;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setMaxNumbStation() {

        currentStation = maxStation;
    }

    public void setMinNumbStation() {

        currentStation = minStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = currentVolume;
        }
    }

    public void prevVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
    }
}




