package com.longines.kekaschina.presenters.presenter;

import com.longines.kekaschina.base.BasePresenter;

public interface LoginPresenter extends BasePresenter {
    boolean doLogin(String usuario, String password);

}
