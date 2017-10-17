package com.learnshare.onboardingscreens;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

class OnboardingPagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter
{
    public OnboardingPagerAdapter(FragmentManager fm,OnboardingModel model)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        return OnboardingFragment.newInstance("","");
    }

    @Override
    public int getCount()
    {
        return 0;
    }
}
