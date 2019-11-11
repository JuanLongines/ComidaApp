package com.longines.kekaschina.base;

import android.app.ProgressDialog;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment implements BaseView {
    public static final String TAG = BaseFragment.class.getSimpleName();
    private ProgressDialog progressDialog;

    @Override
    public void onStart() {
        super.onStart();
        initComponents();
        initPresenter();
    }

    protected abstract void initPresenter();

    protected abstract void initComponents();

    @Override
    public void showErrMsg(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }
}
