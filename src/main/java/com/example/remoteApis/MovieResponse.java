package com.example.remoteApis;

public class MovieResponse {

    private String title;
    private String tagline;
    private String release_date;

    public MovieResponse() {
    }

    public MovieResponse(String title, String tagline, String release_date) {
        this.title = title;
        this.tagline = tagline;
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}
