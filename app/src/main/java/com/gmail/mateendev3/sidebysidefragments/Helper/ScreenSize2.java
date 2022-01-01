package com.gmail.mateendev3.sidebysidefragments.Helper;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

public class ScreenSize2 {
    //declaring members
    private final float pxHeight;
    private final float pxWidth;
    private final float pxHeightInDP;
    private final float pxWidthInDP;

    //public constructor

    public ScreenSize2(Activity activity) {

        //Instantiating DisplayMetrics object
        DisplayMetrics metrics = activity
                .getResources()
                .getDisplayMetrics();

        //getting values of px in height and width
        pxHeight = metrics.heightPixels;
        pxWidth = metrics.widthPixels;

        //getting value of density
        float density = metrics.density;

        //getting values of px in dp
        pxHeightInDP = pxHeight / density;
        pxWidthInDP = pxWidth / density;
    }

    //getters

    public float getPxHeight() {
        return pxHeight;
    }

    public float getPxWidth() {
        return pxWidth;
    }

    public float getPxHeightInDP() {
        return pxHeightInDP;
    }

    public float getPxWidthInDP() {
        return pxWidthInDP;
    }
}
