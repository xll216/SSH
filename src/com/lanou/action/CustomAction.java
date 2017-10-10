package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class CustomAction extends ActionSupport {
    private String username;

    /**
     * 从Actionsupport类继承下的动作方法
     * 当struts.xml中的action标签没有配置method属性时会调用的方法
     **/
    @Override
    public String execute() throws Exception {
        System.out.println(username);
        return SUCCESS;
    }


    /**
     * 验证全局结果集
     * 即当前动作返回的结果在该action中没有定义时会去查找该package包下的全局结果集中
     * 是否有对应的声明，有则直接执行，没有则返回错误
     **/
    public String customGlobleResult() {
        return ERROR;
    }

    /**
     * 从Actionsupport类继承下的方法
     * 用户表单验证
     * 执行在动作方法前
     * 如果验证失败返回input
     **/
    @Override
    public void validate() {
        super.validate();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
