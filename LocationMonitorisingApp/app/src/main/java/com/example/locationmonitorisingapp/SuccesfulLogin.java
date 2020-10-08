package com.example.locationmonitorisingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SuccesfulLogin extends AppCompatActivity {

    private Button simpleLocation;
    private Button automaticLocation;
    private Button stopSharing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succesful_login);

        simpleLocation = (Button) findViewById(R.id.simpleLocation);
        simpleLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Your location has been shared.");
                //TODO: share location once
            }
            }
        );

        automaticLocation = (Button) findViewById(R.id.automaticLocation);
        automaticLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Automatic location sharing has been turned on.");
                //TODO: turn on automatic sharing of location
            }
        }
        );

        stopSharing = (Button) findViewById(R.id.stopSharing);
        stopSharing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Location sharing has been stopped.");
                //TODO: stop location sharing
            }
        }
        );
    }

    //method for showing a toast message
    public void showToast(String message) {
        Toast.makeText(SuccesfulLogin.this, message, Toast.LENGTH_SHORT).show();
    }
}