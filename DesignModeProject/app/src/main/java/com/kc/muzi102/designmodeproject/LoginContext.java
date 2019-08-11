package com.kc.muzi102.designmodeproject;

import android.content.Context;

/**
 * *******************************************************************************************
 * 修改日期                         修改人             任务名称                 功能或Bug描述
 * 2019/8/11                        MUZI102
 * *******************************************************************************************
 */
public class LoginContext implements UserState {
    private static LoginContext mInstant;
    /**
     * 默认是未登录状态
     */
    public UserState mState = new LogoutState();

    private LoginContext() {
    }

    /**
     * 单例
     *
     * @return
     */
    public static LoginContext getInstance() {
        if (mInstant == null) {
            synchronized (LoginContext.class) {
                if (mInstant == null)
                    mInstant = new LoginContext();
            }
        }
        return mInstant;
    }


    public void setmState(UserState mState) {
        this.mState = mState;
    }

    //转发
    @Override
    public void forward(Context context) {
        mState.forward(context);
    }

    //评论
    @Override
    public void comment(Context context) {
        mState.comment(context);
    }
}
