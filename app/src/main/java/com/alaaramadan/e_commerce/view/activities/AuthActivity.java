package com.alaaramadan.e_commerce.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alaaramadan.e_commerce.utils.HelperMethod;
import com.alaaramadan.e_commerce.R;
import com.alaaramadan.e_commerce.view.base.BaseActivity;
import com.alaaramadan.e_commerce.view.fragments.user_cycle.LoginFragment;

import static com.alaaramadan.e_commerce.utils.HelperMethod.replaceFragment;

public class AuthActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_auth );
        replaceFragment(getSupportFragmentManager(),R.id.auth_activity_frameLayout_container,new LoginFragment() );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }
}