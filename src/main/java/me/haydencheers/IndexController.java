package me.haydencheers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("/echo")
    public ModelAndView echo(@RequestParam("echo") String echo) {
        return new ModelAndView("echo", Map.of("value", echo));
    }
}
