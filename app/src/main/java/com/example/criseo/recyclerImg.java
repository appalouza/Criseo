package com.example.criseo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class recyclerImg extends AppCompatActivity {
    private ViewPager viewPager;
    private slideAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
       /* ImgList.add(R.drawable.ic_landscape_white_24dp);
        ImgList.add(R.drawable.ic_play_circle_outline_white_24dp);*/
        viewPager = findViewById(R.id.viewpager);
        myadapter = new slideAdapter(this);
        viewPager.setAdapter(myadapter);
    }


}