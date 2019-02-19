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

public class Medical extends AppCompatActivity {
    final String my1 = "01550021275";
    final String my2 = "01918577987";
    final String fy1 = "01550021276";
    final String fy2 = "01913539208";
    final String atr1 = "01550021277";
    final String atr2 = "01731299227";
    final String sab1 = "01550021281";
    final String sab2 = "01712832550";
    final String of1 = "01550021282";
    final String of2 = "01933639979";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        ArrayList<Custome_Fragment_Activity.AndroidFlavor> androidFlavors = new ArrayList<Custome_Fragment_Activity.AndroidFlavor>();
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Dr.Md. Shahab Uddin", "DT Of Dept. Head", R.drawable.shahab));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor(" Dr.Sharifa Akter Labony", "LMT Of Dept. Head", R.drawable.labony));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Dr.Sultana Razia", "PHT Of Dept. Head", R.drawable.sultana1));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Dr. Dipannita Das", " DT Lecturer", R.drawable.dipannita));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Dr. Md. Surot Mehedi", "LMT Lecturer", R.drawable.surot));

        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_computer);
        listView.setAdapter(flavorAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Medical.this).create();
                    alertDialog.setTitle(" Dr.Md. Shahab Uddin (DT Of Dept. Head)");
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
                    AlertDialog alertDialog = new AlertDialog.Builder(Medical.this).create();
                    alertDialog.setTitle("Dr.Sharifa Akter Labony ");
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
                    AlertDialog alertDialog = new AlertDialog.Builder(Medical.this).create();
                    alertDialog.setTitle(" Dr.Sultana Razia");
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
                    AlertDialog alertDialog = new AlertDialog.Builder(Medical.this).create();
                    alertDialog.setTitle("Dr. Dipannita Das");
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

                if (position == 4) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Medical.this).create();
                    alertDialog.setTitle("Dr. Md. Surot Mehedi");
                    alertDialog.setMessage(" \n " + of1+"\n"+of2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", of2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", of1, null));
                            startActivity(intent);

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
