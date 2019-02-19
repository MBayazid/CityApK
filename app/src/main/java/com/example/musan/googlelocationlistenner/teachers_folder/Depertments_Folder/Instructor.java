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

public class Instructor extends AppCompatActivity {

    final String jh1 = "01550021234";
    final String jh2 = "01711018623";
    final String shr1 = "01550021235";
    final String shr2 = "01914883419";
    final String mh1 = "01550021236";
    final String mh2 = "01720302792";
    final String ar1 = "01550021237";
    final String ar2 = "01954838357";
    final String aq1 = "01550021238";
    final String aq2 = "01918384640";
    final String hr1 = "01550021239";
    final String hr2 = "01913729506";
    final String sam1 = "01550021240";
    final String sam2 = "01959286045";
    final String am1 = "01550021242";
    final String am2 = "01917420420";
    final String rak1 = "01550021243";
    final String rak2 = "01946531880";
    final String sjk1 = "01550021244";
    final String sjk2 = "01716002254";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        ArrayList<Custome_Fragment_Activity.AndroidFlavor> androidFlavors = new ArrayList<Custome_Fragment_Activity.AndroidFlavor>();
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor(" S. M. Jahangir Alam", "Principal", R.drawable.jahagir));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Shaikh Habibur R.", "Vice Principal", R.drawable.habibur));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Md. Mahbubul Haque  ", "Chief Instructor", R.drawable.mahbubul));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Md. Azizur Rahman", "Instructor", R.drawable.azizur));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Abdul Quddus Gazi", "Instructor", R.drawable.quddus));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor(" Md. Hafizur Rahman", "Instructor", R.drawable.hafizur));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Syed Abul Masum", "Instructor", R.drawable.masum12));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor(" Md. Abdul Mannan", "Instructor", R.drawable.mannan));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor("Md. Ruhul Amin Khan", "Instructor", R.drawable.ruhul));
        androidFlavors.add(new Custome_Fragment_Activity.AndroidFlavor(" Syeda Jobeda Khatun", "Instructor", R.drawable.jobeda));
        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_computer);
        listView.setAdapter(flavorAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle(" S. M. Jahangir Alam (Principal)");
                    alertDialog.setMessage("\n " + jh1+"\n"+jh2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", jh2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", jh1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + jh1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }
                if (position == 1) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle("Shaikh Habibur R. (Vice Principal )");
                    alertDialog.setMessage(" \n " + shr1+"\n"+shr2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", shr2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",shr1, null));
                            startActivity(intent);

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





                if (position == 2) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle(" Md. Mahbubul Haque (Chief Instructor )");
                    alertDialog.setMessage(" \n " + mh1+"\n"+mh2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", mh2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",mh1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + mh1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }





                if (position == 3) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle(" Md. Azizur Rahman");
                    alertDialog.setMessage(" \n " + ar1+"\n"+ar2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", ar2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",ar1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + ar1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }



                if (position == 4) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle(" Abdul Quddus Gazi");
                    alertDialog.setMessage(" \n " + aq1+"\n"+aq2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", aq2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",aq1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + aq1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }



                if (position == 5) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle(" Md. Hafizur Rahman");
                    alertDialog.setMessage(" \n " + hr1+"\n"+hr2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", hr2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",hr1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + hr1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }



                if (position == 6) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle(" Syed Abul Masum");
                    alertDialog.setMessage(" \n " + sam1+"\n"+sam2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", sam2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",sam1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + sam1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }



                if (position == 7) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle(" Md. Abdul Mannan");
                    alertDialog.setMessage(" \n " + am1+"\n"+am2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", am2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",am1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + am1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }




                if (position == 8) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle(" Md. Ruhul Amin Khan");
                    alertDialog.setMessage(" \n " + rak1+"\n"+rak2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", rak2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",rak1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + rak1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }




                if (position == 9) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Instructor.this).create();
                    alertDialog.setTitle(" Syeda Jobeda Khatun");
                    alertDialog.setMessage(" \n " + sjk1+"\n"+sjk2);
                    alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Personal", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", sjk2, null));
                            startActivity(intent);
                        }
                    });
                    alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Offcial", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",sjk1, null));
                            startActivity(intent);

                        }
                    });

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok ",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(), "Calling " + sjk1, Toast.LENGTH_LONG).show();
                                    //dialog.dismiss();

                                }
                            });

                    alertDialog.show();
                }






            }

        });


    }
}
