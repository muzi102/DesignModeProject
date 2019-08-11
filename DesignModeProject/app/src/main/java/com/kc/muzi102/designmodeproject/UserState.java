package com.kc.muzi102.designmodeproject;

import android.content.Context;

/**
 * *******************************************************************************************
 * 修改日期                         修改人             任务名称                 功能或Bug描述
 * 2019/8/11                        MUZI102                                     用户状态接口
 * *******************************************************************************************
 */
public interface UserState {
    /**
     * 转发
     *
     * @param context
     */
    void forward(Context context);

    /**
     * 评论
     *
     * @param context
     */
    void comment(Context context);
}
