package com.longines.kekaschina.views.activities;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import com.longines.kekaschina.R;
import com.longines.kekaschina.base.BaseActivity;
import com.longines.kekaschina.presenters.interactors.LoginModel;
import com.longines.kekaschina.views.interfaces.LoginView;
import com.rengwuxian.materialedittext.MaterialEditText;

public class LoginActivity extends BaseActivity implements LoginView, View.OnClickListener {

    private LoginModel model;
    private MaterialEditText editTextUsuario, editTextPassword;
    private Button buttonLogin;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
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
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(this);
    }

    @Override
    public void showUserError(String message) {
        editTextUsuario.setError(message);
    }

    @Override
    public void showPasswordError(String message) {
        editTextPassword.setError(message);
    }

    @Override
    public boolean esUsuarioValido(String usuario) {
        return !TextUtils.isEmpty(usuario) && usuario.length() >= 8;
    }

    @Override
    public boolean esPasswordValido(String password) {
        return !TextUtils.isEmpty(password) && password.length() >= 6;
    }

    @Override
    public void onClick(View item) {
        switch (item.getId()) {
            case R.id.buttonLogin:
                iniciarLogin();
                break;
        }
    }

    private void iniciarLogin() {
        String usuario = editTextUsuario.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        model.doLogin(usuario, password);
    }
}
