package com.example.ls.lsn22_scenetransitionanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);

    }
    //为嘛返回时候也有专场动画
    /*
    *   public void onBackPressed() {
        if (mActionBar != null && mActionBar.collapseActionView()) {
            return;
        }

        FragmentManager fragmentManager = mFragments.getFragmentManager();

        if (fragmentManager.isStateSaved() || !fragmentManager.popBackStackImmediate()) {
            finishAfterTransition();
        }
    }
    *
    *
    * */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
