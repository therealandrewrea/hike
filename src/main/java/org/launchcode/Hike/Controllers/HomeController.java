package org.launchcode.Hike.Controllers;

import org.launchcode.Hike.Models.data.HikeDao;
import org.launchcode.Hike.Models.hike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    private HikeDao hikeDao;

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
        return"redirect:";
    }
}