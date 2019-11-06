package com.tmxk.lifeschedule.goal.service;

import com.tmxk.lifeschedule.goal.mapper.GoalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jerrywang
 * @create 2019/11/5.
 */
@Service
public class GoalServiceImpl implements GoalService {

    @Autowired
    private GoalMapper goalMapper;

    @Override
    public int saveGoalInfo() {
        return goalMapper.insertGoalInfo();
    }
}
