package com.example.musan.googlelocationlistenner.Wrb_View_folder;


import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;


import com.example.musan.googlelocationlistenner.R;
import com.example.musan.googlelocationlistenner.teachers_folder.Custome_Fragment_Activity;

public class Web_View_Activity extends AppCompatActivity {
    public WebView wv;
    private String url;
    Button Teacher_contact;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web__view_);

        Teacher_contact=(Button)findViewById(R.id.call_teacher_btn);
        Teacher_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Custome_Fragment_Activity.class));
                ForwardTranscationAnimation();
            }
        });
        wv=(WebView)findViewById(R.id.webView_cpik);


        LoadStudentDue();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private void LoadStudentDue() {


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
        wv.loadUrl("http://cpik.ac.bd/STD/");
    }


    private void ForwardTranscationAnimation() {
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_down);
    }
    private void BackwardTranscationAnimation() {
        overridePendingTransition( R.anim.slide_up,R.anim.slide_right_out);
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        BackwardTranscationAnimation();
    }

}
