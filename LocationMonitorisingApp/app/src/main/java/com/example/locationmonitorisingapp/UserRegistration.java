package com.example.locationmonitorisingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserRegistration extends AppCompatActivity {

    private Button registerButton;
    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText password;
    private EditText confirmedPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.passwordLoginScreen);
        confirmedPassword = (EditText) findViewById(R.id.confirmPassword);

        registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //validator is a counter that we use later to decide whether the user can create a new account or not.
                int validator = 0;

                //validation for First Name field
                if (firstName.getText().toString().trim().length() == 0) {
                    firstName.setError("This is a required field!");
                    validator++;
                }

                //validation for Last Name field
                if (lastName.getText().toString().trim().length() == 0) {
                    lastName.setError("This is a required field!");
                    validator++;
                }

                //validation for Email field
                if (email.getText().toString().trim().length() == 0) {
                    email.setError("This is a required field!");
                    validator++;
                }

                //validation for Password field
                if (password.getText().toString().trim().length() == 0) {
                    password.setError("This is a required field!");
                    validator++;
                }

                //validation for checking if the Password field matches the Confirm Password field
                if (!password.getText().toString().equals(confirmedPassword.getText().toString())) {
                    confirmedPassword.setError("Passwords are not matching");
                    validator++;
                }

                if (validator == 0) {
                    //TODO: call POST method from backend to register the new user
                    showToast("New user registred!");
                }
            }
        });
    }

    //method for showing a toast message
    public void showToast(String message) {
        Toast.makeText(UserRegistration.this, message, Toast.LENGTH_SHORT).show();
    }
}