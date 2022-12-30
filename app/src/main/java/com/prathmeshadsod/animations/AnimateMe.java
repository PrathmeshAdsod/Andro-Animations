package com.prathmeshadsod.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class AnimateMe extends AppCompatActivity {
    Button click;
    LottieAnimationView load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate_me);


        load = findViewById(R.id.load);
        click = findViewById(R.id.click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*    load.setAnimation(R.raw.lottieload);
                 load.setFrame(200);*/
                 click.setText("Resume");
                 load.setVisibility(View.VISIBLE);
                 load.playAnimation();

            }
        });


    }
}