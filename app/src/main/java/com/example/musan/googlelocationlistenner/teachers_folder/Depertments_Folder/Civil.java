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

public class Civil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final String my1 = getString(R.string.Monira_Yasmin1);
        final String my2 = getString(R.string.Monira_Yasmin2);
        final String fy1 = getString(R.string.Farhana_Yeasmin);
        final String fy2 = getString(R.string.Farhana_Yeasmin1);
        final String atr1 = getString(R.string.Atiquer_Rahman);
        final String atr2 = getString(R.string.Atiquer_Rahman1);
        final String sab1 = getString(R.string.Shaikh_Bulbul_Ahmed);
        final String sab2 = getString(R.string.Shaikh_Bulbul_Ahmed1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        ArrayList<Custome_Fragment_Activity.AndroidFlavor> androidFlavors = new ArrayList<Custome_Fragment_Activity.AndroidFlavor>();
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Monira Yasmin", "Dept. Head", R.drawable.monira));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Farhana Yeasmin ", "Junior Instructor", R.drawable.farhana2));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Atiquer Rahman", "Junior Instructor", R.drawable.atiquer));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Shaikh Bulbul Ahmed", "Junior Instructor", R.drawable.bulbul));
        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_computer);
        listView.setAdapter(flavorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Civil.this).create();
                    alertDialog.setTitle(" Monira Yasmin (Depertmental Head)");
                    alertDialog.setMessage("\n " + my1+"\n"+my2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", my2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", my1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + my1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }
                if (position == 1) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Civil.this).create();
                    alertDialog.setTitle("Farhana Yeasmin ");
                    alertDialog.setMessage(" \n " + fy1+"\n"+fy2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", fy2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", fy1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + fy1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }




                if (position == 2) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Civil.this).create();
                    alertDialog.setTitle(" Atiquer Rahman");
                    alertDialog.setMessage(" \n " + atr1+"\n"+atr2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", atr2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", atr1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + atr1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }

                if (position == 3) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Civil.this).create();
                    alertDialog.setTitle(" Shaikh Bulbul Ahmed");
                    alertDialog.setMessage(" \n " + sab1+"\n"+sab2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", sab2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", sab1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + sab1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }

            }

        });



    }
}
