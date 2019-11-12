package com.longines.kekaschina.views.activities;

import android.os.Bundle;

import com.longines.kekaschina.R;
import com.longines.kekaschina.base.BaseActivity;
import com.longines.kekaschina.presenters.interactors.LoginModel;
import com.longines.kekaschina.views.interfaces.LoginView;

public class LoginActivity extends BaseActivity implements LoginView {

    private LoginModel model;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showErrMsg(String msg) {

    }

    @Override
    protected void initPresenter() {
        model = new LoginModel(this);
    }

    @Override
    protected void initComponents() {

    }
}
