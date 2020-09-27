package com.ujiuye.usual.controller;

import com.ujiuye.usual.bean.Baoxiao;
import com.ujiuye.usual.service.BaoxiaoService;
import com.ujiuye.util.ResultInfo;
import com.ujiuye.util.UuidUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author ACupOfPepsi
 * @create 2020-07-09 14:52
 */
@Controller
@RequestMapping("/baoxiao")
public class BaoxiaoController {

    @Resource
    private BaoxiaoService baoxiaoService;

    //获取全部报销
    @RequestMapping("getAllBaoxiao")
    @ResponseBody
    public List<Baoxiao> getAllBaoxiao (){
        List<Baoxiao> baoxiaos = baoxiaoService.getAllBaoxiao();
        return baoxiaos;
    }

    //获取一个报销
    @RequestMapping("getOneBaoxiaoById")
    @ResponseBody
    public Baoxiao getOneBaoxiaoById (String bxid){
        System.out.println(bxid);
       Baoxiao baoxiao =   baoxiaoService.getOneBaoxiaoById(bxid);
       return baoxiao;

    }

    //审批
    @RequestMapping("shenpi")
    @ResponseBody
    public ResultInfo shenpi (Baoxiao baoxiao,String content){
        boolean b = baoxiaoService.shenpi(baoxiao,content);
        ResultInfo resultInfo = new ResultInfo();
        if (b){
            resultInfo.setFlag(true);
        }
        return resultInfo;
    }

    //查询当前用户的报销信息
    @RequestMapping("getBaoxiaoByEid")
    @ResponseBody
    public List<Baoxiao> getBaoxiaoByEid (){
        return baoxiaoService.getBaoxiaoByEid();
    }


    //查询一条报销 和历史批注
    @RequestMapping("showBaoxiaoAndEx")
    @ResponseBody
    public Baoxiao showBaoxiaoAndEx (String bxid){
        return baoxiaoService.showBaoxiaoAndEx(bxid);
    }

    //修改报销
    @RequestMapping("updateBaoxiao")
    public String updateBaoxiao (Baoxiao baoxiao){

        //修改报销状态
        baoxiao.setBxstatus(0);

        boolean b = baoxiaoService.updateBaoxiao(baoxiao);

        if (b){
            return "redirect:/mybaoxiao-base.jsp";
        }else {
            return "error";
        }

    }

    //添加新报销
    @RequestMapping("saveInfo")
    public String saveInfo (Baoxiao baoxiao){

        //设置报销人 ，从redis中获取当前登录用户
        baoxiao.setEmpFk(1);

        //设置报销编号
        baoxiao.setBxid(UuidUtil.getUUID());

        //设置报销状态
        baoxiao.setBxstatus(0);

        boolean b = baoxiaoService.saveInfo(baoxiao);



        if (b){
            return "redirect:/mybaoxiao-base.jsp";
        }else{
            return "error";
        }


    }

}
