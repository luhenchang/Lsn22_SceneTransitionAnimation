package com.example.ls.lsn22_scenetransitionanimation;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;
    Button tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
        tv=findViewById(R.id.tv);
    }

    public void jepun(View view) {
         /*
         *  if (Build.VERSION.SDK_INT >= 16) {
         * */
        /*startActivity(new Intent(MainActivity.this,Main2Activity.class));
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);*/
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,//当前activity
                iv, "transname");//共享元素，共享元素名称 android:transitionName="transname"
        ActivityOptionsCompat optionsCompat1 = ActivityOptionsCompat.makeSceneTransitionAnimation
                (this, Pair.create((View)iv, "transname"), Pair.create((View) tv, "transnamebt"));
        Intent intent = new Intent(this, Main2Activity.class);
        MainActivity.this.startActivity(intent, optionsCompat1.toBundle());//最低兼容16
    }
}
