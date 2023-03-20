package ar.edu.itba.paw.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;

@Controller
public class HelloWorldController {
    private final ViewResolver viewResolver;

    @Autowired
    public HelloWorldController(@Qualifier("viewResolver") final ViewResolver vr) {
        this.viewResolver = vr;
    }

    @RequestMapping("/")
    public ModelAndView helloWorld() {
        final ModelAndView mav = new ModelAndView("index");
        mav.addObject("username", "PAW");
        return mav;
    }
}
