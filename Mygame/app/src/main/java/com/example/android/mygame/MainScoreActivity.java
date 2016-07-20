package com.example.android.mygame;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainScoreActivity extends AppCompatActivity {

    TextView text1;
    String score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_score);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        text1=(TextView)findViewById(R.id.textView10);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        SharedPreferences prefs = this.getSharedPreferences("highscore", Context.MODE_PRIVATE);

           score= prefs.getString("score",null);
        if(score==null)
        {
         String man="Start the game to grab score board";
            text1.setText(man);
        }
        else {
            text1.setText(score);
        }



    }

}
