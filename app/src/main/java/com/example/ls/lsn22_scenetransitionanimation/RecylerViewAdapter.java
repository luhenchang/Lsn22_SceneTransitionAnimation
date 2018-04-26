package com.example.ls.lsn22_scenetransitionanimation;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by 路很长~ on 2018/4/26.
 */

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.MyViewHolder> {
    private ArrayList<Integer> arrylist;
    private Context context;

    public RecylerViewAdapter(ArrayList<Integer> arrylist, Context context) {
        this.arrylist = arrylist;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recylerview_item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.miv.setBackgroundResource(arrylist.get(position));
        holder.miv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                *    public static ActivityOptions makeSceneTransitionAnimation(Activity activity,
            View sharedElement, String sharedElementName) {
                * */
                ActivityOptionsCompat optionsCompat1 = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity) context,(View)holder.miv,"ivtraname");
                Intent intent = new Intent(context, Main3Activity.class);
                context.startActivity(intent, optionsCompat1.toBundle());//最低兼容16
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrylist.size() > 0 ? arrylist.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView miv;

        public MyViewHolder(View itemView) {
            super(itemView);
            miv = itemView.findViewById(R.id.item_iv);
        }
    }

}
