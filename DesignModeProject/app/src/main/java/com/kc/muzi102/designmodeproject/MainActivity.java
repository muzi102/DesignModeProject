package com.kc.muzi102.designmodeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnRanspond, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnRanspond = findView(R.id.btn_ranspond);
        btnLogout = findView(R.id.btn_logout);
    }

    private <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }

    /**
     * 点击转发
     *
     * @param view
     */
    public void ranspond(View view) {
        LoginContext.getInstance().forward(MainActivity.this);
    }


    /**
     * 评价
     *
     * @param view
     */
    public void comment(View view) {
        LoginContext.getInstance().comment(MainActivity.this);
    }

    /**
     * 注销
     *
     * @param view
     */
    public void logout(View view) {
        LoginContext.getInstance().setmState(new LogoutState());
        Toast.makeText(MainActivity.this, "注销成功", Toast.LENGTH_SHORT).show();
    }
}
