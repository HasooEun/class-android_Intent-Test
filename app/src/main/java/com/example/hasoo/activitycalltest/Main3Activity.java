package com.example.hasoo.activitycalltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView imageView = (ImageView)findViewById(R.id.imageView2);
        Button button = (Button)findViewById(R.id.button6);

        Intent intent = getIntent();
        String title = intent.getStringExtra("name");
        setTitle(title);

        if(title.equals("세비야")) imageView.setImageResource(R.drawable.img2);
        else if (title.equals("라싸")) imageView.setImageResource(R.drawable.img3);
        else if (title.equals("피렌체")) imageView.setImageResource(R.drawable.img4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
