package com.alaaramadan.e_commerce.view.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.alaaramadan.e_commerce.R;
import com.alaaramadan.e_commerce.databinding.FragmentBinding;


public class EmptyFragment extends BaseFragment {

    private FragmentBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setUpActivity();
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_, container, false);
        return binding.getRoot();

    }

}
