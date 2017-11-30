package org.launchcode.Hike.Models.forms;

import javax.validation.constraints.NotNull;
import org.launchcode.Hike.Models.hike;
import org.launchcode.Hike.Models.tags;


public class AddTagForm {

    @NotNull
    private int hikeId;

    @NotNull
    private int tagsId;

    private Iterable<tags> tags;

    private hike hike;

    public AddTagForm() {}

    public AddTagForm(Iterable<tags> tags, hike hike) {
        this.tags = tags;
        this.hike = hike;
    }

    public int getHikeId() {
        return hikeId;
    }

    public void setHikeId(int hikeId) {
        this.hikeId = hikeId;
    }

    public int getTagsId() {
        return tagsId;
    }

    public void setTagsId(int tagsId) {
        this.tagsId = tagsId;
    }

    public Iterable<tags> getTags() {
        return tags;
    }

    public void setTags(Iterable<tags> tags) {
        this.tags = tags;
    }

    public hike getHike() {
        return hike;
    }

    public void setHike(hike hike) {
        this.hike = hike;
    }
}
