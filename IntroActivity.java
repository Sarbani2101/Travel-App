package com.example.tourismapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tourismapp.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ConstraintLayout introBtn=findViewById(R.id.introBtn);
        introBtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, MainActivity.class)));
    }
}