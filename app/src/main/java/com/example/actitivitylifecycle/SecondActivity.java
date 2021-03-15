package com.example.actitivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView second_activity_onCreate_count_tv,second_activity_onStart_count_tv,second_activity_onResume_count_tv,second_activity_onRestart_count_tv;
    Button first_activity_btn;
    static int create_count = 0;
    static int start_count = 0;
    static int resume_count = 0;
    static int restart_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        second_activity_onCreate_count_tv = findViewById(R.id.second_activity_onCreate_count_tv);
        second_activity_onStart_count_tv = findViewById(R.id.second_activity_onStart_count_tv);
        second_activity_onResume_count_tv = findViewById(R.id.second_activity_onResume_count_tv);
        second_activity_onRestart_count_tv = findViewById(R.id.second_activity_onRestart_count_tv);

        first_activity_btn = findViewById(R.id.first_activity_btn);

        create_count++;

        second_activity_onCreate_count_tv.setText(String.valueOf(create_count));

        first_activity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        start_count++;
        second_activity_onStart_count_tv.setText(String.valueOf(start_count));
    }

    @Override
    protected void onResume() {
        super.onResume();
        resume_count++;
        second_activity_onResume_count_tv.setText(String.valueOf(resume_count));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart_count++;
        second_activity_onRestart_count_tv.setText(String.valueOf(restart_count));
    }
}