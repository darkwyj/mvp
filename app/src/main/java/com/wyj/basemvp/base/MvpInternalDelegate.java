package com.wyj.basemvp.base;

import com.wyj.basemvp.presenter.MvpPersenter;
import com.wyj.basemvp.view.MvpView;

/**
 * Created by wyj on 2018/8/3.
 * 用于控制MvpPresenter与MvpView
 */
public class MvpInternalDelegate<P extends MvpPersenter,V extends MvpView> {
    private BaseDelegateCallback<P,V> mCallback;
    public MvpInternalDelegate(BaseDelegateCallback<P,V> callback){
        this.mCallback =callback;

    }

    public P createPersenter(){
        P p = mCallback.getPersenter();
        if(p == null)
            p = mCallback.createPersenter();
        if(p == null)
            throw new NullPointerException(" mCallback.createPersenter() 是 null");
        return p;

    }

    public void attachView(){
        mCallback.getPersenter().attachView(mCallback.getMvpView());
    }
    public void detachVivew(){
        mCallback.getPersenter().detachView();
    }

}
