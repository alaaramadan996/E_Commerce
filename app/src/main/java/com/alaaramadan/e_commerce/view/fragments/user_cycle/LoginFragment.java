package com.alaaramadan.e_commerce.view.fragments.user_cycle;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alaaramadan.e_commerce.R;
import com.alaaramadan.e_commerce.view.base.BaseFragment;


public class LoginFragment extends BaseFragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_login, container, false );
    }
}