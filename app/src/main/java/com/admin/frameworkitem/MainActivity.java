package com.admin.frameworkitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvMultiPackage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tvMultiPackage = findViewById(R.id.tv_main_multi_package);
        tvMultiPackage.setText(App.envTypeName);
    }
}
