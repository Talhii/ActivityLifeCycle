package com.example.actitivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView onCreate_count_tv,onStart_count_tv,onResume_count_tv,onRestart_count_tv;
    Button second_activity_btn;
    public static int create_count = 0;
    public static int start_count = 0;
    public static int resume_count = 0;
    public static int restart_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onCreate_count_tv = findViewById(R.id.onCreate_count_tv);
        onStart_count_tv = findViewById(R.id.onStart_count_tv);
        onResume_count_tv = findViewById(R.id.onResume_count_tv);
        onRestart_count_tv = findViewById(R.id.onRestart_count_tv);

        second_activity_btn = findViewById(R.id.second_activity_btn);

        create_count++;

        onCreate_count_tv.setText(String.valueOf(create_count));

        second_activity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        start_count++;
        onStart_count_tv.setText(String.valueOf(start_count));
    }

    @Override
    protected void onResume() {
        super.onResume();
        resume_count++;
        onResume_count_tv.setText(String.valueOf(resume_count));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart_count++;
        onRestart_count_tv.setText(String.valueOf(restart_count));
    }


}