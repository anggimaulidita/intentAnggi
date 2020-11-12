package com.example.kartuucapan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    public static final String EXSTRA_NAME ="extra_name" ;
    private static final String EXSTRA_AGE = "extra_age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TextView tvDataRecived = findViewById(R.id.tv_data_received);

        String name = getIntent().getStringExtra(EXSTRA_NAME);
        Int age = getIntent().getIntExtra(EXSTRA_AGE,0);

        String text = "Name :" + nama + " , \nYour Age : " + age;
        tvDataRecived.setText(text);
    }
}