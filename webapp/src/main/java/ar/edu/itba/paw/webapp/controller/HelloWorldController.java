package ar.edu.itba.paw.webapp.controller;

import ar.edu.itba.paw.User;
import ar.edu.itba.paw.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    private final UserService us;

    @Autowired
    public HelloWorldController(final UserService us) {
        this.us = us;
    }

    @RequestMapping("/")
    public ModelAndView helloWorld() {
        final ModelAndView mav = new ModelAndView("index");
        mav.addObject("user", us.login("fedeshih@gmail.com", "hola"));
        return mav;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(@RequestParam("email") final String email, @RequestParam("password") final String password) {
        final User user = us.login(email, password);
        final ModelAndView mav = new ModelAndView("index");
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping("/{id:\\d+}")
    public ModelAndView profile(@PathVariable("id") final long userId) {
        return new ModelAndView("profile").addObject("userid", userId);
    }
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView registerForm() {
        return new ModelAndView("register");
    }
}
