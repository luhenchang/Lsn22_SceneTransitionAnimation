package com.example.ls.lsn22_scenetransitionanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;

public class RecylerviewActivity extends AppCompatActivity {
    private RecyclerView mv;
    private RecylerViewAdapter madapter;
    private ArrayList<Integer>mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_recylerview);
        initView();
        initData();
        setData();

    }

    private void initView() {
        mv=findViewById(R.id.header_recylerview);
        mv.setLayoutManager(new GridLayoutManager(this,2));

    }

    private void initData() {

        mData=new ArrayList<>();
        mData.add(R.mipmap.rv0);
        mData.add(R.mipmap.rv2);
        mData.add(R.mipmap.rv3);
        mData.add(R.mipmap.rv4);
        mData.add(R.mipmap.rv5);
        mData.add(R.mipmap.rv0);
        mData.add(R.mipmap.rv2);
        mData.add(R.mipmap.rv3);
        mData.add(R.mipmap.rv4);
        mData.add(R.mipmap.rv5);
        mData.add(R.mipmap.rv0);
        mData.add(R.mipmap.rv2);
        mData.add(R.mipmap.rv3);
        mData.add(R.mipmap.rv4);
        mData.add(R.mipmap.rv5);


    }

    private void setData() {
        madapter=new RecylerViewAdapter(mData,this);
        mv.setAdapter(madapter);
        madapter.notifyDataSetChanged();
    }


}
