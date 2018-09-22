package com.example.android.inventoryappstage2;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {


    private Context mContext;

        public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CameraFragment();
        } else if (position == 1) {
            return new PhoneFragment();
        } else if (position == 2) {
            return new HeadphonesFragment();
        } else if (position == 3){
            return new ComputersFragment();
        } else {
            return new UnknownItemsFragment();
        }
    }


    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_camera);
        } else if (position == 1) {
            return mContext.getString(R.string.category_phone);
        } else if (position == 2) {
            return mContext.getString(R.string.category_headphones);
        } else if (position == 3) {
            return mContext.getString(R.string.category_computers);
        } else {
            return mContext.getString(R.string.category_unknown);
        }
    }
}

