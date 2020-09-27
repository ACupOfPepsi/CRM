package com.ujiuye.usual.service;

import com.ujiuye.usual.bean.Task;
import com.ujiuye.usual.mapper.TaskMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-08 14:44
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Resource
    private TaskMapper taskMapper;

    @Override
    public boolean saveTask(Task task) {
        //设置任务发布的员工 可以从redis中获取当前发布者
        task.setEmpFk(1);
        //设置工作状态
        task.setStatus(0);
        return taskMapper.insert(task)>0;
    }

    @Override
    public List<Task> showTask(int eid) {


        return taskMapper.showTask(eid);
    }

    @Override
    public List<Task> showMyTask(int eid) {
        return taskMapper.showMyTask(eid);
    }

    @Override
    public boolean updateTaskStatus(Task task) {
        return taskMapper.updateByPrimaryKeySelective(task)>0;
    }
}
