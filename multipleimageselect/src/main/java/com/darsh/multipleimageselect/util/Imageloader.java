package com.darsh.multipleimageselect.util;

import android.content.Context;
import android.widget.ImageView;

import com.darsh.multipleimageselect.R;
import com.darsh.multipleimageselect.models.Image;

public interface Imageloader {
    void loadImage(Context context, long id, int placeholderId, ImageView imageView);

}
