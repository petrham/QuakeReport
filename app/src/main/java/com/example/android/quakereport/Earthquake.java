package com.example.android.quakereport;

public class Earthquake {

    private double magnitude;
    private String location;
    private long time;
    private String url;

    public Earthquake(double magnitude, String location, long time, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.time = time;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }
}
