package com.example.prepa.hackathonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

//starts out with button to call for help, has button to open blog (try using tab?)
public class StudentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        ImageButton b1 = (ImageButton) findViewById(R.id.Blog);

        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(StudentActivity.this, BlogActivity.class));
            }
        });
    }
}
