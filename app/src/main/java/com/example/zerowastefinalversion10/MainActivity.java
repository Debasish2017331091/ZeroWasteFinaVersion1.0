package com.example.zerowastefinalversion10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button LogInButton,SignUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogInButton = findViewById(R.id.logInButton);
        SignUpButton=findViewById(R.id.signUpButton);
    }
}
