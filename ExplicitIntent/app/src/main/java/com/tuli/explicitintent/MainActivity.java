package com.tuli.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText emailET, passwordET;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);

        emailET=findViewById(R.id.emailValue);
        passwordET=findViewById(R.id.passwordValue);
        loginButton=findViewById(R.id.loginBtn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailET.getText().toString();
                String password = passwordET.getText().toString();

                if(email.isEmpty()){
                    emailET.setError(getString(R.string.empty_field_error_msg));
                }else if(password.isEmpty()){
                    passwordET.setError(getString(R.string.empty_field_error_msg));
                }else{

                    Student student=new Student();
                    student.setName("Alam");


                    Intent intent= new Intent(MainActivity.this,SecondActivity.class);

                    intent.putExtra("email",email);
                    intent.putExtra("password",password);
                    intent.putExtra("index",90);
                    intent.putExtra("student",student);



                    startActivity(intent);
                }

            }
        });


    }
}
