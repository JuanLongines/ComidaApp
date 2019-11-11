package com.longines.kekaschina.base;

public interface BasePresenter<V extends BaseView> {
    void setView(V view);

}
