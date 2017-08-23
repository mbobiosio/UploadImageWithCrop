package com.mbobiosio.imagecrop.model;

/**
 * Created by kodenerd on 8/23/17.
 */

public class Event {

    private String eventTag;
    private String message;

    public Event(String eventTag, String message) {
        this.eventTag = eventTag;
        this.message = message;
    }

    public boolean isTagMatchWith(String tag){
        return eventTag.equals(tag);
    }

    public String getMessage() {
        return message;
    }
}
