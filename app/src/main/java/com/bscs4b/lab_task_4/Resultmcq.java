package com.bscs4b.lab_task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultmcq extends AppCompatActivity {

    TextView Correct;
    TextView Wrong;
    Button menu;
    Button again;
    TextView head;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultmcq);
        Correct=findViewById(R.id.textView19);
        Wrong=findViewById(R.id.textView20);
        menu=findViewById(R.id.button6);
        again=findViewById(R.id.button7);
        head=findViewById(R.id.textView14);


        Intent intent = getIntent();
        Integer str1 = intent.getIntExtra("c",0);
        Integer str2 = intent.getIntExtra("w",0);
        String str3 = intent.getStringExtra("s");

        Correct.setText("Correct : "+ str1);
        Wrong.setText("Wrong :  " + str2);
        head.setText(""+ str3);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str3=="MCQ'S RESULT") {
                    Intent intent1 = new Intent(getApplicationContext(), Quiz.class);
                    startActivity(intent1);
                }
                else
                {
                    Intent intent1 = new Intent(getApplicationContext(), truefalse.class);
                    startActivity(intent1);
                }
            }
        });

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
            }
        });



    }




}