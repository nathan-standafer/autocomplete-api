package com.nas.autocomplete.restservice;

public class Title {
    private final long id;
    private final String title;

    public Title(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
