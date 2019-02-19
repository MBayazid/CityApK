package com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.musan.googlelocationlistenner.R;
import com.example.musan.googlelocationlistenner.teachers_folder.Custome_Fragment_Activity;

import java.util.ArrayList;

public class Electronics extends AppCompatActivity {
    final String al1 = "01550021261";
    final String al2 = "01920639338";
    final String pak1 = "01550021260";
    final String pak2 = "01718829429";
    final String pak3 = "01550021263";
    final String pak4 = "01927795739";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        ArrayList<Custome_Fragment_Activity.AndroidFlavor> androidFlavors = new ArrayList<Custome_Fragment_Activity.AndroidFlavor>();
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Md. Mujahidul Islam", "Dept. Head", R.drawable.mujahidur));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Sk. Neaz Morshed", "Instructor", R.drawable.neaz));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Bayzed Rahman", "Junior Instructor", R.drawable.bayazed));
        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_computer);
        listView.setAdapter(flavorAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Electronics.this).create();
                    alertDialog.setTitle(" Md. Mujahidul Islam(Depertmental Head)");
                    alertDialog.setMessage("\n " + al1+"\n"+al2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", al2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", al1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + al1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }
                if (position == 1) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Electronics.this).create();
                    alertDialog.setTitle(" Sk. Neaz Morshed ");
                    alertDialog.setMessage(" \n " + pak1+"\n"+pak2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", pak2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", pak1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + pak1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }



                if (position == 2) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Electronics.this).create();
                    alertDialog.setTitle("Bayzed Rahman");
                    alertDialog.setMessage(" \n " + pak3+"\n"+pak4);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", pak4, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", pak3, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + pak3, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }




            }

        });




    }
}
