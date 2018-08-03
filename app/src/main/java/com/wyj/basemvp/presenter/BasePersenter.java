package com.wyj.basemvp.presenter;

import com.wyj.basemvp.view.MvpView;

import java.lang.ref.WeakReference;

/**
 * Created by wyj on 2018/8/3.
 * 用于保持对View的引用
 */
public abstract class BasePersenter<V extends MvpView>  implements MvpPersenter<V> {

    private WeakReference<V> mReference;

    @Override
    public void attachView(V view) {
        if(view == null){
            throw new NullPointerException("view 不能为null");
        }else {
            //将view置为弱引用,当view被销毁时,依赖于view的对象也将被销毁,被及时回收,避免造成内存泄漏
            mReference = new WeakReference<>(view);
        }
    }

    @Override
    public void detachView() {
        if(mReference != null){
            mReference.clear();
            mReference = null;
        }
    }

    /**
     * 获取view
     * @return
     */
    public V getMvpView(){
        if(isAttach()){
            return mReference.get();
        }else {
            throw  new NullPointerException("是否在BasePersenter 调用attachView()方法");
        }
    }

    public boolean isAttach(){
        return mReference !=null && mReference.get() != null;
    }
}
