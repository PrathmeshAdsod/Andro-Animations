package com.prathmeshadsod.animations;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        // hiding statusbar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }
}