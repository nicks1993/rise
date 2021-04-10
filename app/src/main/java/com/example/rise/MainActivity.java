package com.example.rise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button puzzleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button puzzleButton2 = findViewById(R.id.puzzleButton);
        puzzleButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, PuzzleActivity.class));
            }
        });
        Button puzzleButton3 = findViewById(R.id.puzzleButton2);
        puzzleButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, ExerceActivity.class));
            }
        });

        Button puzzleButton4 = findViewById(R.id.button3);
        puzzleButton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, TravelActivity.class));
            }
        });
    }

}



