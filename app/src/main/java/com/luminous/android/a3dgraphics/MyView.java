package com.luminous.android.a3dgraphics;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    private Paint redPaint; // paint object for drawing lines
    private Coordinate[] cubeVertices; // the vertices of 3D cube
    private Coordinate[] drawCubeVertices; // the vertices for drawing a 3D cube

    public MyView(Context context) {
        super(context);
        final MyView thisView = this;

        // create a Paint object
        redPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        redPaint.setStyle(Paint.Style.STROKE);
        redPaint.setColor(Color.RED);
        redPaint.setStrokeWidth(2);

        // create a 3D cube
        cubeVertices = new Coordinate[8];
        cubeVertices[0] = new Coordinate(-1, -1, -1, 1);
        cubeVertices[1] = new Coordinate(-1, -1, 1, 1);
        cubeVertices[2] = new Coordinate(-1, 1, -1, 1);
        cubeVertices[3] = new Coordinate(-1, 1, 1, 1);
        cubeVertices[4] = new Coordinate(1, -1, -1, 1);
        cubeVertices[5] = new Coordinate(1, -1, 1, 1);
        cubeVertices[0] = new Coordinate(-1, -1, -1, 1);
        cubeVertices[0] = new Coordinate(-1, -1, -1, 1);
    }
}
