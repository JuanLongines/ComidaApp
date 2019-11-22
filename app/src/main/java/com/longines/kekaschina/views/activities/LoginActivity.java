package com.longines.kekaschina.views.activities;

import android.os.Bundle;

import com.longines.kekaschina.R;
import com.longines.kekaschina.base.BaseActivity;
import com.longines.kekaschina.presenters.interactors.LoginModel;
import com.longines.kekaschina.views.interfaces.LoginView;
import com.rengwuxian.materialedittext.MaterialEditText;

public class LoginActivity extends BaseActivity implements LoginView {

    private LoginModel model;
    private MaterialEditText editTextUsuario, editTextPassword;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        showUserError("Error");
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
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

    @Override
    public void showUserError(String message) {
        editTextUsuario.setError(message);
    }
}
