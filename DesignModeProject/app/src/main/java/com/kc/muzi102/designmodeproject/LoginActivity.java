package com.kc.muzi102.designmodeproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * 登录
     *
     * @param view
     */
    public void login(View view) {
        LoginContext.getInstance().setmState(new LoginedState());
        Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
        finish();
    }
}
