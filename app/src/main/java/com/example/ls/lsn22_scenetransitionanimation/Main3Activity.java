package com.example.ls.lsn22_scenetransitionanimation;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main3Activity extends AppCompatActivity {
    private LinearLayout mlin;
    private ImageView ivv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main3);
        mlin=findViewById(R.id.lineay);
        ivv=findViewById(R.id.iv_rray);

        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(mlin,"scaleX",0f,1f);
        objectAnimator.setDuration(300);
        objectAnimator.setRepeatCount(0);
        objectAnimator.start();
        ObjectAnimator objectAnimator1=ObjectAnimator.ofFloat(mlin,"scaleX",0f,1f);
        objectAnimator1.setDuration(300);
        objectAnimator1.setRepeatCount(0);
        objectAnimator1.start();

        ObjectAnimator objectAnimator2=ObjectAnimator.ofFloat(mlin,"scaleY",0f,1f);
        objectAnimator2.setDuration(300);
        objectAnimator2.setRepeatCount(0);
        objectAnimator2.start();
        ObjectAnimator objectAnimator3=ObjectAnimator.ofFloat(mlin,"scaleY",0f,1f);
        objectAnimator3.setDuration(300);
        objectAnimator3.setRepeatCount(0);
        objectAnimator3.start();

    }
}
