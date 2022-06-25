package com.example.quizbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {
    TextView tv4,tv5,tv6;
    Button btnrstart,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        tv4=(TextView) findViewById(R.id.tvres4);
        tv5=(TextView) findViewById(R.id.tvres5);
        tv6=(TextView) findViewById(R.id.tvres6);
        btnrstart=(Button) findViewById(R.id.btnrestart1);
        home=(Button)findViewById(R.id.button11);
        StringBuffer sb4 = new StringBuffer();
        sb4.append("correct answers: "+MainActivity7.correct + "\n");
        StringBuffer sb5=new StringBuffer();
        sb5.append("Wrong Answers: " +MainActivity7.wrong +"\n");
        StringBuffer sb6=new StringBuffer();
        sb6.append("Final Score: " +MainActivity7.correct +"\n");
        tv4.setText(sb4);
        tv5.setText(sb5);
        tv6.setText(sb6);
        MainActivity7.correct=0;
        MainActivity7.wrong=0;
        btnrstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(in);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });
    }
}