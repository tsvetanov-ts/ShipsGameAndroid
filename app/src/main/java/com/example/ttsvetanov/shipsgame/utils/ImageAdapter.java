package com.example.ttsvetanov.shipsgame.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.ttsvetanov.shipsgame.R;

/**
 * Created by ttsvetanov on 18.02.17.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    private static int SPONGEBOB_JPG = R.drawable.spongo;

    private static int SQUIDWARD_JPG = R.drawable.squid;
    private static int PATRICK_JPG = R.drawable.patrick;
    private static int SHIP_ONE = R.drawable.one;

    private static int SHIP_TWO = R.drawable.two;
    private static int SHIP_THREE = R.drawable.three;
    private static int SHIP_FOUR = R.drawable.four;
    private static int SHIP_FIVE = R.drawable.five;
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public static int getSpongebobJpg() {
        return SPONGEBOB_JPG;
    }



    public void flipImage(int position, int value) {
        this.setImage(position,value);
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(120, 120));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    private void setImage(int thumbId, int value) {
        switch(value) {
            case 1 : mThumbIds[thumbId] = ImageAdapter.SHIP_ONE; break;
            case 2 : mThumbIds[thumbId] = ImageAdapter.SHIP_TWO; break;
            case 3 : mThumbIds[thumbId] = ImageAdapter.SHIP_THREE; break;
            case 4 : mThumbIds[thumbId] = ImageAdapter.SHIP_FOUR; break;
            case 5 : mThumbIds[thumbId] = ImageAdapter.SHIP_FIVE; break;
            default : mThumbIds[thumbId] = ImageAdapter.PATRICK_JPG;
        }
    }

    public int getImageId(int thumbId) {
        return  mThumbIds[thumbId];
    }

    // references to our images
    private Integer[] mThumbIds = {
            ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,
            ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,
            ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,
            ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,
            ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,
            ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,
            ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,
            ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,  ImageAdapter.SPONGEBOB_JPG, ImageAdapter.SPONGEBOB_JPG,
    };
}