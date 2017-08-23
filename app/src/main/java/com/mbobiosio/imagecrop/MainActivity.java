package com.mbobiosio.imagecrop;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.mbobiosio.imagecrop.handlers.PickerBuilder;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    /**
     * I did a couple of stuff for the upload but I'm making this plain setup with the crop feature working.
     * Please any method you choose will be just fine so far it uploads to server.
     * I will fetch the file path to sql
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.profile_image);

        (findViewById(R.id.cam)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new PickerBuilder(MainActivity.this, PickerBuilder.SELECT_FROM_CAMERA)
                        .setOnImageReceivedListener(new PickerBuilder.onImageReceivedListener() {
                            @Override
                            public void onImageReceived(Uri imageUri) {
                            }
                        })
                        .setImageName("camUpload")
                        .setImageFolderName(".camfolder")
                        .withTimeStamp(false)
                        .setCropScreenColor(Color.parseColor(getString(R.string.accent)))
                        .start();
            }
        });

        (findViewById(R.id.gallery)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new PickerBuilder(MainActivity.this, PickerBuilder.SELECT_FROM_GALLERY)
                        .setOnImageReceivedListener(new PickerBuilder.onImageReceivedListener() {
                            @Override
                            public void onImageReceived(Uri imageUri) {
                                imageView.setImageURI(imageUri);
                            }
                        })
                        .setImageName("app")
                        .setImageFolderName(".camfolder")
                        .setCropScreenColor(Color.parseColor(getString(R.string.accent)))
                        .setOnPermissionRefusedListener(new PickerBuilder.onPermissionRefusedListener() {
                            @Override
                            public void onPermissionRefused() {

                            }
                        })
                        .start();
            }
        });


    }
}
