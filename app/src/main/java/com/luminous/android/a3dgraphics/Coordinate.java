package com.luminous.android.a3dgraphics;

public class Coordinate {
    public double x, y, z, w;

    public Coordinate() {
        x = y = z = 0;
        w = 1;
    }

    // create
    public Coordinate(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public void normalise() {
        if (w != 0) {

        }
    }
}
