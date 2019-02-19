package com.example.musan.googlelocationlistenner.teachers_folder;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.musan.googlelocationlistenner.R;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.AndroidFlavorAdapter;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Civil;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Computer;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Electrical;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Electronics;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Instructor;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Marine;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Mechanical;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Medical;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Staff;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Telecommunication;
import com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder.Textile;

import java.util.ArrayList;

public class Custome_Fragment_Activity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        BackwardTranscationAnimation();
    }

    @Override
    protected void onStop() {
        super.onStop();
        BackwardTranscationAnimation();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome__fragment_);
        // Create an ArrayList of AndroidFlavor objects
        ArrayList<AndroidFlavor> androidFlavors = new ArrayList<AndroidFlavor>();
        androidFlavors.add(new AndroidFlavor("R.S", "Instructor", R.drawable.rsoffice));

        androidFlavors.add(new AndroidFlavor("Computer", "66", R.drawable.computer));
        androidFlavors.add(new AndroidFlavor("Civil", "64", R.drawable.civil));
        androidFlavors.add(new AndroidFlavor("Electrical", "67", R.drawable.electrical));
        androidFlavors.add(new AndroidFlavor("Electronics", "68", R.drawable.electronic));
        androidFlavors.add(new AndroidFlavor("Marine", "79", R.drawable.marine));
        androidFlavors.add(new AndroidFlavor("Mechanical", "70", R.drawable.mechanical));
        androidFlavors.add(new AndroidFlavor("Telecommunication", "94", R.drawable.telecommunication));
        androidFlavors.add(new AndroidFlavor("Medical", "75", R.drawable.medical));
        androidFlavors.add(new AndroidFlavor("Textile", "000", R.drawable.tetile1));
        androidFlavors.add(new AndroidFlavor("Staff", "Office", R.drawable.staff));
        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.custome_list);
        listView.setAdapter(flavorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent i1 = new Intent(getApplicationContext(),Instructor.class);
                    startActivity(i1);
                    ForwardTranscationAnimation();
                }
                if(position==1)
                {
                    Intent i3 = new Intent(getApplicationContext(),Computer.class);
                    startActivity(i3);
                    ForwardTranscationAnimation();

                }


                if(position==2)
               {

                   Intent i2 = new Intent(getApplicationContext(),Civil.class);
                   startActivity(i2);
                   ForwardTranscationAnimation();

               }


                if(position==3)
                {
                    Intent i4 = new Intent(getApplicationContext(),Electrical.class);
                    startActivity(i4);
                    ForwardTranscationAnimation();

                }


                if(position==4)
                {
                    Intent i5 = new Intent(getApplicationContext(),Electronics.class);
                    startActivity(i5);
                    ForwardTranscationAnimation();

                }

                if(position==5)
                {
                    Intent i6 = new Intent(getApplicationContext(),Marine.class);
                    startActivity(i6);
                    ForwardTranscationAnimation();

                }


                if(position==6)
                {
                    Intent i7 = new Intent(getApplicationContext(),Mechanical.class);
                    startActivity(i7);
                    ForwardTranscationAnimation();

                }





                if(position==7)
                {
                    Intent i8 = new Intent(getApplicationContext(),Telecommunication.class);
                    startActivity(i8);
                    ForwardTranscationAnimation();

                }


                if(position==8)
                {
                    Intent i9 = new Intent(getApplicationContext(),Medical.class);
                    startActivity(i9);
                    ForwardTranscationAnimation();

                }



                if(position==9)
                {
                    Intent i10 = new Intent(getApplicationContext(),Textile.class);
                    startActivity(i10);
                    ForwardTranscationAnimation();

                }



                if(position==10)
                {
                    Intent i11 = new Intent(getApplicationContext(),Staff.class);
                    startActivity(i11);
                    ForwardTranscationAnimation();

                }





            }


        });



    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    public static class AndroidFlavor {
        private String mVersionName;
        private String mVersionNumber;
        // Drawable resource ID
        private int mImageResourceId;
        public AndroidFlavor(String vName, String vNumber, int imageResourceId) {
            mVersionName = vName;
            mVersionNumber = vNumber;
            mImageResourceId = imageResourceId;
        }
        public String getVersionName() {
            return mVersionName;
        }
        public String getVersionNumber() {
            return mVersionNumber;
        }
        /**
         * Get the image resource ID
         */
        public int getImageResourceId() {
            return mImageResourceId;

        }
    }
    private void ForwardTranscationAnimation() {
        overridePendingTransition(R.anim.slide_left_in, R.anim.slide_down);
    }
    private void BackwardTranscationAnimation() {
        overridePendingTransition( R.anim.slide_up,R.anim.slide_right_out);
    }
}
