package com.example.quizbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView tv,tv2,tv3;
    Button btnrstart,home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        tv=(TextView) findViewById(R.id.tvres);
        tv2=(TextView) findViewById(R.id.tvres2);
        tv3=(TextView) findViewById(R.id.tvres3);
        btnrstart=(Button) findViewById(R.id.btnrestart);
        home=(Button)findViewById(R.id.button7);
        StringBuffer sb = new StringBuffer();
        sb.append("correct answers: "+MainActivity5.correct + "\n");
        StringBuffer sb2=new StringBuffer();
        sb2.append("Wrong Answers: " +MainActivity5.wrong +"\n");
        StringBuffer sb3=new StringBuffer();
        sb3.append("Final Score: " +MainActivity5.correct +"\n");
        tv.setText(sb);
        tv2.setText(sb2);
        tv3.setText(sb3);
        MainActivity5.correct=0;
        MainActivity5.wrong=0;
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