package com.lee.app.mystackview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

/**
 * Created by lee-lxl on 2016/7/18.
 */
public class MyAdapter extends BaseAdapter{

    private Context mContext;
    private int [] mImages;

    public MyAdapter(Context context, int [] images){
        mContext = context;
        mImages = images;
    }

    @Override
    public int getCount() {
        return mImages == null ? 0 : mImages.length;
    }

    @Override
    public Object getItem(int position) {
        return mImages == null ? null : mImages[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout.LayoutParams myLayoutParams = new LinearLayout.LayoutParams(800, 800);
        LinearLayout myLayout = new LinearLayout(mContext);
        myLayout.setBackgroundResource(mImages[position]);//设置图片
        myLayout.setLayoutParams(myLayoutParams);

        return myLayout;
    }
}
