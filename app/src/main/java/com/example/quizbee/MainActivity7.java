package com.example.quizbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String[] questions = {
            "Which is the national animal of India?",
            "Which of these is a national bird of India?",
            "Who is known as the Father of India?",
            "Who is Known as the Father of Indian constitution?",
            "Who is the current Prime minister of India?",
            "Who is the current President of India?",
            "Who is the current Chief minister of Karnataka?",
            "Who wrote the National anthem of India?",
            "Who is known as the Iron man of India?",
            "Who was the first Prime minister of India ?"
    };
    String[] answers = {"Tiger","Peacock","Mahatma Gandhi","Dr.B.R.Ambedkar","Narendra Modi","Ram Nath Kovind","Basavaraj Bommai","Rabindranath Tagore","Sardar Vallabhbhai patel","Jawaharlal Nehru"};
    String[] opt = {
            "Tiger","Lion","Elephant","Cow",
            "Kingfisher","Parrot","Crow","Peacock",
            "A.P.J.Abdul Kalam","Subhash Chandra Bose","Mahatma Gandhi","Bhagath Singh",
            "Mahatma Gandhi","Dr.B.R.Ambedkar","Lal Bahadur Shastri","Raja Ram Mohan Roy",
            "Manmohan Singh","Narendra Modi","H.D.Devegowda","Atal bihari Vajpayee",
            "A.P.J.Abdul Kalam","Ram Nath Kovind","Pratibha Patil","Pranab  Mukherjee",
            "Basavaraj Bommai","B.S.Yediyurappa","Siddaramaiah","H.D.Kumaraswami",
            "Mahadevi Verma","Makhanlal Chaturvedi","Rabindranath Tagore","Kuvempu",
            "Sardar Vallabhbhai patel ","Vinayak Damodar Savarkar","Chandrashekar Azad","Sukhdev",
            "Jawaharlal Nehru","Mahatma Gandhi","Rajendra Prasad","Lala Bahadur Shastri"
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        final TextView score=(TextView) findViewById(R.id.textView13);
        submitbutton=(Button) findViewById(R.id.button9);
        quitbutton=(Button) findViewById(R.id.button10);
        tv=(TextView) findViewById(R.id.tvque1);
        radio_g=(RadioGroup) findViewById(R.id.answersgrp1);
        rb1=(RadioButton) findViewById(R.id.radioButton4);
        rb2=(RadioButton) findViewById(R.id.radioButton5);
        rb3=(RadioButton) findViewById(R.id.radioButton6);
        rb4=(RadioButton) findViewById(R.id.radioButton7);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(),"please select one choice",Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans=(RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText=uans.getText().toString();
                Toast.makeText(getApplicationContext(),ansText,Toast.LENGTH_SHORT).show();
                if (ansText.equals(answers[flag])){
                    correct++;
                    Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    wrong++;
                    Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_SHORT).show();
                }
                flag++;
                if (score!=null)
                    score.setText(""+correct);
                if (flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(),MainActivity8.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });
        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),MainActivity8.class);
                startActivity(intent1);
            }
        });


    }
}