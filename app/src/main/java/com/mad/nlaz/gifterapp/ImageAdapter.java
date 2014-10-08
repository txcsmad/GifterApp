package com.mad.nlaz.gifterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by nlazaris on 9/24/14.
 */
public class ImageAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ArrayList<String> imageTitles;

    public ImageAdapter(Context context, LayoutInflater inflater, ArrayList<String> imageTitles){
        this.context = context;
        this.inflater = inflater;
        this.imageTitles = imageTitles;
    }

    @Override
    public int getCount() {
        return imageTitles.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View grid = view;

        if(view == null){
            grid = inflater.inflate(R.layout.grid_item, null);
        }
        ImageView imageView = (ImageView) grid.findViewById(R.id.grid_image);

        String url = imageTitles.get(position);

        Picasso.with(context).load(url).into(imageView);

        return grid;
    }
}
