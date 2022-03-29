package com.xcq.playdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_demand_play).setOnClickListener(this);//点播

        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.tv_demand_play) {
            Intent demandIntent = new Intent(this,SuperVideoDetailsActivity.class);
            demandIntent.putExtra("isLive",false);
//            demandIntent.putExtra("url","http://121.40.132.250/file/ftm.mp4");
            demandIntent.putExtra("url","https://vd2.bdstatic.com/mda-kk6vefqruxp82ceu/sc/cae_h264_nowatermark/1604756105/mda-kk6vefqruxp82ceu.mp4?v_from_s=hkapp-haokan-nanjing&auth_key=1645775920-0-0-a2f8a5cef0431e70b4ba863ed9e2cb1e&bcevod_channel=searchbox_feed&pd=1&cd=0&pt=3&logid=1720219435&vid=6589522126005354843&abtest=&klogid=1720219435");
            startActivity(demandIntent);

        }
    }
}
