package com.example.yg.sleepingsurvey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ButtonActivity1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_activity1_2);
    }

    public void goNextPage(View view) {
        setContentView(R.layout.activity_button_activity1_3);
    }

    public void goBeforePage(View view) {
        setContentView(R.layout.activity_button_activity1_1);
    }
}
