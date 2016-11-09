package com.example.android.newslite;

/**
 * Created by Unicron on 10/25/2016.
 */

public class News {

    private String mTitle;
    private String mAuthor;
    private String mWebUrl;
    private String mSectionName;

    public News(String title, String author, String webUrl, String sectionName) {
        this.mTitle = title;
        this.mAuthor = author;
        this.mWebUrl = webUrl;
        this.mSectionName = sectionName;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        this.mAuthor = author;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public void setSectionName(String sectionName) {
        this.mSectionName = sectionName;
    }

    public String getWebUrl() {
        return mWebUrl;
    }

    public void setWebUrl(String webUrl) {
        this.mWebUrl = webUrl;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + mTitle + '\'' +
                ", author='" + mAuthor + '\'' +
                ", webUrl='" + mWebUrl + '\'' +
                "sectionName='" + mSectionName + '\'' +
                '}';
    }
}