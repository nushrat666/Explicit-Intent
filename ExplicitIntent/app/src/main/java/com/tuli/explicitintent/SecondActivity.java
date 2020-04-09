package com.tuli.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String email = intent.getStringExtra("email");
        String pass = intent.getStringExtra("password");
        int index = intent.getIntExtra("index",0);
Student student=(Student)intent.getSerializableExtra("student");

        ((TextView)findViewById(R.id.showUser)).setText(email+"\n"+pass+"\n"+email.length()+
                "\n"+student.getName());
    }
}
