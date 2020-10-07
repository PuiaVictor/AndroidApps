package com.example.testandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button generateButton = findViewById(R.id.generateButton);
        final TextView resultTextView = findViewById(R.id.resultView);
        final SeekBar seekBar = findViewById(R.id.seekBar);

        generateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int rand = new Random().nextInt(seekBar.getProgress()) + 1;
                resultTextView.setText(String.valueOf(rand));
            }
        });
    }
}