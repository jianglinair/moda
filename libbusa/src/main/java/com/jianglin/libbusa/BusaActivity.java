package com.jianglin.libbusa;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jianglin.common.BaseActivity;
import com.jianglin.libexpa.BusaPath;

@Route(path = BusaPath.BUSA)
public class BusaActivity extends BaseActivity {
    private static final String TAG = "BusaActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busa);
    }

    @Override
    protected String tag() {
        return TAG;
    }
}