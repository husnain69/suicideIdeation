package com.example.suicideideation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);

        ImageButton ab1 = findViewById(R.id.a1);
        ab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Depressionhistory.class);
                startActivity(intent);
            }
        });

        ImageButton ab2 = findViewById(R.id.a2);
        ab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Anxietyhistory.class);
                startActivity(intent);
            }
        });

        ImageButton ab3 = findViewById(R.id.a3);
        ab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Stresshistory.class);
                startActivity(intent);
            }
        });

        ImageButton ab4 = findViewById(R.id.a4);
        ab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Suicidehistory.class);
                startActivity(intent);
            }
        });
    }

}
