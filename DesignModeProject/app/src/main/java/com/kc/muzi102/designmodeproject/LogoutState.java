package com.kc.muzi102.designmodeproject;

import android.content.Context;
import android.content.Intent;

/**
 * *******************************************************************************************
 * 修改日期                         修改人             任务名称                 功能或Bug描述
 * 2019/8/11                        MUZI102
 * *******************************************************************************************
 */
public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {
        gotoLoginActivity(context);
    }

    @Override
    public void comment(Context context) {
        gotoLoginActivity(context);
    }

    /**
     * 跳转到登录界面
     */
    private void gotoLoginActivity(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}
