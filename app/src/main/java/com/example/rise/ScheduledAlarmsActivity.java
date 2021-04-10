package com.example.rise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ScheduledAlarmsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduled_alarms);
        Bundle extras = getIntent().getExtras();
        //String timeToSet = extras.getString("timeToSet");
        String timeToSet = "9:00AM";
        //String date = extras.getString("date");
        String dateToSet = "24/04/2021";

            TextView timeView = findViewById(R.id.timeView);
            TextView dateView = findViewById(R.id.dateView);
            timeView.setText(timeToSet);
            dateView.setText(dateToSet);
            //The key argument here must match that used in the other activity

            Button cancelButton = findViewById(R.id.cancelButton2);
            cancelButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    startActivity(new Intent(ScheduledAlarmsActivity.this, MainActivity.class));

                }
            });
            Button acceptButton = findViewById(R.id.acceptButton);
            acceptButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Alarms are set!",
                            Toast.LENGTH_SHORT);
                    toast.show();
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            startActivity(new Intent(ScheduledAlarmsActivity.this, MainActivity.class));
                        }
                    }, 3000);   //5


                }
            });

    }
}