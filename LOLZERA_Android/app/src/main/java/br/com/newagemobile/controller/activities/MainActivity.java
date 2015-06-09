package br.com.newagemobile.controller.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import br.com.newagemobile.R;
import br.com.newagemobile.controller.fragments.LoginFragment;
import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by rafaelneiva on 6/8/15.
 */
public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.toolbar) Toolbar toolbar;
    @InjectView(R.id.drawerLayout) DrawerLayout drawerLayout;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content, LoginFragment.newInstance(null))
                    .commit();
        }
    }
}
