package com.lanou.action;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class UserAction {
    private String username="zhangsan";

    /**
     * 添加用户
     **/
    public String addUser() {
        System.out.println("--->>"+username);
        if (username.equals("zhangsan"))
            return "success";
        else {
            return "add";
        }
    }

    /**
     * 删除用户
     **/
    public String deleteUser() {
        return "delete";
    }

    /**
     * 更新用户
     **/
    public String updateUser() {
        return "error";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
