package com.example.musan.googlelocationlistenner;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.musan.googlelocationlistenner.Auth.GoogleSignInActivity;
import com.example.musan.googlelocationlistenner.Auth.PhoneAuthActivity;
import com.example.musan.googlelocationlistenner.DataBase_java.DataBase_MainActivity;
import com.example.musan.googlelocationlistenner.GPS_folder.MyLocationUsingLocationAPI;
import com.example.musan.googlelocationlistenner.ML_Kit_Folder.BITMAP_ConVerter;
import com.example.musan.googlelocationlistenner.ML_Kit_Folder.Camera_activity;
import com.example.musan.googlelocationlistenner.Wrb_View_folder.BTEB_Notification_ScrollingActivity;
import com.example.musan.googlelocationlistenner.Wrb_View_folder.Cpik_Web_Activity;
import com.example.musan.googlelocationlistenner.Wrb_View_folder.Web_View_Activity;
import com.example.musan.googlelocationlistenner.reminder_Folder.MainActivity;
import com.example.musan.googlelocationlistenner.teachers_folder.Custome_Fragment_Activity;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.firebase.auth.FirebaseUser;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;


public class Home_Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private PublisherAdView mPublisherAdView;
    private PublisherInterstitialAd mPublisherInterstitialAd;
    private Button mMyButton;
    private AdView mAdView;
    private RelativeLayout Teacher_panel, Student_Panel, Management_panel, Gardian_Panle, About_panel, Visit;
    private GoogleSignInActivity googleSignInActivity;
    private GoogleSignInClient mGoogleSignInClient;
    private FirebaseUser mAuth;
    private TextView Nav_Name;
    public boolean hasInternet;

    Uri uri;
    String uEmail, uName;
    String User_Name, User_Email;
    private FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//satrt home page
        Start_first_home();
//floting button//calling animated floting Button
        ImageView icon = new ImageView(this);
        icon.setImageResource(R.drawable.ai_home);


        final com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton fab = new com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton.Builder(this).setContentView(icon).build();
        SubActionButton.Builder builder = new SubActionButton.Builder(this);

        ImageView loveIcon = new ImageView(this);
        loveIcon.setImageResource(R.drawable.ai_chat);
        SubActionButton loveBtn = builder.setContentView(loveIcon).build();

        ImageView smsIcon = new ImageView(this);
        smsIcon.setImageResource(R.drawable.ai_telephone);
        SubActionButton smsBtn = builder.setContentView(smsIcon).build();

        ImageView sendIcon = new ImageView(this);
        sendIcon.setImageResource(R.drawable.ai_mail);
        SubActionButton sendLocationBtn = builder.setContentView(sendIcon).build();


        final FloatingActionMenu fam = new FloatingActionMenu.Builder(this)
                .addSubActionView(loveBtn)
                .addSubActionView(smsBtn)
                .addSubActionView(sendLocationBtn)
                .attachTo(fab)
                .build();
        loveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BITMAP_ConVerter.class));
                ForwardTranscationAnimation();
            }
        });
        sendLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(Home_Activity.this, Custome_Fragment_Activity.class));
                ForwardTranscationAnimation();

            }
        });
       smsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Activity.this, Custome_Fragment_Activity.class));
                ForwardTranscationAnimation();
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    //getting home page ide's
    private void Start_first_home() {
        Teacher_panel = (RelativeLayout) findViewById(R.id.teacherBitton);
        Management_panel = (RelativeLayout) findViewById(R.id.managment_btn);
        Student_Panel = (RelativeLayout) findViewById(R.id.studentButton);
        Gardian_Panle = (RelativeLayout) findViewById(R.id.gardenBtton);
        About_panel = (RelativeLayout) findViewById(R.id.AboutButton);
        Visit = (RelativeLayout) findViewById(R.id.visitButton);


        isNetworkAvailable();
        hasActiveInternetConnection();

        Student_Panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasInternet == true){
                    startActivity(new Intent(getApplicationContext(), PhoneAuthActivity.class));

                }
                else{ cheakInternet(); }
                ForwardTranscationAnimation();


            }
        });
        Teacher_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasInternet == true){
                    startActivity(new Intent(getApplicationContext(), GoogleSignInActivity.class));
                }
                else{ cheakInternet(); }

                ForwardTranscationAnimation();
              //  startActivity(new Intent(getApplicationContext(), GoogleSignInActivity.class));

            }
        });


        Gardian_Panle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Web_View_Activity.class));
                ForwardTranscationAnimation();

            }
        });
        About_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  startActivity(new Intent(getApplicationContext(),DataBase_MainActivity.class));
                ForwardTranscationAnimation();

            }
        });
        Management_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), GoogleSignInActivity.class));
                ForwardTranscationAnimation();

            }
        });
        Visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasInternet == true){
                    startActivity(new Intent(getApplicationContext(), Cpik_Web_Activity.class));
                }
                else{ cheakInternet(); }
                ForwardTranscationAnimation();

            }
        });
    }

    private void ForwardTranscationAnimation() {
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_down);
    }
    private void BackwardTranscationAnimation() {
        overridePendingTransition( R.anim.slide_up,R.anim.slide_right_out);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
           // ExitNotificationBuilder();
            BackwardTranscationAnimation();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {


            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_login) {
            startActivity(new Intent(Home_Activity.this,  GoogleSignInActivity.class));
            ForwardTranscationAnimation();

            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            // startActivity(new Intent(Home_Activity.this,ChooserActivity.class));
            startActivity(new Intent(Home_Activity.this, GoogleSignInActivity.class));
            ForwardTranscationAnimation();

        } else if (id == R.id.nav_Sign_In_student) {
            // startActivity(new Intent(Home_Activity.this,ChooserActivity.class));
            startActivity(new Intent(Home_Activity.this, PhoneAuthActivity.class));

        } else if (id == R.id.nav_cpik) {
            startActivity(new Intent(Home_Activity.this, Cpik_Web_Activity.class));
            ForwardTranscationAnimation();

        } else if (id == R.id.nav_manage) {
            // startActivity(new Intent(Home_Activity.this,CustomAuthActivity.class));
            Toast.makeText(getApplicationContext(), "UP Comming ", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_share) {
            Toast.makeText(getApplicationContext(), "UP Comming ", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_bteb) {
            startActivity(new Intent(Home_Activity.this, BTEB_Notification_ScrollingActivity.class));

        } else if (id == R.id.nav_list) {
            startActivity(new Intent(Home_Activity.this, Custome_Fragment_Activity.class));
ForwardTranscationAnimation();
        } else if (id == R.id.nav_exit) {
            ExitNotificationBuilder();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void ExitNotificationBuilder() {
        AlertDialog.Builder alerDialogBuilder = new AlertDialog.Builder(Home_Activity.this);
        alerDialogBuilder.setMessage("Are U Sure !!!");
        alerDialogBuilder.setCancelable(true);
        alerDialogBuilder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alerDialogBuilder.setNeutralButton("Rate US", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               //rate link
            }
        });
        AlertDialog dialog = alerDialogBuilder.create();
        dialog.show();
    }


    //bulder notification



    public boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }


    // if net active
    public void hasActiveInternetConnection() {
        if (isNetworkAvailable()) {

            hasInternet=true;


        } else {
            hasInternet=false;
            Log.d("CHECK", "No network available!");
        }
    }
    private void cheakInternet() {
        //if(hasInternet==false){
        AlertDialog.Builder alerDialogBuilder = new AlertDialog.Builder(Home_Activity.this);
        alerDialogBuilder.setMessage("This Feature does not work without Internet.Please connect to Internet.");
        alerDialogBuilder.setCancelable(false);
        alerDialogBuilder.setNegativeButton("Exit", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alerDialogBuilder.setNeutralButton("OK ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Home_Activity.this,"Try again latter",Toast.LENGTH_LONG).show();
            }
        });


        AlertDialog dialog = alerDialogBuilder.create();
        dialog.show();


    }


}
