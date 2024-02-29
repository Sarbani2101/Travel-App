package com.example.tourismapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tourismapp.Domain.PopularDomain;
import com.example.tourismapp.R;

public class DetailActivity extends AppCompatActivity {

    private TextView titleTxt, locationTxt, descriptionTxt, scoreTxt, wifiTxt, guideTxt, bedTxt;
    private PopularDomain item;
    private ImageView picImg, backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();
        setVariable();
        
    }

    private void setVariable() {
        item= (PopularDomain) getIntent().getSerializableExtra("object");

        titleTxt.setText(item.getTitle());
        locationTxt.setText(item.getLocation());
        scoreTxt.setText(""+item.getScore());
        descriptionTxt.setText(item.getDescription());
        bedTxt.setText(item.getBed()+" Bed");



        if (item.isGuide()){
            guideTxt.setText("Guide");
        }else {
            guideTxt.setText("No-Guide");
        }
        if (item.isWifi()){
            wifiTxt.setText("Wifi");
        }else {
            wifiTxt.setText("No-Wifi");
        }
        int drawableResId=getResources().getIdentifier(item.getPic(),"drawable",getPackageName());

        Glide.with(this)
                .load(drawableResId)
                .into(picImg);

        backBtn.setOnClickListener(v -> finish());

    }

    private void initView() {
        titleTxt = findViewById(R.id.titleTxt);
        locationTxt = findViewById(R.id.locationTxt);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        scoreTxt = findViewById(R.id.scoreTxt);
        wifiTxt = findViewById(R.id.wifiTxt);
        guideTxt = findViewById(R.id.guideTxt);
        bedTxt = findViewById(R.id.bedTxt);
        picImg = findViewById(R.id.picImg);
        scoreTxt = findViewById(R.id.scoreTxt);
        backBtn = findViewById(R.id.backBtn);
    }
}