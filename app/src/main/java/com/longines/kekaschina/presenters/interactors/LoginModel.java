package com.longines.kekaschina.presenters.interactors;

import android.util.Log;

import com.longines.kekaschina.base.BaseView;
import com.longines.kekaschina.presenters.presenter.LoginPresenter;
import com.longines.kekaschina.views.interfaces.LoginView;

import static com.longines.kekaschina.base.BaseActivity.TAG;

public class LoginModel implements LoginPresenter {
    private LoginView view;

    public LoginModel(BaseView view) {
        Log.i(TAG, "Modelo iniciado");
        setView(view);
    }

    @Override
    public void doLogin() {

    }


    @Override
    public void setView(BaseView view) {
        this.view = (LoginView) view;
    }
}
