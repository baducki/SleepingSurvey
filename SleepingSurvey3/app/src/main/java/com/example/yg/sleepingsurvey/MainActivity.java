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

            case R.id.main_button2 :
                setContentView(R.layout.activity_button_activity2_1);
                break;

            case R.id.main_button3 :
                setContentView(R.layout.activity_button_activity3_1);
                break;
            case R.id.main_button4 :
                setContentView(R.layout.activity_button_activity4_1);
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
            case R.id.next_button3_1 :
                setContentView(R.layout.activity_button_activity3_2);
                break;
            case R.id.next_button3_2 :
                setContentView(R.layout.activity_button_activity3_3);
                break;
            case R.id.next_button3_3 :
                setContentView(R.layout.activity_button_activity3_4);
                break;
            case R.id.next_button3_4 :
                setContentView(R.layout.activity_button_activity3_5);
                break;
            case R.id.next_button3_5 :
                setContentView(R.layout.activity_button_activity3_6);
                break;
            case R.id.next_button3_6 :
                setContentView(R.layout.activity_button_activity3_7);
                break;
            case R.id.next_button3_7 :
                setContentView(R.layout.activity_button_activity3_8);
                break;
            case R.id.next_button4_1 :
                setContentView(R.layout.activity_button_activity4_2);
                break;
            case R.id.next_button4_2 :
                setContentView(R.layout.activity_button_activity4_3);
                break;
            case R.id.next_button4_3 :
                setContentView(R.layout.activity_button_activity4_4);
                break;
            case R.id.next_button4_4 :
                setContentView(R.layout.activity_button_activity4_5);
                break;
            case R.id.next_button4_5 :
                setContentView(R.layout.activity_button_activity4_6);
                break;
            case R.id.next_button4_6 :
                setContentView(R.layout.activity_button_activity4_7);
                break;
            case R.id.next_button4_7 :
                setContentView(R.layout.activity_button_activity4_8);
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
            case R.id.before_button3_2 :
                setContentView(R.layout.activity_button_activity3_1);
                break;
            case R.id.before_button3_3 :
                setContentView(R.layout.activity_button_activity3_2);
                break;
            case R.id.before_button3_4 :
                setContentView(R.layout.activity_button_activity3_3);
                break;
            case R.id.before_button3_5 :
                setContentView(R.layout.activity_button_activity3_4);
                break;
            case R.id.before_button3_6 :
                setContentView(R.layout.activity_button_activity3_5);
                break;
            case R.id.before_button3_7 :
                setContentView(R.layout.activity_button_activity3_6);
                break;
            case R.id.before_button3_8 :
                setContentView(R.layout.activity_button_activity3_7);
                break;
            case R.id.before_button4_2 :
                setContentView(R.layout.activity_button_activity4_1);
                break;
            case R.id.before_button4_3 :
                setContentView(R.layout.activity_button_activity4_2);
                break;
            case R.id.before_button4_4 :
                setContentView(R.layout.activity_button_activity4_3);
                break;
            case R.id.before_button4_5 :
                setContentView(R.layout.activity_button_activity4_4);
                break;
            case R.id.before_button4_6 :
                setContentView(R.layout.activity_button_activity4_5);
                break;
            case R.id.before_button4_7 :
                setContentView(R.layout.activity_button_activity4_6);
                break;
            case R.id.before_button4_8 :
                setContentView(R.layout.activity_button_activity4_7);
                break;
        }
    }

    void goMainPage(View view) {
        setContentView(R.layout.activity_main);
    }
}
