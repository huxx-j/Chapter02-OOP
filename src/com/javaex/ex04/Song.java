package com.javaex.ex04;

public class Song {
    private String title;
    private String artist;
    private String album;
    private String composer;
    private int year;
    private String track;

    public Song () {}

    public Song(String title) {
        this. title = title;
    }

    public Song(String title, String artist) {
        this(title);
        this.artist = artist;
    }

    public Song(String title, String artist, String album) {
        this(title, artist);
        this.album = album;
    }

    public Song(String title, String artist, String album, String composer) {
        this(title, artist, album);
        this.composer = composer;
    }

    public Song(String title, String artist, String album, String composer, int year) {
        this(title, artist, album, composer);
        this.year = year;
    }

    public Song(String title, String artist, String album, String composer, int year, String track) {
        this(title, artist, album, composer, year);
        this.track = track;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public String getComposer() {
        return composer;
    }

    public String getTitle() {
        return title;
    }

    public String getTrack() {
        return track;
    }

    public void showInfo() {
        System.out.println(artist + ", " + title + " (" + album + ", " + year + ", " + track + ", " + composer +" 작곡)" );
    }
}

