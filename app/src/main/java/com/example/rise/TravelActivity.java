package com.example.rise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        EditText timeToSet = findViewById(R.id.editTextTime2);
        EditText date = findViewById(R.id.editTextDate);
        EditText currentTime = findViewById(R.id.editTextTime3);
        String timeToSetString = timeToSet.getText().toString();
        String dateString = date.getText().toString();
        String currentTimeString = currentTime.getText().toString();
        Button cancelButton = findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(TravelActivity.this, MainActivity.class));

            }
        });

        Button createButton = findViewById(R.id.createAlarmButton);
        createButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(TravelActivity.this, ScheduledAlarmsActivity.class);
                i.putExtra("timeToSet", timeToSetString);
                i.putExtra("date", dateString);
                i.putExtra("currentTime", currentTimeString);
                startActivity(i);

            }
        });
    }
}