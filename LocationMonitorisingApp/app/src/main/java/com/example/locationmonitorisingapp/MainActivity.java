package com.example.locationmonitorisingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private TextView registerText;
    private EditText Username;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.usernameLoginScreen);
        Password = (EditText) findViewById(R.id.passwordLoginScreen);

        loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //validator is a counter that we use later to decide whether the user can access it's account or not.
                int validator = 0;

                //validation for Username field
                if (Username.getText().toString().trim().length() == 0) {
                    Username.setError("This is a required field!");
                    validator++;
                }

                //validation for Password field
                if (Password.getText().toString().trim().length() == 0) {
                    Password.setError("This is a required field!");
                    validator++;
                }

                //TODO: still need to do the real validations based on the users real details.

                if (validator == 0) {
                    SuccesfulLoginActivity();
                }
            }
        });

        registerText = (TextView) findViewById(R.id.register);
        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewUserRegistration();
            }
        });

    }

    public void SuccesfulLoginActivity() {
        Intent intent = new Intent(this, SuccesfulLogin.class);
        startActivity(intent);
    }

    public void NewUserRegistration() {
        Intent intent = new Intent(this, UserRegistration.class);
        startActivity(intent);
    }
}