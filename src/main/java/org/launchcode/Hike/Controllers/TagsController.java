package org.launchcode.Hike.Controllers;

import org.launchcode.Hike.Models.tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("tags")
public class TagsController {

    @Autowired
    org.launchcode.Hike.Models.data.tagsDao tagsDao;

    @Autowired
    org.launchcode.Hike.Models.data.hikeDao hikeDao;

    // index //

    // add - GET - return 'tags/' + ${hike.id}//
    @RequestMapping(value = "{hike.id}", method = RequestMethod.GET)
    public String DisplayAddTags(Model model) {

        model.addAttribute("title", "Tag your Hike");
        model.addAttribute(new tags());
        return "tags/{hike.id}";
    }

    // add - POST - //
    @RequestMapping(value = "{hike.id}", method = RequestMethod.POST)
    public String ProcessAddTags(@ModelAttribute @Valid tags newTag, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Share A Hike");
            model.addAttribute(new tags());
            return "tags/{hike.id}";
        }
        tagsDao.save(newTag);
        return "redirect:tags/" + newTag.getId();
    }
}

// TODO may not need if I can fully build out the hike creation into a single page on the hike controller //