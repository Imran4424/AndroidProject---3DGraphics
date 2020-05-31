package com.luminous.android.a3dgraphics;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    private Paint redPaint; // paint object for drawing lines
    private Coordinate[] cubeVertices; // the ver

    public MyView(Context context) {
        super(context);
    }
}
