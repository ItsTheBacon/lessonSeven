package com.example.lessonseven;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingActivity extends AppCompatActivity {
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    

   WormDotsIndicator wormDotsIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        viewPager = findViewById(R.id.view_pager);
        wormDotsIndicator = (WormDotsIndicator) findViewById(R.id.worm_dots_indicator);



        List<OnBoradingModel> list = new ArrayList<>();
        list.add(new OnBoradingModel("Welcome to Surf", "provide essential stuff for your ui desins every tuesday!", R.drawable.page1content));
        list.add(new OnBoradingModel("Design Template uploads Every TuesDay!", "Make sure to take a look my uplab profile every tuesday", R.drawable.page2content));
        list.add(new OnBoradingModel("Download now!", "You can follow me if you wantand comment on any to get some freebies ", R.drawable.contentpage3));
        wormDotsIndicator = (WormDotsIndicator) findViewById(R.id.worm_dots_indicator);
        viewPager = (ViewPager) findViewById(R.id.view_pager);


        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(viewPagerAdapter);
        wormDotsIndicator.setViewPager(viewPager);

//        ViewPagerOnPageListner();
    }

//    private void ViewPagerOnPageListner() {
//
//    }
}