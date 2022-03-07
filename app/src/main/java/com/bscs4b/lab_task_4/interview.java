package com.bscs4b.lab_task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class interview extends AppCompatActivity {

    TextView XY;
    TextView question;
    TextView Answer;

    ImageView right;
    ImageView left;
    ImageView A;

    String[] questions;
    String[] answers;

    Integer counter=1;
    Integer index=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);

        XY=findViewById(R.id.textView);
        question=findViewById(R.id.textView3);
        Answer=findViewById(R.id.textView4);

        right=findViewById(R.id.imageView3);
        left=findViewById(R.id.imageView);
        A=findViewById(R.id.imageView2);

        questions=getResources().getStringArray(R.array.Questions);
        answers=getResources().getStringArray(R.array.Answers);

        question.setText(questions[0]);
        XY.setText(index+"/10");
    }

    public void right(View view) {
        if (counter<=9) {
            index++;
            XY.setText(index+"/10");
            question.setText(questions[counter]);
            Answer.setText("PRESS A Button to display Answer");
            counter++;
        }
        else
        {
            Toast toast=Toast.makeText(getApplicationContext(),"No more Questions",Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    public void left(View view) {

        if (counter>1) {
            index--;
            XY.setText(index+"/10");
            counter--;
            question.setText(questions[counter-1]);
            Answer.setText("PRESS A Button to display Answer");
        }
        else
        {
            Toast toast=Toast.makeText(getApplicationContext(),"No more Questions",Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void A(View view) {

            Answer.setText(answers[counter-1]);
    }
}