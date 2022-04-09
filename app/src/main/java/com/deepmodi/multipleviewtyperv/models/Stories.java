package com.deepmodi.multipleviewtyperv.models;

public class Stories {
    private String authorName;
    private String title;
    private String subTitle;

    public Stories() {
    }

    public Stories(String authorName, String title, String subTitle) {
        this.authorName = authorName;
        this.title = title;
        this.subTitle = subTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}
