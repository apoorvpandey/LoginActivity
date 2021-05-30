package com.example.loginactivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> login());

    }

    private void login() {
        String emailAddress = email.getText().toString();
        String password1 = password.getText().toString();

        Toast.makeText(MainActivity.this, "Your credentials are below as\n email= " + emailAddress + " " + "password = " +
                password1, Toast.LENGTH_SHORT).show();
    }

}