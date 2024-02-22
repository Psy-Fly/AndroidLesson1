package com.example.control_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("New text in MIREA");

        Button button = findViewById(R.id.button13);
        button.setText("MireaButton");

        CheckBox cb = findViewById(R.id.checkBox);
        cb.setChecked(true);
    }
}