package com.webdemo.controller;

import com.webdemo.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    private HostService hostService;

    @RequestMapping("/")
    public ModelAndView  index() {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("hostInformation", this.hostService.getHostInformation());
        return model;
    }
}
