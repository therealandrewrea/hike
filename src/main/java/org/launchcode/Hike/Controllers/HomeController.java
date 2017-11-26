package org.launchcode.Hike.Controllers;

import org.launchcode.Hike.Models.hike;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("home")
public class HomeController {

    static ArrayList<hike> hikes = new ArrayList<>();

    @RequestMapping(value="")
    public String index(Model model) {

        model.addAttribute("hikes", hikes);
        model.addAttribute("title", "Take A Hike!");
        return "home/index";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String DisplayAdd(Model model) {

        model.addAttribute("title", "Share A Hike");
        return "home/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String ProcessAdd(@RequestParam String hikeName, @RequestParam String hikeDescription, @RequestParam String hikeLocation) {
        hike newHike = new hike (hikeName,  hikeDescription, hikeLocation);
        hikes.add(newHike);
        return"redirect:";
    }
}
