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
import android.widget.ImageView;

import com.example.musan.googlelocationlistenner.R;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.skvarnan.photo.capture.library.PhotoCaptureHelper;

public class Camera_activity extends AppCompatActivity {

    private PhotoCaptureHelper mPhotoCaptureHelper;
    private static final int CAPTURE_IMAGE = 1001;

    private Bitmap mSelectedImage = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mPhotoCaptureHelper = new PhotoCaptureHelper(this);
        //Set the name of the folder where the pictures are saved in the sd card
        mPhotoCaptureHelper.setDirectoryName("MyDir");
        //Set the desired height and width of the photo
        mPhotoCaptureHelper.setPhotoHeightWidth(512, 1024);


        setContentView(R.layout.activity_bitmap__con_verter);
    }

    public void click(View v) {
        dispatchTakePictureIntent();
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