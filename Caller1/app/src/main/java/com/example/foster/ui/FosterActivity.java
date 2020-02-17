package com.example.foster.ui;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.caller.R;
import com.example.foster.data.FosterAdapter;
import com.google.android.material.tabs.TabLayout;


public class FosterActivity extends AppCompatActivity {



    TabLayout tabLayout;

    ViewPager viewPager;


    private FosterAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foster);
        findViews();
        setupTabLayout();
    }

    private void findViews() {
        tabLayout=findViewById(R.id.fosterTabLayout);
        viewPager=findViewById(R.id.fosterViewPager);
    }


    private void setupTabLayout() {
        adapter = new FosterAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
