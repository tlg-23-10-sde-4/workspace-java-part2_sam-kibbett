package com.entertainment;

public class Television {
    private String brand;
    private int volume;

    // Television has-a tuner
    private final Tuner tuner = new Tuner();

    // No Argument Constructor
    public Television() {

    }

    // Brand and Volume Constructor
    public Television(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

    public int getCurrentChannel() {
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    // Accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + getBrand() + '\'' +
                ", volume=" + getVolume() +
                ", Channel=" + getCurrentChannel() +
                '}';
    }
}