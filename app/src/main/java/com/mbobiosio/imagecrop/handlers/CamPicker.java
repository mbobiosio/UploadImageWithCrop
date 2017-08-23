package com.mbobiosio.imagecrop.handlers;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;

/**
 * Created by kodenerd on 8/23/17.
 */

public class CamPicker extends PickerManager{

    public CamPicker(Activity activity) {
        super(activity);
    }

    protected void sendToExternalApp()
    {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        mProcessingPhotoUri =  getImageFile();
        intent.putExtra(MediaStore.EXTRA_OUTPUT, mProcessingPhotoUri);
        activity.startActivityForResult(intent, REQUEST_CODE_SELECT_IMAGE);
    }
}
