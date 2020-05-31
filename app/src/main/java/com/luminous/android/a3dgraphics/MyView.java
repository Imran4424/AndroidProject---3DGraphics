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

        
    }
}