package br.com.newagemobile.controller.activities;

import android.app.ActivityManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import br.com.newagemobile.R;
import br.com.newagemobile.controller.fragments.ViewPagerFragment;

public class MainActivity extends ActionBarActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private Toolbar mToolbar;
    private ListView mDrawerList;
    private ViewPagerFragment viewPagerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerFragment = ViewPagerFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content, viewPagerFragment)
                .commit();

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.navdrawer);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
            mToolbar.setNavigationIcon(R.drawable.ic_ab_drawer);
        }

        drawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.app_name, R.string.app_name);
        mDrawerLayout.setDrawerListener(drawerToggle);
        String[] titles = new String[]{
                "Teal", "Light green", "Deep orange", "Pink", "Purple", "Red", "Deep purple"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, titles);
        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        mDrawerList.setBackgroundColor(getResources().getColor(R.color.teal));
                        mToolbar.setBackgroundColor(getResources().getColor(R.color.teal));
                        viewPagerFragment.mPagerTab.setBackgroundColor(getResources().getColor(R.color.teal));
                        mDrawerLayout.closeDrawer(Gravity.START);
                        tintNotificationBar(R.color.teal_dark);

                        break;
                    case 1:
                        mDrawerList.setBackgroundColor(getResources().getColor(R.color.light_green));
                        mToolbar.setBackgroundColor(getResources().getColor(R.color.light_green));
                        viewPagerFragment.mPagerTab.setBackgroundColor(getResources().getColor(R.color.light_green));
                        mDrawerLayout.closeDrawer(Gravity.START);
                        tintNotificationBar(R.color.light_green_dark);

                        break;
                    case 2:
                        mDrawerList.setBackgroundColor(getResources().getColor(R.color.deep_orange));
                        mToolbar.setBackgroundColor(getResources().getColor(R.color.deep_orange));
                        viewPagerFragment.mPagerTab.setBackgroundColor(getResources().getColor(R.color.deep_orange));
                        mDrawerLayout.closeDrawer(Gravity.START);
                        tintNotificationBar(R.color.deep_orange_dark);

                        break;
                    case 3:
                        mDrawerList.setBackgroundColor(getResources().getColor(R.color.pink));
                        mToolbar.setBackgroundColor(getResources().getColor(R.color.pink));
                        viewPagerFragment.mPagerTab.setBackgroundColor(getResources().getColor(R.color.pink));
                        mDrawerLayout.closeDrawer(Gravity.START);
                        tintNotificationBar(R.color.pink_dark);

                        break;
                    case 4:
                        mDrawerList.setBackgroundColor(getResources().getColor(R.color.purple));
                        mToolbar.setBackgroundColor(getResources().getColor(R.color.purple));
                        viewPagerFragment.mPagerTab.setBackgroundColor(getResources().getColor(R.color.purple));
                        mDrawerLayout.closeDrawer(Gravity.START);
                        tintNotificationBar(R.color.purple_dark);

                        break;
                    case 5:
                        mDrawerList.setBackgroundColor(getResources().getColor(R.color.red));
                        mToolbar.setBackgroundColor(getResources().getColor(R.color.red));
                        viewPagerFragment.mPagerTab.setBackgroundColor(getResources().getColor(R.color.red));
                        mDrawerLayout.closeDrawer(Gravity.START);
                        tintNotificationBar(R.color.red_dark);

                        break;
                    case 6:
                        mDrawerList.setBackgroundColor(getResources().getColor(R.color.deep_purple));
                        mToolbar.setBackgroundColor(getResources().getColor(R.color.deep_purple));
                        viewPagerFragment.mPagerTab.setBackgroundColor(getResources().getColor(R.color.deep_purple));
                        mDrawerLayout.closeDrawer(Gravity.START);
                        tintNotificationBar(R.color.deep_purple_dark);

                        break;
                }

            }
        });
    }

    private void tintNotificationBar(int colorId) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(colorId));
            ActivityManager.TaskDescription tDesc =
                    new ActivityManager.TaskDescription(getResources().getString(R.string.app_name), null, getResources().getColor(colorId));
            this.setTaskDescription(tDesc);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(Gravity.START);
                return true;

            case R.id.action_settings:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    public static class SplashsFragment extends Fragment {

        public SplashsFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
