package com.deepmodi.multipleviewtyperv.models;

public class Data {
    private String viewType;
    private Ads ads;
    private Stories stories;

    public Data() {
    }

    public Data(String viewType, Ads ads, Stories stories) {
        this.viewType = viewType;
        this.ads = ads;
        this.stories = stories;
    }

    public Data(String viewType, Ads ads) {
        this.viewType = viewType;
        this.ads = ads;
    }

    public Data(String viewType, Stories stories) {
        this.viewType = viewType;
        this.stories = stories;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    public Ads getAds() {
        return ads;
    }

    public void setAds(Ads ads) {
        this.ads = ads;
    }

    public Stories getStories() {
        return stories;
    }

    public void setStories(Stories stories) {
        this.stories = stories;
    }
}
