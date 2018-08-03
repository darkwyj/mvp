package com.wyj.basemvp.base;

import com.wyj.basemvp.presenter.MvpPersenter;
import com.wyj.basemvp.view.MvpView;

/**
 * Created by wyj on 2018/8/3.
 * -用于对获取MvpView、创建以及获取presenter
 */
public interface BaseDelegateCallback<P extends MvpPersenter, V extends MvpView> {
    void setPersenter();

    P getPersenter();

    P createPersenter();

    V getMvpView();
}
