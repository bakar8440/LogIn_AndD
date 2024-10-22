package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginbutton;
    Button signupbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


            username = findViewById(R.id.username);
            password = findViewById(R.id.password);
            loginbutton= findViewById(R.id.loginbutton);
            signupbutton= findViewById(R.id.signupbutton);

            loginbutton.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    if(username.getText().toString().equals("user") && password.getText().toString().equals("123456789")){
                        Toast.makeText(MainActivity.this,"Log in Successful !",Toast.LENGTH_SHORT).show();

                    }
                    else {
                        Toast.makeText(MainActivity.this,"Log in failed",Toast.LENGTH_SHORT).show();
                    }

                }
            });

            loginbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, log_in.class);
                    startActivity(intent);

                }
            });

            signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, sign_up.class);
                startActivity(intent);

            }
        });

    }
}