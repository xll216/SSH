package com.lanou.action;

import com.lanou.domain.Student;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class JsonAction extends ActionSupport {
    private Student student;
    private Map map = new HashMap();
    private List<Student> studentList = new ArrayList<>();

    @Override
    public String execute() throws Exception {
        student = new Student();
        student.setName("张三");
        student.setPsw("123");
        map.put("John", "Galt");

        studentList.add(student);
        return SUCCESS;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
