package com.example.rise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExerciseSimulationActivity extends AppCompatActivity {
    int jumpingJacks;
    TextView jumpingJackValue;
    TextView done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_simulation);
        jumpingJacks = 0;
        jumpingJackValue = findViewById(R.id.jumpingJacks);
        done = findViewById(R.id.textView10);
        Button jumpingJackButton = findViewById(R.id.button2);
        jumpingJackButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                jumpingJacks++;
                String value = String.valueOf(jumpingJacks);
                if(jumpingJacks <=15) {
                    jumpingJackValue.setText(value);
                }
                if(jumpingJacks >= 15){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "You have finished the exercises, alarm deactivated!",
                            Toast.LENGTH_SHORT);
                    jumpingJackButton.setBackgroundColor(Color.GREEN);
                    jumpingJackButton.setText("Done");
                    String checkedMark = "\u2713";
                    done.setVisibility(View.VISIBLE);
                    done.setText(checkedMark);
                    toast.show();
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            startActivity(new Intent(ExerciseSimulationActivity.this, MainActivity.class));
                        }
                    }, 3500);   //5

                }
                //startActivity(new Intent(ExerciseSimulationActivity.this,MainActivity.class));

            }
        });
    }
}