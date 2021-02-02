package com.jianglin.libbusa;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jianglin.libcommon.BaseActivity;
import com.jianglin.libexpa.BusaPath;
import com.jianglin.libexpb.BUtil;
import com.jianglin.libexpb.BusbPath;

@Route(path = BusaPath.BUSA)
public class BusaActivity extends BaseActivity {
    private static final String TAG = "BusaActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busa);

        try {
            ((TextView) findViewById(R.id.textView2)).setText(BUtil.getInfo().info);
        } catch (Exception e) {
            Log.e(TAG, "[NAIPIQ]onCreate: 获取组件B的服务出错", e);
        }
    }

    @Override
    protected String tag() {
        return TAG;
    }

    public void click(View view) {
        ARouter.getInstance().build(BusbPath.BUSB).navigation(this);
    }
}