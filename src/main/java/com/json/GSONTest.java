package com.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.json.vo.Grade;
import com.json.vo.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GSONTest {
    //解析
    @Test
    public void test1() {
        // 对象嵌套数组嵌套对象
        String json1 = "{'id':1,'name':'JAVAEE-1703','stus':[{'id':101,'name':'刘一','age':16}]}";
        // 数组
        String json2 = "['北京','天津','杭州']";

        Gson gson = new Gson();
        //1、
        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        Grade grade = gson.fromJson(json1, Grade.class);
        System.out.println(grade);

        //2、
        //解析数组要求使用Type
        ArrayList<String> list = gson.fromJson(json2,
                new TypeToken<ArrayList<String>>() {
                }.getType());
        System.out.println(list);
    }

    //生成
    @Test
    public void test2() {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            list.add(new Student(101 + i, "沃杜伟", 20 + i));
        }
        Grade grade = new Grade(100001, "张三", list);
        Gson gson = new Gson();
        //将对象转换为诶JSON格式字符串
        String json = gson.toJson(grade);
        System.out.println(json);

    }
}
