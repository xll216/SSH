package com.lanou.action;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class HelloAction {

    /**
     * 动作方法
     * 访问权限必须是public，strut2才能访问到该方法
     * 返回类型必须是String，代表该动作执行之后的结果
     **/
    public String sayHello() {
        System.out.println("你好，蓝鸥");
        return "success";
    }
}
