package br.com.newagemobile.controller.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.newagemobile.R;

/**
 * Created by rafaelneiva on 6/8/15.
 */
public class LoginFragment extends Fragment {

    // **** Fragment Instance **** //
    public static LoginFragment newInstance(String option) {
        LoginFragment f = new LoginFragment();
        Bundle args = new Bundle();
        args.putString("option", option);
        f.setArguments(args);
        return f;
    }

    // **** Layout Inflater **** //
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_login, container, false);

        // setup actionbar
        setupActionBar();

        // init components
        initComponents(view);

        return view;
    }

    private void setupActionBar() {
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (actionBar != null) {
            // todo
        }
    }

    private void initComponents(View v) {

    }
}
