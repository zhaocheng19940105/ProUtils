package com.zc;

import android.app.Activity;
import android.os.Bundle;

import com.zc.masklib.MaskImage;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MaskImage maskImage = (MaskImage) findViewById(R.id.mask_image);
        maskImage.setImageResource(R.drawable.ic_test);
        MaskImage maskImage2 = (MaskImage) findViewById(R.id.mask_image2);
        maskImage2.setMaskImg(R.drawable.mask);
        maskImage2.setImageResource(R.drawable.ic_test);
    }

}
