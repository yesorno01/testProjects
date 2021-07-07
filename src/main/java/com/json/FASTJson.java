package com.json;


import com.alibaba.fastjson.JSON;
import com.json.vo.Grade;
import com.json.vo.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FASTJson {

    //解析
    @Test
    public void test1() {
        // 对象嵌套数组嵌套对象
        String json1 = "{'id':1,'name':'JAVAEE-1703','stus':[{'id':101,'name':'刘铭','age':16}]}";
        // 数组
        String json2 = "['北京','天津','杭州']";
        //1、
        //静态方法
        Grade grade = JSON.parseObject(json1, Grade.class);
        System.out.println(grade);
        //2、
        List<String> list = JSON.parseArray(json2, String.class);
        System.out.println(list);
    }

    //生成
    @Test
    public void test2() {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            list.add(new Student(101 + i, "李四", 20 + i));
        }
        Grade grade = new Grade(100001, "张三", list);
        String json = JSON.toJSONString(grade);
        System.out.println(json);
    }

}
