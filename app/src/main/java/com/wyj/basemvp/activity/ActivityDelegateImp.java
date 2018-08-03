package com.wyj.basemvp.activity;

import com.wyj.basemvp.base.BaseDelegateCallback;
import com.wyj.basemvp.base.MvpInternalDelegate;
import com.wyj.basemvp.presenter.MvpPersenter;
import com.wyj.basemvp.view.MvpView;

/**
 * Created by wyj on 2018/8/3.
 */
public class ActivityDelegateImp<P extends MvpPersenter,V extends MvpView> implements ActivityDelegate {
    private BaseDelegateCallback<P,V> mBaseDelegateCallback;
    private final MvpInternalDelegate<P, V> mMvpInternalDelegate;

    public ActivityDelegateImp(BaseDelegateCallback<P,V> baseDelegateCallback){
        if(baseDelegateCallback == null)
            throw  new NullPointerException("baseDelegateCallback is null");
        this.mBaseDelegateCallback =baseDelegateCallback;
        mMvpInternalDelegate = new MvpInternalDelegate<>(baseDelegateCallback);

    }

    @Override
    public void onCreate() {
        mMvpInternalDelegate.createPersenter();
        mMvpInternalDelegate.attachView();

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestory() {
        mMvpInternalDelegate.detachVivew();

    }
}
