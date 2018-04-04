package com.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author:LC
 * @Date:Created in 22:43 2018/3/29
 * @Modifyed by:
 */
@Controller
public class LcController {
    @RequestMapping(value = "/lc")
    public ModelAndView demo() {
        ModelAndView mv = new ModelAndView("demo");
        return mv;
    }
}

