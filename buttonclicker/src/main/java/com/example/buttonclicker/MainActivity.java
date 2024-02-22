package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tvOut);
        Button wai = findViewById(R.id.btnWhoAmI);
        Button inm = findViewById(R.id.btnItIsNotMe);


        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tv.setText("Мой номер по списку №20");
                CheckBox cb = findViewById(R.id.checkBox);
                cb.setChecked(false);
            }
        };
        wai.setOnClickListener(oclBtnWhoAmI);
    }

    public void onMyButtonClick(View view){
        Toast.makeText(this, "Еще один способ!", Toast.LENGTH_SHORT).show();
        CheckBox cb = findViewById(R.id.checkBox);
        cb.setChecked(true);
    }

}