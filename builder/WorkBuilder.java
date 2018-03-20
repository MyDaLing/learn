package com.testpro.mdaling.factory.builder;

/**
 * Created by luojin on 2018/3/20.
 */

public class WorkBuilder {

    private BuildParams buildParams;

    public WorkBuilder() {
        this.buildParams = new BuildParams();
    }

    public WorkBuilder makeWindow(String window) {
        this.buildParams.window = window;
        return this;
    }

    public WorkBuilder makeFloor(String floor) {
        this.buildParams.floor = floor;
        return this;
    }

    public Room build() {
        Room room = new Room();
        room.build(this.buildParams);
        return room;
    }
}
