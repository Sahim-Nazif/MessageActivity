package com.example.nazif.nazifullahsahim_comp304_ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        //Instantiating intent
         Intent intent=getIntent();
        ////retrieving the data (message) from MainActivity
        String message= intent.getStringExtra("Message");
        TextView textView=findViewById(R.id.txtView);
        textView.setText(message);
    }
}
