package com.wyj.basemvp.fragment;

import com.wyj.basemvp.base.BaseDelegateCallback;
import com.wyj.basemvp.base.MvpInternalDelegate;
import com.wyj.basemvp.presenter.MvpPersenter;
import com.wyj.basemvp.view.MvpView;

/**
 * Created by wyj on 2018/8/3.
 */
public class FragmentDelegateImp<P extends MvpPersenter,V extends MvpView>
        implements FragmentDelegate{
    private BaseDelegateCallback<P,V> mBaseDelegateCallback;
    private final MvpInternalDelegate<P, V> mInternalDelegate;

    public FragmentDelegateImp(BaseDelegateCallback<P,V> baseDelegateCallback){
        if(baseDelegateCallback == null)
            throw  new NullPointerException("baseDelegateCallback is null");
       this.mBaseDelegateCallback = baseDelegateCallback;
        mInternalDelegate = new MvpInternalDelegate<>(baseDelegateCallback);

    }
    @Override
    public void onCreateVivew() {
        mInternalDelegate.createPersenter();
        mInternalDelegate.attachView();

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
        mInternalDelegate.detachVivew();

    }
}
