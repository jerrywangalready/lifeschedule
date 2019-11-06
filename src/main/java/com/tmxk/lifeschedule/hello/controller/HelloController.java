package com.tmxk.lifeschedule.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jerrywang
 * @create 2019/11/3.
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("page")
    public String page(Model model) {
        model.addAttribute("ab", "111");
        return "myHtml";
    }
}
