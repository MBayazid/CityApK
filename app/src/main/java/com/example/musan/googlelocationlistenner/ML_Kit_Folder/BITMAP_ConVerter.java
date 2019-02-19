package com.example.musan.googlelocationlistenner.ML_Kit_Folder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.musan.googlelocationlistenner.R;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.skvarnan.photo.capture.library.PhotoCaptureHelper;


public class BITMAP_ConVerter extends AppCompatActivity {
    ImageView imageView;
    Button btnProcess,Camera;
    EditText txtResult;
    private PhotoCaptureHelper mPhotoCaptureHelper;
    private static final int CAPTURE_IMAGE = 1001;

    private Bitmap mSelectedImage = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap__con_verter);


        mPhotoCaptureHelper = new PhotoCaptureHelper(this);
        //Set the name of the folder where the pictures are saved in the sd card
        mPhotoCaptureHelper.setDirectoryName("MyDir");
        //Set the desired height and width of the photo
        mPhotoCaptureHelper.setPhotoHeightWidth(512, 1024);


        imageView = (ImageView)findViewById(R.id.image_view);
        btnProcess = (Button)findViewById(R.id.button_process);
       Camera = (Button)findViewById(R.id.camera);
        txtResult = (EditText) findViewById(R.id.textview_result);

      Camera.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              dispatchTakePictureIntent();
          }
      });
        mSelectedImage = BitmapFactory.decodeResource(
                getApplicationContext().getResources(),R.drawable.h1_d_edu_nav
        );
        imageView.setImageBitmap(mSelectedImage);

        btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextRecognizer textRecognizer = new TextRecognizer.Builder(getApplicationContext()).build();
                if(!textRecognizer.isOperational())
                    Log.e("ERROR","Detector dependencies are not yet available");
                else{
                    Frame frame = new Frame.Builder().setBitmap(mSelectedImage).build();
                    SparseArray<TextBlock> items = textRecognizer.detect(frame);
                    StringBuilder stringBuilder = new StringBuilder();
                    for(int i=0;i<items.size();++i)
                    {
                        TextBlock item = items.valueAt(i);
                        stringBuilder.append(item.getValue());
                        stringBuilder.append("\n");
                    }
                    txtResult.setText(stringBuilder.toString());
                }
            }
        });

    }


    private void dispatchTakePictureIntent() {
        // From Marshmellow you have to get the permission before accessing the phone memory
        PhotoCaptureHelper.verifyStoragePermissions(this);

        //Start the intent
        final Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, mPhotoCaptureHelper.setImageUri());
        startActivityForResult(intent, CAPTURE_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == CAPTURE_IMAGE) {

                //Capture the intent and directly convert to bitmap
                mSelectedImage = mPhotoCaptureHelper.getImageBitmap();

                ((ImageView) findViewById(R.id.image_view)).setImageBitmap(mSelectedImage);

            }
        }

    }
}
