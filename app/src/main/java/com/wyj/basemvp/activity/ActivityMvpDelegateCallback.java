package com.wyj.basemvp.activity;

import com.wyj.basemvp.base.BaseDelegateCallback;
import com.wyj.basemvp.presenter.MvpPersenter;
import com.wyj.basemvp.view.MvpView;

/**
 * Created by wyj on 2018/8/3.
 * 生命周期回调
 */
public interface ActivityMvpDelegateCallback<P extends
        MvpPersenter, V extends MvpView> extends BaseDelegateCallback<P, V> {
}
