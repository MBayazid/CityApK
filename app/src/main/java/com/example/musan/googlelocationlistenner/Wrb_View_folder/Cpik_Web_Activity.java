package com.example.musan.googlelocationlistenner.Wrb_View_folder;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.musan.googlelocationlistenner.R;

public class Cpik_Web_Activity extends AppCompatActivity {
    public WebView wv;
    private String url;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpik__web_);

        wv=(WebView)findViewById(R.id.bteb_web_view);
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
        wv.loadUrl("http://cpik.ac.bd/");


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        BackwardTranscationAnimation();
    }
    private void BackwardTranscationAnimation() {
        overridePendingTransition( R.anim.slide_up,R.anim.slide_right_out);
    }
}
