package com.yanyuanquan.android.precentlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.PhoneAccount;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        Button button = new Button(getApplicationContext());

        WindowManager wm = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);

        WindowManager.LayoutParams params = new WindowManager.LayoutParams();

//        params.type = WindowManager.LayoutParams.TYPE_SYSTEM_ERROR;//2010
        params.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;//2003
        params.format = 1;

        DisplayMetrics dm = new DisplayMetrics();

        getWindowManager().getDefaultDisplay().getMetrics(dm);
        params.flags = 40;
        params.width = dm.widthPixels;
        params.height = dm.heightPixels;
        button.setText("您的手机已被锁定");
        wm.addView(button, params);

    }
}
