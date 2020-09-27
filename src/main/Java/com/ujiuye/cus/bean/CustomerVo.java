package com.ujiuye.cus.bean;

/**
 * @author ACupOfPepsi
 * @create 2020-07-02 12:37
 */
//查询扩展类
//Customer id name .... 都可以使用Customer接收
//关键字，排序，查询条件... Customer中没有这些属性
public class CustomerVo extends Customer{

    //搜索三个查询条件
    private Integer keyindex;
    private String keyCode;
    private Integer num;

    

    @Override
    public String toString() {
        return "CustomerVo{" +
                "keyindex=" + keyindex +
                ", keyCode='" + keyCode + '\'' +
                ", num=" + num +
                '}';
    }

    public void setKeyindex(Integer keyindex) {
        this.keyindex = keyindex;
    }

    public Integer getKeyindex() {
        return keyindex;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    public void setNum(Integer num) {
        this.num = num;
    }



    public String getKeyCode() {
        return keyCode;
    }

    public Integer getNum() {
        return num;
    }
}
