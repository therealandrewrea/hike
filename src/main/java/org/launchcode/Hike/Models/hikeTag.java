package org.launchcode.Hike.Models;

public enum hikeTag {

    TOUGH ("Tough"),
    EASY ("Easy"),
    CROWDED ("Crowded/Popular"),
    SECLUDED ("Secluded"),
    VIEWS ("Great Views"),
    WOODED ("Wooded"),
    PRIVATE ("Private Property");

    public String name;

    hikeTag(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
