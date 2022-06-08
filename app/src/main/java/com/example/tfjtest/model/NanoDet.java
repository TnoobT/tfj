package com.example.tfjtest.model; // tfj,接口，调用ini_interface.cpp

import android.graphics.Bitmap;

public class NanoDet {

    static {
        System.loadLibrary("tengmnn"); // tfj,调用生成的库
    }

    public static native void init(String name, String path, boolean useGPU); // tfj,调用 jni_interface.cpp
    public static native BoxInfo[] detect(Bitmap bitmap, byte[] imageBytes, int width, int height, double threshold, double nms_threshold);
}
