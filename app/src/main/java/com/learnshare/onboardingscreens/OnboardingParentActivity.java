package com.learnshare.onboardingscreens;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OnboardingParentActivity extends AppCompatActivity {

    private ViewPager mViewPager ;

    private FragmentStatePagerAdapter mAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.onboarding_parent_activity);

        mViewPager = (ViewPager) findViewById(R.id.vpOnboarding);

        mAdapter = new OnboardingPagerAdapter(getSupportFragmentManager(),null);


    }
}
