package com.wyj.basemvp.presenter;

import com.wyj.basemvp.view.MvpView;

/**
 * Created by wyj on 2018/8/3.
 * Presenter的基础类，控制的MvpView的子类
 */
public interface MvpPersenter<V extends MvpView> {

    /**
     * 绑顶view
     * @param view
     */
    void attachView(V view);

    /**
     * 解除绑顶
     */
    void detachView();
}
