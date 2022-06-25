package com.example.quizbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button tq=(Button) findViewById(R.id.button5);
        Button gk=(Button) findViewById(R.id.button8);
        TextView textView=(TextView)findViewById(R.id.textView4);
        Intent intent=getIntent();
        String name =intent.getStringExtra("myname");
        if(name.trim().equals(""))
            textView.setText("Hello user");
        else
            textView.setText("Hello" +name);

        tq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(intent);
            }
        });
        gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),MainActivity7.class);
                startActivity(intent1);
            }
        });
    }
}