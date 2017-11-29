package org.launchcode.Hike.Models;

public class hike {

    private String name;
    private String description;
    private String location;
    private int hikeId;
//  just including text added fields for now, location may ultimately be coordinates //
//  tags may be included in this class/object as well, need to see what works best //


    public hike(String name, String description, String location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
