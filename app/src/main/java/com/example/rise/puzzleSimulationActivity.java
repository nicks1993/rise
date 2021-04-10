package com.example.rise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class puzzleSimulationActivity extends AppCompatActivity {
    EditText answer1;
    EditText answer2;
    EditText answer3;
    EditText answer4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_simulation);
        answer1 = findViewById(R.id.editTextNumberDecimal);
        answer2 = findViewById(R.id.editTextNumberDecimal2);
        answer3 = findViewById(R.id.editTextNumberDecimal3);
        answer4 = findViewById(R.id.editTextNumberDecimal4);
        ArrayList<EditText> answers = new ArrayList<EditText>();
        answers.add(0,answer1);
        answers.add(1,answer2);
        answers.add(2,answer3);
        answers.add(3,answer4);
        int [] correct = {16,22,80,10};
        //ArrayList<Double> correct = new ArrayList<Double>();
        //correct.add(39.00);
        //correct.add(38.00);
        //correct.add(72.00);
        //correct.add(2.33);
        //int allGood = 0;
        Button done = findViewById(R.id.button);
        done.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int allGood=0;
                for (int i = 0; i < answers.size(); i++) {
                    String answer = answers.get(i).getText().toString().trim();
                    if(answer.length()==0){
                        answers.get(i).setError("Field is empty");
                        allGood=1;
                        //answers.get(i).setHighlightColor(Color.RED);
                    }
                    else{
                        int value = Integer.parseInt(answer);
                        if(value!=correct[i]){
                            answers.get(i).setError("Incorrect");
                            allGood=1;
                        }

                    }
                }
                if(allGood==0){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "You have correctly solved the puzzle, alarm deactivated!",
                            Toast.LENGTH_SHORT);

                    toast.show();
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            startActivity(new Intent(puzzleSimulationActivity.this, MainActivity.class));
                        }
                    }, 3500);   //5
                }
                //answer1.getText().toString().trim();
                //answer2.getText().toString().trim();
                //answer3.getText().toString().trim();
                //answer4.getText().toString().trim();
                if(answer1.length()==0){

                }
                //checkAnswer();

            }
        });

    }

    //public boolean checkAnswer(){

    //}
}