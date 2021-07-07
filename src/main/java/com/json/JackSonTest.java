package com.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.vo.Grade;
import com.json.vo.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class JackSonTest {
    //解析
    @Test
    public void test1() throws Exception {
        // 对象嵌套数组嵌套对象
        String json1 = "{\"id\":1,\"name\":\"JAVAEE-1703\",\"stus\":[{\"id\":101,\"name\":\"刘一\",\"age\":16}]}";
        // 数组
        String json2 = "[\"北京\",\"天津\",\"杭州\"]";
        //1、
        ObjectMapper mapper = new ObjectMapper();
        Grade grade = mapper.readValue(json1, Grade.class);
        System.out.println(grade);
        //2、
        ArrayList<String> list = mapper.readValue(json2,
                new TypeReference<ArrayList<String>>() {
                });
        System.out.println(list);

    }

    //生成
    @Test
    public void test2() throws JsonProcessingException {
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            list.add(new Student(101 + i, "码子", 20 + i));
        }
        Grade grade = new Grade(100001, "张三", list);
        ObjectMapper mapper = new ObjectMapper();
        //将对象转换为JSON格式字符串
        String json = mapper.writeValueAsString(grade);
        System.out.println(json);
    }
}
