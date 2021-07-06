package com.testj;


import org.apache.commons.lang.StringEscapeUtils;

/**
 * @author zhufeng
 */
public class MainTest {

    public static void main(String[] args) {
        StringEscapeUtils.unescapeJava("\001");
        System.out.println("=====================");
        System.out.println("==="+StringEscapeUtils.unescapeJava("\001")+"===");
        System.out.println("=====================");

    }

}
