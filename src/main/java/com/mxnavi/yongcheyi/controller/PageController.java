package com.mxnavi.yongcheyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @RequestMapping("/main")
    @ResponseBody
    public ModelAndView initPage() {
        ModelAndView view = new ModelAndView();
        view.setViewName("main");
        return view;
    }

    @RequestMapping("/mSearch")
    @ResponseBody
    public ModelAndView searchByType() {
        ModelAndView view = new ModelAndView();
        view.setViewName("mSearch");
        return view;
    }
    
    @RequestMapping("/mEvaluationList")
    @ResponseBody
    public ModelAndView evaluationList() {
        ModelAndView view = new ModelAndView();
        view.setViewName("mEvaluationList");
        return view;
    }
    
    @RequestMapping("/articleAdd")
    @ResponseBody
    public ModelAndView articleAdd() {
        ModelAndView view = new ModelAndView();
        view.setViewName("articleAdd");
        return view;
    }
    
    @RequestMapping("/userManage")
    @ResponseBody
    public ModelAndView userManage() {
        ModelAndView view = new ModelAndView();
        view.setViewName("userManage");
        return view;
    }
    
}