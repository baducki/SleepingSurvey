package com.example.yg.sleepingsurvey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void setMainButtonView(View view) {
        switch (view.getId()) {
            case R.id.main_button1 :
                setContentView(R.layout.activity_button_activity1_1);
                break;
        }
    }

    void goNextPage(View view) {
        switch (view.getId()) {
            case R.id.next_button1_1 :
                setContentView(R.layout.activity_button_activity1_2);
                break;
            case R.id.next_button1_2 :
                setContentView(R.layout.activity_button_activity1_3);
                break;
            case R.id.next_button1_3 :
                setContentView(R.layout.activity_button_activity1_4);
                break;
            case R.id.next_button1_4 :
                setContentView(R.layout.activity_button_activity1_5);
                break;
            case R.id.next_button1_5 :
                setContentView(R.layout.activity_button_activity1_6);
                break;
            case R.id.next_button1_6 :
                setContentView(R.layout.activity_button_activity1_7);
                break;

        }
    }

    void goBeforePage(View view) {
        switch (view.getId()) {
            case R.id.before_button1_2 :
                setContentView(R.layout.activity_button_activity1_1);
                break;
            case R.id.before_button1_3 :
                setContentView(R.layout.activity_button_activity1_2);
                break;
            case R.id.before_button1_4 :
                setContentView(R.layout.activity_button_activity1_3);
                break;
            case R.id.before_button1_5 :
                setContentView(R.layout.activity_button_activity1_4);
                break;
            case R.id.before_button1_6 :
                setContentView(R.layout.activity_button_activity1_5);
                break;
            case R.id.before_button1_7 :
                setContentView(R.layout.activity_button_activity1_6);
                break;
        }
    }

    void goMainPage(View view) {
        switch (view.getId()) {
            case R.id.end_button1:
                setContentView(R.layout.activity_main);
                break;
        }
    }
}
