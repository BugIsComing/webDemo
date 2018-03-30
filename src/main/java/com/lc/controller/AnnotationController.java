package com.lc.controller;

import com.lc.model.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ifly_lc
 */
@Controller
public class AnnotationController {
    /**
     *  访问http://localhost:8989/webDemo/demo
     * @return a ModelAndView
     */
    @RequestMapping(value = "/demo")
    public ModelAndView demo() {
        ModelAndView mv = new ModelAndView("demo");
        mv.addObject("username", "demo FreeMarker");
        mv.addObject("loglist", this.logList());
        return mv;
    }

    /**
     * 另一种书写方式,但是需要pom文件中的j2ee web spec间的dependency
     * 访问http://localhost:8989/webDemo/demo2
     * @return a ModelAndView
     */
    @RequestMapping(value = "/demo2")
    public String demo2(Model model) {
        model.addAttribute("username", "demo FreeMarker2");
        model.addAttribute("loglist", this.logList());
        return "demo";
    }

    private List<SysUser> logList() {
        List<SysUser> list = new ArrayList<SysUser>();
        final int total = 5;
        for (int i = 0; i < total; i++) {
            SysUser sysUser = new SysUser();
            sysUser.setCreatetime(new Date());
            sysUser.setUsername("LC" + String.valueOf(i));
            list.add(sysUser);
        }
        return list;
    }

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

}
