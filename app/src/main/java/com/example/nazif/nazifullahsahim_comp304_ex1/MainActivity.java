package com.example.nazif.nazifullahsahim_comp304_ex1;

/*
 Student Name: Nazifullah Sahim
 Student ID: 300886750
 Description: Assignment 1
 Course: COMP304
 Instructor: Professor Vinayagathas
 Date: Jan-22-2019
  */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // delcaring onClick method with View parameter
    public void sendMessage(View view)
    {
        //initialized intent object to communicate with another (messageActivity)
        Intent intent= new  Intent (this, MessageActivity.class);
        //initialized editText object
        EditText editText=findViewById(R.id.edtText);
        String message=editText.getText().toString();

        intent.putExtra("Message", message);


        startActivity(intent );

    }
}
