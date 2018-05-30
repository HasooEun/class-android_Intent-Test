package com.example.hasoo.activitycalltest;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        Button button2= (Button)findViewById(R.id.button2);
        Button button3= (Button)findViewById(R.id.button3);
        Button button4= (Button)findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton radioButton = (RadioButton)findViewById(R.id.radioButton);
                RadioButton radioButton2= (RadioButton)findViewById(R.id.radioButton2);
                RadioButton radioButton3= (RadioButton)findViewById(R.id.radioButton3);

                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                if(radioButton.isChecked())  intent.putExtra("name", "세비야");
                else if(radioButton2.isChecked()) intent.putExtra("name", "라싸");
                else if(radioButton3.isChecked()) intent.putExtra("name", "피렌체");
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText)findViewById(R.id.editText);
                String query = editText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, query);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.hanyang.ac.kr");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}
