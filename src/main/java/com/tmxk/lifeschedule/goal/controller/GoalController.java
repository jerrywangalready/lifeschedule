package com.tmxk.lifeschedule.goal.controller;

import com.tmxk.lifeschedule.goal.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jerrywang
 * @create 2019/11/4.
 */
@Controller
@RequestMapping("/goal")
public class GoalController {

    @Autowired
    private GoalService goalService;

    @RequestMapping("/page")
    public String page() {
        return "goal/goal_index";
    }

    @RequestMapping("/add")
    public String add() {
        return "goal/goal_add";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save() {
        goalService.saveGoalInfo();
        return "true";
    }
}
