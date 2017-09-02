package com.pvanshah.sjsuquizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);

        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.bg));

        TextView studentName = (TextView) findViewById(R.id.studentName);
    }
}
