package com.bscs4b.lab_task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Quiz extends AppCompatActivity {

    Integer correct=0;
    Integer wrong=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void mcq1(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton2:
                if (checked)
                    correct++;
                    break;
            case R.id.radioButton3:
                if (checked)
                    wrong++;
                    break;
            case R.id.radioButton4:
                if (checked)
                    wrong++;
                    break;
        }

    }

    public void mcq2(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton5:
                if (checked)
                    // Pirates are the best
                    wrong++;
                    break;
            case R.id.radioButton6:
                if (checked)
                    // Ninjas rule
                    wrong++;
                    break;
            case R.id.radioButton7:
                if (checked)
                    correct++;
                    // Pirates are the best
                    break;
        }


    }
    public void mcq3(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton8:
                if (checked)
                    // Pirates are the best
                    wrong++;
                    break;
            case R.id.radioButton9:
                if (checked)
                    // Ninjas rule
                    wrong++;
                    break;
            case R.id.radioButton10:
                if (checked)
                    correct++;
                    // Pirates are the best
                    break;
        }


    }
    public void mcq4(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton11:
                if (checked)
                    wrong++;
                    // Pirates are the best
                    break;
            case R.id.radioButton12:
                if (checked)
                    wrong++;
                    // Ninjas rule
                    break;
            case R.id.radioButton13:
                if (checked)
                    correct++;
                    // Pirates are the best
                    break;
        }


    }
    public void mcq5(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton14:
                if (checked)
                    wrong++;
                    // Pirates are the best
                    break;
            case R.id.radioButton15:
                if (checked)
                    correct++;
                    // Ninjas rule
                    break;
            case R.id.radioButton16:
                if (checked)
                    wrong++;
                    // Pirates are the best
                    break;
        }


    }
    public void mcq6(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton17:
                if (checked)
                    correct++;
                    // Pirates are the best
                    break;
            case R.id.radioButton18:
                if (checked)
                    wrong++;
                    // Ninjas rule
                    break;
            case R.id.radioButton19:
                if (checked)
                    wrong++;
                    // Pirates are the best
                    break;
        }


    }
    public void mcq7(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton20:
                if (checked)
                    wrong++;
                    // Pirates are the best
                    break;
            case R.id.radioButton21:
                if (checked)
                    wrong++;
                    // Ninjas rule
                    break;
            case R.id.radioButton22:
                if (checked)
                    correct++;
                    // Pirates are the best
                    break;
        }


    }
    public void mcq8(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton23:
                if (checked)
                    wrong++;
                    // Pirates are the best
                    break;
            case R.id.radioButton24:
                if (checked)
                    correct++;
                    // Ninjas rule
                    break;
            case R.id.radioButton25:
                if (checked)
                    wrong++;
                    // Pirates are the best
                    break;
        }


    }
    public void mcq9(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton26:
                if (checked)
                    wrong++;
                    // Pirates are the best
                    break;
            case R.id.radioButton27:
                if (checked)
                    correct++;
                    // Ninjas rule
                    break;
            case R.id.radioButton28:
                if (checked)
                    wrong++;
                    // Pirates are the best
                    break;
        }


    }
    public void mcq10(View view){

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton29:
                if (checked)
                    correct++;
                    // Pirates are the best
                    break;
            case R.id.radioButton30:
                if (checked)
                    wrong++;
                    // Ninjas rule
                    break;
            case R.id.radioButton31:
                if (checked)
                    wrong++;
                    break;
        }
    }
    public void submit(View view){

        Intent intent = new Intent(getApplicationContext(),Resultmcq.class);

        intent.putExtra("c",correct);
        intent.putExtra("w",wrong);
        String STR="Q";
        intent.putExtra("s",STR);
        startActivity(intent);


    }
}