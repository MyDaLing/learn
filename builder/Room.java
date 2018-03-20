package com.testpro.mdaling.factory.builder;

/**
 * Created by luojin on 2018/3/20.
 */

public class Room {

    private String window;
    private String floor;

    public Room build(BuildParams params) {
        this.window = params.window;
        this.floor = params.floor;
        return this;
    }

    @Override
    public String toString() {
        return "Room{" +
                "window='" + window + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}
