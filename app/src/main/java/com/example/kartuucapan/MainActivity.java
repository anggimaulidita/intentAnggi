package com.example.kartuucapan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Buttonn btnMoveActivity = findViewById(R.id.btn_move_sctivity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveWithData = findViewById(R.id.btn_move_with_data);
        btnMoveWithData.setOnClickListener(this);
    }

    @Override
    public void onClick(view v) {
        switch (v.getid()) {
            case R / id.btn_move_activity:
                Intent moveActivity = new Intent(MainActivity.this, MoveActivity)
                        startActivity(moveIntent )
                break;
             case R.id.btn_move_with_data;
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXSTRA_NAME,"kampus STIMATA");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXSTRA_NAME,20);
                startActivity(moveWithDataIntent);
                break;

        }
    }
}
