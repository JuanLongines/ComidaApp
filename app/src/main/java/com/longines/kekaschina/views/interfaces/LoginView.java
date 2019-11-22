package com.longines.kekaschina.views.interfaces;

import com.longines.kekaschina.base.BaseView;

public interface LoginView extends BaseView {
    void showUserError(String message);

    void showPasswordError(String message);

    boolean esUsuarioValido(String usuario);

    boolean esPasswordValido(String password);
}
