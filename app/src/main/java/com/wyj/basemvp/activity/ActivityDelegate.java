package com.wyj.basemvp.activity;

/**
 * Created by wyj on 2018/8/3.
 * .创建一个ActyvityDelegate，与activity生命周期一致，
 * 目的是为了通过activity的生命周期去控制是否要attachView：
 */
public interface ActivityDelegate {
    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestory();
}
