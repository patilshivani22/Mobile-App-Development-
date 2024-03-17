package com.example.myexp3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button p;
    VideoView v;
    MediaController mC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p=(Button) findViewById(R.id.play);
        v=(VideoView) findViewById(R.id.videov);
        mC=new MediaController(MainActivity.this);

        p.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String s = "android.resource://com.example.myexp3" + "/" + R.raw.video;
                Uri uri=Uri.parse(s);
                v.setVideoURI(uri);
                v.setMediaController(mC);
                mC.setAnchorView(v);
                v.start();
            }

            });
        }


}