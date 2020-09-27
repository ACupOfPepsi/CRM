package com.ujiuye.usual.service;

import com.ujiuye.usual.bean.Task;

import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-08 14:44
 */
public interface TaskService {
    boolean saveTask(Task task);

    List<Task> showTask(int eid);

    List<Task> showMyTask(int eid);

    boolean updateTaskStatus(Task task);
}
