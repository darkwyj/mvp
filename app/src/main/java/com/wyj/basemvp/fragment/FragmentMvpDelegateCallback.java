package com.wyj.basemvp.fragment;

import com.wyj.basemvp.base.BaseDelegateCallback;
import com.wyj.basemvp.presenter.MvpPersenter;
import com.wyj.basemvp.view.MvpView;

/**
 * Created by wyj on 2018/8/3.
 */
public interface FragmentMvpDelegateCallback<P extends MvpPersenter,V extends MvpView>

extends BaseDelegateCallback<P,V>{
}
