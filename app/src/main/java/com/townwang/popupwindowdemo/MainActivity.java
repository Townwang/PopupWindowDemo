package com.townwang.popupwindowdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        View contentView = LayoutInflater.from(this).inflate(R.layout.meny_window, null);
        View view1 = LayoutInflater.from(this).inflate(R.layout.activity_main, null);
        new PWindow.PopupWindowBuilder(this)
                .setAnimationStyle(R.style.CustomPopWindowStyle)
                .setView(contentView).setFocusable(true)
                .setOutsideTouchable(true)
                .create()
                .showAsDropDown(view1);
    }
}
