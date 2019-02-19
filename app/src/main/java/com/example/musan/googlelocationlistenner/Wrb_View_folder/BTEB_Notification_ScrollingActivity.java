package com.example.musan.googlelocationlistenner.Wrb_View_folder;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;


import android.webkit.WebView;

import com.example.musan.googlelocationlistenner.R;

public class BTEB_Notification_ScrollingActivity extends AppCompatActivity {
  private WebView wv;
//    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bteb__notification__scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        wv=(WebView)findViewById(R.id.btebwbview);

       loadURL();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
//load web settings
    @TargetApi(Build.VERSION_CODES.KITKAT)
    private void loadURL() {


        WebSettings Settimgs =wv.getSettings();
        Settimgs.setJavaScriptEnabled(true);
        wv.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        wv.getSettings().setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        Settimgs.setDomStorageEnabled(true);
        Settimgs.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);

        Settimgs.setUseWideViewPort(true);
        Settimgs.setSavePassword(true);
        Settimgs.setSaveFormData(true);
        Settimgs.setEnableSmoothTransition(true);
        wv.loadUrl("http://www.bteb.gov.bd/site/view/notices");
    }
}
