package com.mbobiosio.imagecrop.handlers;

/**
 * Created by kodenerd on 8/23/17.
 */

public class Holder {

    private PickerManager pickerManager;

    private static Holder ourInstance = new Holder();

    public static Holder getInstance() {
        return ourInstance;
    }

    private Holder() {
    }


    public PickerManager getPickerManager() {
        return pickerManager;
    }

    public void setPickerManager(PickerManager pickerManager) {
        this.pickerManager = pickerManager;
    }
}
