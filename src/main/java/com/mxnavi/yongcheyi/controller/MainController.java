package com.mxnavi.yongcheyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/main")
    @ResponseBody
    public ModelAndView initPage() {
        ModelAndView view = new ModelAndView();
        view.setViewName("main");
        return view;
    }

    @RequestMapping("/search")
    @ResponseBody
    public ModelAndView searchByType() {
        ModelAndView view = new ModelAndView();
        view.setViewName("search");
        return view;
    }
    
    @RequestMapping("/evaluationList")
    @ResponseBody
    public ModelAndView evaluationList() {
        ModelAndView view = new ModelAndView();
        view.setViewName("evaluationList");
        return view;
    }
}