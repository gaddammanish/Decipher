package com.example.android.mygame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = this.getSharedPreferences("highscore", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=prefs.edit();
        editor.putInt("intialise", 0);
        editor.commit();

    }

    public void newgame(View view) {
        Intent intent1 = new Intent(MainActivity.this, MainInputActivity.class);
        startActivity(intent1);
    }

    public void highscore(View view) {

        Intent intent1 = new Intent(MainActivity.this, MainScoreActivity.class);
        startActivity(intent1);
    }

}