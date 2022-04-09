package com.deepmodi.multipleviewtyperv.models;

public class Ads {
    private String adsTitle;
    private String adsHeading;
    private String link;

    public Ads() {
    }

    public Ads(String adsTitle, String adsHeading, String link) {
        this.adsTitle = adsTitle;
        this.adsHeading = adsHeading;
        this.link = link;
    }

    public String getAdsTitle() {
        return adsTitle;
    }

    public void setAdsTitle(String adsTitle) {
        this.adsTitle = adsTitle;
    }

    public String getAdsHeading() {
        return adsHeading;
    }

    public void setAdsHeading(String adsHeading) {
        this.adsHeading = adsHeading;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
