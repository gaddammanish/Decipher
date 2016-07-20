package com.example.android.mygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainInputActivity extends AppCompatActivity {

    String username1;
    String length1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_input);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        }
    public void startgame1(View view) {
        EditText inputText = (EditText) findViewById(R.id.name1);
        EditText inputText2= (EditText) findViewById(R.id.len);

        username1 = inputText.getText().toString();
        length1 =inputText2.getText().toString();

        if(inputText.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(),"please enter your sweet name",Toast.LENGTH_LONG).show();


        }
        else if(inputText.getText().toString().length()>11)
        {
            Toast.makeText(getApplicationContext(),"name max limit is\n\t11 characters",Toast.LENGTH_LONG).show();
            inputText.setText("");


        }
        else if(inputText2.getText().toString().equals(""))
        {
            Toast.makeText(getApplicationContext(), "please enter string length", Toast.LENGTH_LONG).show();

        }
        else if(Integer.parseInt(length1)>10)
        {
            Toast.makeText(getApplicationContext(), "please enter string length less then 10", Toast.LENGTH_LONG).show();
            inputText2.setText("");
        }
        else {

               Intent intent1 = new Intent(MainInputActivity.this, MainGameActivity.class);
            intent1.putExtra("username", username1);
            intent1.putExtra("length1",Integer.parseInt(length1));
            startActivity(intent1);
            inputText.setText("");
            inputText2.setText("");
        }

    }




}
