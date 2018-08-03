package com.wyj.basemvp.fragment;

/**
 * Created by wyj on 2018/8/3.
 * 创建fragment 生命周期接口
 */
public interface FragmentDelegate {
    void onCreateVivew();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestory();
}
