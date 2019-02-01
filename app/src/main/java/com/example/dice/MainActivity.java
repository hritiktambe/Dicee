package com.example.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton = findViewById(R.id.rollbutton);
        final ImageView leftDice  = findViewById(R.id.leftDice);
        final ImageView rightDice = findViewById(R.id.rightDice);

        final int[] dicearray = new int[] {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","pressed");
                Random randomNo = new Random();
                int number = randomNo.nextInt(6);
                leftDice.setImageResource(dicearray[number]);
                int num = randomNo.nextInt(6);
                rightDice.setImageResource(dicearray[num]);
            }
        });


    }
}
