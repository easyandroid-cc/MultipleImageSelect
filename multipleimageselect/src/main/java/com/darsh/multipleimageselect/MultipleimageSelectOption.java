package com.darsh.multipleimageselect;

import com.darsh.multipleimageselect.util.Imageloader;

public class MultipleimageSelectOption {
    Imageloader imageloader;
    public static MultipleimageSelectOption multipleimageSelectOption = new MultipleimageSelectOption();

    public static MultipleimageSelectOption getInstance() {
        return multipleimageSelectOption;
    }

    public void init(Imageloader imageloader) {
        this.imageloader = imageloader;
    }

    public Imageloader getImageloader() {
        return imageloader;
    }
}
