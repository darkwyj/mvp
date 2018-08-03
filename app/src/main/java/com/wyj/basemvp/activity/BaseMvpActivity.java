package com.wyj.basemvp.activity;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wyj.basemvp.presenter.MvpPersenter;
import com.wyj.basemvp.view.MvpView;

/**
 * Created by wyj on 2018/8/3.
 */
public abstract class BaseMvpActivity<P extends MvpPersenter,V extends MvpView> extends AppCompatActivity
        implements ActivityMvpDelegateCallback<P,V>,MvpView {

    private ActivityDelegateImp mDelegateImp;
    private P mPersenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDelegateImp = new ActivityDelegateImp<>(this);
        mDelegateImp.onCreate();
        setContentView(getLayoutId());
        initView();
    }

    /**
     * 获取布局id
     * @return
     */
    protected abstract int getLayoutId();

    /**
     * 初始化布局
     */
    protected abstract void initView();

    public abstract P CreatePersenter();

    @Override
    public P createPersenter() {
        mPersenter = CreatePersenter();
        return mPersenter;
    }

    @Override
    public void setPersenter() {

    }


    @Override
    public P getPersenter() {
        return mPersenter;
    }

    @Override
    public V getMvpView() {
        return (V) this;
    }

    @Override
    protected void onStart() {
        super.onStart();
        mDelegateImp.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mDelegateImp.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDelegateImp.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mDelegateImp.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDelegateImp.onDestory();
    }

}
