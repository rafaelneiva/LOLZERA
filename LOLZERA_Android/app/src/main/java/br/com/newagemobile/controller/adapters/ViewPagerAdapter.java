package br.com.newagemobile.controller.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.com.newagemobile.controller.fragments.SampleFragment;

/**
 * Created by rafaelneiva on 22/01/15.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String titles[];

    public ViewPagerAdapter(FragmentManager fm, String[] titles2) {
        super(fm);
        titles = titles2;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            // Open FragmentTab1.java
            case 0:
                return SampleFragment.newInstance();
            case 1:
                return SampleFragment.newInstance();
            case 2:
                return SampleFragment.newInstance();
            case 3:
                return SampleFragment.newInstance();

        }
        return null;
    }

    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}
