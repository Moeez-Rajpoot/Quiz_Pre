package com.bscs4b.lab_task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class truefalse extends AppCompatActivity {

    Integer correct=0;
    Integer wrong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truefalse);
    }

    public void T1(View view) {

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
        }


    }

    public void T2(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton5:
                if (checked)
                    correct++;
                break;
            case R.id.radioButton6:
                if (checked)
                    wrong++;
                break;
        }

    }
    public void T3(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton8:
                if (checked)
                    correct++;
                break;
            case R.id.radioButton9:
                if (checked)
                    wrong++;
                break;

        }


    }
    public void T4(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton11:
                if (checked)
                    correct++;
                break;
            case R.id.radioButton12:
                if (checked)
                    wrong++;
                break;

        }
    }
    public void T5(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton14:
                if (checked)
                    wrong++;
                break;
            case R.id.radioButton15:
                if (checked)
                    correct++;
                break;

        }
    }
    public void T6(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton17:
                if (checked)
                    correct++;
                break;
            case R.id.radioButton18:
                if (checked)
                    wrong++;
                break;

        }
    }
    public void T7(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton20:
                if (checked)
                    wrong++;
                break;
            case R.id.radioButton21:
                if (checked)
                    correct++;
                break;

        }
    }
    public void T8(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton23:
                if (checked)
                    wrong++;
                break;
            case R.id.radioButton24:
                if (checked)
                    correct++;
                break;

        }
    }
    public void T9(View view) {


        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton26:
                if (checked)
                    wrong++;
                break;
            case R.id.radioButton27:
                if (checked)
                    correct++;
                break;

        }

    }
    public void T10(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton29:
                if (checked)
                    correct++;
                break;
            case R.id.radioButton30:
                if (checked)
                    wrong++;
                break;

        }
    }

    public void SUBMIT(View view) {

        Intent intent = new Intent(getApplicationContext(),Resultmcq.class);

        intent.putExtra("c",correct);
        intent.putExtra("w",wrong);
        String STR="TRUE & FALSE RESULT";
        intent.putExtra("s",STR);
        startActivity(intent);


    }
    }
