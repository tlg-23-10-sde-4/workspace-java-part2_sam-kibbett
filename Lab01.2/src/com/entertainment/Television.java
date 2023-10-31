package com.entertainment;

import java.util.Objects;

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
    public int hashCode() {
    // This is a poorly written hash function cause it creates hash collisions.
        return Objects.hash(getBrand(), getVolume());
    }

    @Override
    public boolean equals (Object obj) {
        boolean result = false;

        // proceed only if 'obj' is really referencing a television object
        if (obj instanceof Television) {
            // safely downcast 'obj' tp more specific reference Television
            Television other = (Television) obj;

            // do the checks: business equality is defined by brand, volume being the same
            result = Objects.equals(this.getBrand(), other.getBrand()) &&
                    this.getVolume() == other.getVolume();
        }

        return result;
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