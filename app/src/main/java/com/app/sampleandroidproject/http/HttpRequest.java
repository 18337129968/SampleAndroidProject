package com.app.sampleandroidproject.http;

/**
 * RxJavaDemo
 * com.isoftstone.rxjavademo.http
 *
 * @Author: xie
 * @Time: 2016/8/26 14:22
 * @Description:
 */



public abstract class HttpRequest<T> implements IRequest<T> {

    @Override
    public void onHttpStart() {
    }

    @Override
    public void onHttpFinish() {
    }

}