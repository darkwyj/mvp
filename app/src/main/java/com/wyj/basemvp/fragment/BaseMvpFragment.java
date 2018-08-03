package com.wyj.basemvp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wyj.basemvp.presenter.MvpPersenter;
import com.wyj.basemvp.view.MvpView;

/**
 * Created by wyj on 2018/8/3.
 */
public abstract class BaseMvpFragment<P extends MvpPersenter,V extends MvpView>
        extends Fragment implements FragmentMvpDelegateCallback<P,V>,MvpView {

    private FragmentDelegateImp<P, V> mFragmentDelegateImp;
    private P mPersenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentDelegateImp = new FragmentDelegateImp<>(this);
        mFragmentDelegateImp.onCreateVivew();
        View inflate = inflater.inflate(getLayoutId(), container, false);
        initView();
        return inflate;
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
        mPersenter = createPersenter();
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
    public void onStart() {
        super.onStart();
        mFragmentDelegateImp.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mFragmentDelegateImp.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mFragmentDelegateImp.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mFragmentDelegateImp.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mFragmentDelegateImp.onDestory();
    }
}
