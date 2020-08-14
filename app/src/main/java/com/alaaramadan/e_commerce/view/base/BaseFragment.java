package com.alaaramadan.e_commerce.view.base;

import android.view.View;

import androidx.fragment.app.Fragment;

import com.alaaramadan.e_commerce.utils.HelperMethod;
import com.alaaramadan.e_commerce.view.activities.HomeActivity;

import static com.alaaramadan.e_commerce.data.local.SharedPreferencesManger.loadLang;


public class BaseFragment extends Fragment {
    public BaseActivity baseActivity;
    public HomeActivity homeCycleActivity;

    public void setUpActivity() {
        HelperMethod.changeLang(getActivity(),"ar");
        baseActivity = (BaseActivity) getActivity();
        baseActivity.baseFragment = this;

        try {
            homeCycleActivity = (HomeActivity) getActivity();
        } catch (Exception e) {

        }
    }

    public void onBack() {
        baseActivity.superBackPressed();
    }

    public String getLang() {
        return loadLang(getActivity());
    }

    public void setOnClick(View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickItem(view);
            }
        });
    }

    public void onClickItem(View view){

    }


}
