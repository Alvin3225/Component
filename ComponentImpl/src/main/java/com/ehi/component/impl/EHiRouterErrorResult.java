package com.ehi.component.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * 标识路由错误的时候的回调参数
 *
 * @author xiaojinzi 30212
 */
public class EHiRouterErrorResult {

    /**
     * 当原始的 request 对象都没构建出来的时候发生错误了,那么这个参数就是可能为 null 的
     * 所以这个参数的使用需要判空
     * 不过为 null 的情况一般都是用户填写的参数有误,用户一般会在代码中更改过来,但是有时候路由参数
     * 是一个 url,所以这种情况就不可控了,没法再运行时的时候保证构建 request 之前没有错误发生
     * 所以总而言之,如果这个参数为 Null 标识路由的 {@link EHiRouterRequest} 没有构建出来之前或者构建过程
     * 中就出错了,反之就是构建出来之后的路由过程中出错了
     */
    @Nullable
    private final EHiRouterRequest mOriginalRequest;

    /**
     * 当发生错误的时候的错误对象,不可能为空！
     */
    @NonNull
    private final Throwable mError;

    public EHiRouterErrorResult(@NonNull Throwable error) {
        this(null, error);
    }

    public EHiRouterErrorResult(@Nullable EHiRouterRequest originalRequest, @NonNull Throwable error) {
        this.mOriginalRequest = originalRequest;
        this.mError = error;
    }

    @Nullable
    public EHiRouterRequest getOriginalRequest() {
        return mOriginalRequest;
    }

    @NonNull
    public Throwable getError() {
        return mError;
    }

}
