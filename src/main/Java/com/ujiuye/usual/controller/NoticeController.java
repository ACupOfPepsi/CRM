package com.ujiuye.usual.controller;

import com.ujiuye.usual.bean.Notice;
import com.ujiuye.usual.service.NoticeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author ACupOfPepsi
 * @create 2020-07-09 10:40
 */
@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Resource
    private NoticeService noticeService;

    //查询全部
    @RequestMapping("showAll")
    @ResponseBody
    public List<Notice> showAll(){
        return noticeService.showAll();
    }

    //添加公告
    @RequestMapping("saveinfo")
    public String saveNotice(Notice notice){
        notice.setNdate(new Date());
        //设置当前登录用户id为通知公告的员工
        //notice.setEmpFk()
        boolean b =  noticeService.saveNotice(notice);
        if (b){
            return "redirect:/notice.jsp";
        }else {
            return "error";
        }
    }

    //主页显示公告
    @RequestMapping("showMainPage")
    @ResponseBody
    public List<Notice> showMainPage(){

        return noticeService.showMainPage();
    }

    //查询单独公告
    @RequestMapping("showOneInfo")
    @ResponseBody
    public Notice showOneInfo(int nid){
        return noticeService.showOneInfo(nid);
    }


}
