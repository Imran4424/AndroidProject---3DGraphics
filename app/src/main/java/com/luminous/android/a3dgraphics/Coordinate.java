package com.luminous.android.a3dgraphics;

// homogeneous coordinate in 3D Space
public class Coordinate {
    public double x, y, z, w;

    // create coordinate object with 0, 0, 0
    public Coordinate() {
        x = y = z = 0;
        w = 1;
    }

    // create coordinate object
    public Coordinate(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    // to keep it as a homogeneous coordinate -> divide the coordinate with w and w = 1
    public void normalise() {
        // ensure that w != 0
        if (w != 0) {
            x /= w;
            y /= w;
            z /= w;
        }

        w = 1;
    }
}
