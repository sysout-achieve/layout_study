package com.example.msi.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

/**
 * Created by MSI on 2018-01-17.
 */

public class custom extends View {
public custom(Context context){
    super(context);
    }

    protected void onDraw(Canvas canvas){
    canvas.drawColor(Color.YELLOW);

    }

}
