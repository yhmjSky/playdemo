package com.xcq.playdemo.yhmjplayer;

import android.content.Context;

public class YhmjSkyPlayerManage {
    public static YhmjSkyPlayerManage videoPlayViewManage;
    private YhmjSkyPlayer videoPlayView;

    private YhmjSkyPlayerManage() {

    }

    public static YhmjSkyPlayerManage getSuperManage() {
        if (videoPlayViewManage == null) {
            videoPlayViewManage = new YhmjSkyPlayerManage();
        }
        return videoPlayViewManage;
    }

    public YhmjSkyPlayer initialize(Context context) {
        if (videoPlayView == null) {
            videoPlayView = new YhmjSkyPlayer(context);
        }
        return videoPlayView;
    }
}
