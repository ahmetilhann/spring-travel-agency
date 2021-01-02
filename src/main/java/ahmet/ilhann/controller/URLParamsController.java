package ahmet.ilhann.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class URLParamsController {

    @GetMapping("/welcome")
    public String showParams(HttpServletRequest request) {
        String name = request.getParameter("name");
        System.out.println("parameter: " + name);
        return "home";
    }

    @GetMapping("/welcome2")
    public String showParams2(@RequestParam(name = "name", defaultValue = "") String name) {
        System.out.println("parmater: " + name);

        return "home";
    }

}
