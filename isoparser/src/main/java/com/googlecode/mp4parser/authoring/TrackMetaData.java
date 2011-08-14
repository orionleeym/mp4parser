package com.googlecode.mp4parser.authoring;

import java.util.Date;

/**
 *
 */
public class TrackMetaData {
    private String language;
    private long timescale;
    private Date modificationTime;
    private Date creationTime;
    private double width;
    private double height;
    private float volume;
    private long trackId = 1; // zero is not allowed


    /**
     * specifies the front-to-back ordering of video tracks; tracks with lower
     * numbers are closer to the viewer. 0 is the normal value, and -1 would be
     * in front of track 0, and so on.
     */
    int layer;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getTimescale() {
        return timescale;
    }

    public void setTimescale(long timescale) {
        this.timescale = timescale;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
        this.trackId = trackId;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
