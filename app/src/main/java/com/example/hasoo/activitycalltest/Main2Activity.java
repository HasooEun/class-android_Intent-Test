package com.example.hasoo.activitycalltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("베니스 - 이탈리아");

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Button button = (Button)findViewById(R.id.button5);

        imageView.setImageResource(R.drawable.img1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
