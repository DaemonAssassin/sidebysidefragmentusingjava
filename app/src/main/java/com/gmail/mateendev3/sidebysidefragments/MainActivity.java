package com.gmail.mateendev3.sidebysidefragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.gmail.mateendev3.sidebysidefragments.Helper.ScreenSize1;
import com.gmail.mateendev3.sidebysidefragments.Helper.ScreenSize2;

public class MainActivity extends AppCompatActivity {
    TextView tvResult1, tvResult2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult1 = findViewById(R.id.tv_result1);
        tvResult2 = findViewById(R.id.tv_result2);

        //setting click listener to tv1
        tvResult1.setOnClickListener(v -> {
            ScreenSize1 screenSize = new ScreenSize1(MainActivity.this);
            tvResult1.setText(
                    String.format(
                            "pxWidth: %s, pxHeight: %s\n",
                            screenSize.getPxWidth(),
                            screenSize.getPxHeight()
                    )
            );
            tvResult1.append(
                    String.format(
                            "pxWidthDP: %s, pxHeightDP: %s",
                            screenSize.getPxWidthInDP(),
                            screenSize.getPxHeightInDP()
                    )
            );
        });

        //setting click listener to tv2
        tvResult2.setOnClickListener(v -> {
            ScreenSize2 screenSize = new ScreenSize2(MainActivity.this);
            tvResult2.setText(
                    String.format(
                            "pxWidth: %s, pxHeight: %s \n",
                            screenSize.getPxWidth(),
                            screenSize.getPxHeight()
                    )
            );
            tvResult2.append(
                    String.format(
                            "pxWidthDP: %s, pxHeightDP: %s",
                            screenSize.getPxWidthInDP(),
                            screenSize.getPxHeightInDP()
                    )
            );
        });
    }
}