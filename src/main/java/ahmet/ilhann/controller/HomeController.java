package ahmet.ilhann.controller;

import ahmet.ilhann.model.Tour;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private List<Tour> tours = new ArrayList<>();

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/addTour")
    public String addTour(Model model) {
        model.addAttribute("tour", new Tour());
        return "form";
    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute Tour tour) {
        tours.add(tour);
        return "redirect:showOffer";
    }

    @GetMapping("/showOffer")
    public String showOffer(Model model) {
        model.addAttribute("tours", tours);
        return "tours";
    }
}
