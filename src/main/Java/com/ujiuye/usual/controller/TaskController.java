package com.ujiuye.usual.controller;

import com.ujiuye.usual.bean.Task;
import com.ujiuye.usual.service.TaskService;
import com.ujiuye.util.ResultInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-08 14:44
 */
@Controller
@RequestMapping("/task")
public class TaskController {

    @Resource
    private TaskService taskService;

    @RequestMapping("addInfo")
    public String saveTask(Task task){

        boolean b =  taskService.saveTask(task);
        if(b){
            return "redirect:/task.jsp";
        }else {
            return "error";
        }
    }

    //查询 我发布
    @RequestMapping("showTask")
    @ResponseBody
    public List<Task> showTask(){

        //Jedis获取id

        return taskService.showTask(1);

    }

    //查询我的任务  我执行
    @RequestMapping("showMyTask")
    @ResponseBody
    public List<Task> showMyTask(){

        //Jedis获取id

        return taskService.showMyTask(5);

    }

    //修改状态码
    @RequestMapping("updateTaskStatus")
    @ResponseBody
    public ResultInfo updateTaskStatus(Task task){
        boolean b = taskService.updateTaskStatus(task);
        ResultInfo resultInfo = new ResultInfo();
        if (b){
            resultInfo.setFlag(b);
        }
        return  resultInfo;
    }


}
