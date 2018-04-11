package com.storyseed.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Nick on 10/04/2018.
 */

@Controller
public class CrudController {

    @RequestMapping(value = "/crud", method = RequestMethod.GET)
    public ModelAndView home(ModelAndView modelAndView){
        modelAndView.addObject("test", "test");
        modelAndView.setViewName("crudView");
        return modelAndView;
    }
}
