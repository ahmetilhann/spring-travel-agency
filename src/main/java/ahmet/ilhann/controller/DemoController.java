package ahmet.ilhann.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    // http://localhost:8080/deneme/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {

        log.info("deneme23");

        return "Demo hello";
    }
}
