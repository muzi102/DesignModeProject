package com.kc.muzi102.designmodeproject;

import android.content.Context;
import android.widget.Toast;

/**
 * *******************************************************************************************
 * 修改日期                         修改人             任务名称                 功能或Bug描述
 * 2019/8/11                        MUZI102                                     登录状态
 * *******************************************************************************************
 */
public class LoginedState implements UserState {

    @Override
    public void forward(Context context) {
        Toast.makeText(context, "转发成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context, "评价成功", Toast.LENGTH_SHORT).show();
    }
}
