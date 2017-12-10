package org.launchcode.Hike.Controllers;

import org.launchcode.Hike.Models.data.tagsDao;
import org.launchcode.Hike.Models.forms.AddTagForm;
import org.launchcode.Hike.Models.hike;
import org.launchcode.Hike.Models.tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping("home")
public class HikeController {

    @Autowired
    org.launchcode.Hike.Models.data.hikeDao hikeDao;

    @Autowired
    org.launchcode.Hike.Models.data.tagsDao tagsDao;

    static ArrayList<hike> hikes = new ArrayList<>();

    @RequestMapping(value="")
    public String index(Model model) {

        model.addAttribute("hikes", hikeDao.findAll());
        model.addAttribute("title", "Take A Hike!");
        model.addAttribute(new hike());
        return "home/index";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String DisplayAdd(Model model) {

        model.addAttribute("title", "Share A Hike");
        model.addAttribute(new hike());
        return "home/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String ProcessAdd(@ModelAttribute @Valid hike newHike, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Share A Hike");
            model.addAttribute(new hike());
            return "home/add";
        }
        hikeDao.save(newHike);
        return "redirect:";
    }

    /*@RequestMapping(value = "view/{hikeId}", method = RequestMethod.GET)
    public String viewHike(Model model, @PathVariable int hikeId) {
        hike hike = hikeDao.findOne(hikeId);

        AddTagForm form = new AddTagForm(tagsDao.findAll(), hike); // not sure why it says this is static //

        model.addAttribute("title", "Add a Tag to this Hike");
        model.addAttribute("form", form);

        return "home/add-tags";
    }

    @RequestMapping(value = "add-tags", method = RequestMethod.POST)
    public String addTags (Model model, @ModelAttribute @Valid AddTagForm form, Errors errors) {

        if (errors.hasErrors()) {
            model.addAttribute("form", form);
            return "home/add-tags/";
        }
        tags newTag = tagsDao.findOne(form.getTagsId());
        hike newHike = hikeDao.findOne(form.getHikeId());
        newHike.addTag(newTag);
        hikeDao.save(newHike);

        return "redirect:/tags/add/" + newHike.getId();
    }*/
}