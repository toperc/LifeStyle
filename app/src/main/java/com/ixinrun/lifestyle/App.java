package com.ixinrun.lifestyle;

import android.app.Application;
import android.util.Log;

import com.ixinrun.base.utils.LoggerUtil;
import com.ixinrun.lifestyle.common.ILsAppCallback;

public class App implements ILsAppCallback {

    @Override
    public void init(Application app) {
        Log.e("TAG","++++++++++");
        LoggerUtil.i("++++++++++++++++++app");
    }
}
