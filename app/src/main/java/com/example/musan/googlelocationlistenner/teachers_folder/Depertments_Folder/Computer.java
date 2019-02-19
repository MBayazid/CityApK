package com.example.musan.googlelocationlistenner.teachers_folder.Depertments_Folder;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.musan.googlelocationlistenner.R;
import com.example.musan.googlelocationlistenner.reminder_Folder.MainActivity;
import com.example.musan.googlelocationlistenner.teachers_folder.Custome_Fragment_Activity;

import java.util.ArrayList;

public class Computer extends AppCompatActivity {
  Custome_Fragment_Activity.AndroidFlavor androidFlavor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        final String nh1 = getString(R.string.Nazmul_huda);
        final String nh2 = getString(R.string.Nazmul_huda1);
        final String fn1 = getString(R.string.Farhana_Naznin);
        final String fn2 = getString(R.string.Farhana_Naznin1);
        final String shr1 = getString(R.string.M_Shirajul_Islam);
        final String shr2 = getString(R.string.M_Shirajul_Islam1);
        final String si1 = getString(R.string.Shirajul_Islam);
        final String si2 = getString(R.string.Shirajul_Islam1);
        final String of1 = getString(R.string.Omar_Faruk);
        final String of2 = getString(R.string.Omar_Faruk1);

            //  ListView listView=(ListView)findViewById(R.id.list_computer);
            final ArrayList<Custome_Fragment_Activity.AndroidFlavor> androidFlavors = new ArrayList<Custome_Fragment_Activity.AndroidFlavor>();
            androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Md. Nazmul Huda", "Dept. Head", R.drawable.najmul));
            androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor(" Farhana Naznin", "Instructor", R.drawable.farhana));
            androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Md. Shirajul Islam", "Junior Instructor", R.drawable.munna));
            androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor(" Md. Omar Faruk", "Junior Instructor", R.drawable.faruk));
            androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Shamsul Arefin", "Instructor", R.drawable.arfin));

        AndroidFlavorAdapter flavorAdapter = new  AndroidFlavorAdapter(this, androidFlavors);

            // Get a reference to the ListView, and attach the adapter to the listView.
            ListView listView = (ListView) findViewById(R.id.list_computer);
            listView.setAdapter(flavorAdapter);


            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    if (position == 0) {
                        AlertDialog alertDialog = new AlertDialog.Builder(Computer.this).create();
                        alertDialog.setTitle("Nazmul Huda (Depertmental Head)");
                        alertDialog.setMessage("\n " + nh1+"\n"+nh2);
                        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+nh2));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);
                            }
                        });
                        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+nh1));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);

                            }
                        });

                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {



                                        Toast.makeText(getApplicationContext(), "Not Calling ", Toast.LENGTH_LONG).show();
                                        //dialog.dismiss();

                                    }
                                });

                        alertDialog.show();
                    }
                    if (position == 1) {
                        AlertDialog alertDialog = new AlertDialog.Builder(Computer.this).create();
                        alertDialog.setTitle(" Farhana Naznin");
                        alertDialog.setMessage(" \n " + fn1+"\n"+fn2);
                        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+fn1));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);
                            }
                        });
                        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+fn2));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);

                            }
                        });

                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(getApplicationContext(), "Calling " + fn1, Toast.LENGTH_LONG).show();
                                        //dialog.dismiss();

                                    }
                                });

                        alertDialog.show();
                    }




                    if (position == 2) {
                        AlertDialog alertDialog = new AlertDialog.Builder(Computer.this).create();
                        alertDialog.setTitle(" Shamsul Arefin");
                        alertDialog.setMessage(" \n " + shr1+"\n"+shr2);
                        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+shr1));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);
                            }
                        });
                        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+shr2));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);

                            }
                        });

                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(getApplicationContext(), "Calling " + shr1, Toast.LENGTH_LONG).show();
                                        //dialog.dismiss();

                                    }
                                });

                        alertDialog.show();
                    }

                    if (position == 3) {
                        AlertDialog alertDialog = new AlertDialog.Builder(Computer.this).create();
                        alertDialog.setTitle(" Md. Shirajul Islam");
                        alertDialog.setMessage(" \n " + si1+"\n"+si2);
                        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+si1));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);
                            }
                        });
                        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+si2));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);

                            }
                        });

                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(getApplicationContext(), "Calling " + si1, Toast.LENGTH_LONG).show();
                                        //dialog.dismiss();

                                    }
                                });

                        alertDialog.show();
                    }




                    if (position == 4) {
                        AlertDialog alertDialog = new AlertDialog.Builder(Computer.this).create();
                        alertDialog.setTitle(" Md. Omar Faruk");
                        alertDialog.setMessage(" \n " + of1+"\n"+of2);
                        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+of1));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);
                            }
                        });
                        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callIntent = new Intent(Intent.ACTION_CALL);
                                callIntent.setData(Uri.parse("tel:"+of2));

                                if (ActivityCompat.checkSelfPermission(Computer.this,
                                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                    return;
                                }
                                startActivity(callIntent);
                            }
                        });

                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(getApplicationContext(), "Calling " + of1, Toast.LENGTH_LONG).show();
                                        //dialog.dismiss();

                                    }
                                });

                        alertDialog.show();
                    }





                }

            });
    }
}
