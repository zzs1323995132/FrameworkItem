package com.admin.frameworkitem;

import android.app.Application;

import com.admin.frameworkitem.multipackage.EnvType;

public class App extends Application {
    //多环境打包路径
    //多环境打包标志  1：开发环境 2：测试环境3：生产环境
    public static int envType = BuildConfig.ENV_TYPE;
    public static String envTypeName = "";

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化多环境打包
        initMultiPackage();
    }

    /**
     * 初始化多环境打包
     */
    private void initMultiPackage() {
        switch (envType) {
            case EnvType.DEVELOP://开发环境（
                envTypeName = "开发环境";
                break;
            case EnvType.CHECK://测试环境
                envTypeName = "测试环境";
                break;
            case EnvType.PRODUCT://生产环境
                envTypeName = "生产环境";
                break;
        }
    }
}
