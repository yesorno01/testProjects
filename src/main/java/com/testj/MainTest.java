package com.testj;


import com.testj.vo.Stores;
import org.apache.commons.lang.StringEscapeUtils;

/**
 * @author zhufeng
 */
public class MainTest {

    public static void main(String[] args) {
        StringEscapeUtils.unescapeJava("\001");
        System.out.println("=====================");
        System.out.println("===" + StringEscapeUtils.unescapeJava("\001") + "===");
        System.out.println("=====================");

        Stores strStores = new Stores();
        Stores reStores = new Stores();
        strStores.setAddress("中华人民共和国辽宁省大连市高新园区汇贤园1号");
        reStores = getPoint(strStores);
        System.out.println("lat = " + reStores.getLat());
        System.out.println("lng = " + reStores.getLng());

    }

    /**
     * 百度地图开放平台--地理编码
     *
     * @param stores
     * @return
     */
    public static Stores getPoint(Stores stores) {
        try {
            String sCurrentLine;
            String sTotalString;
            sCurrentLine = "";
            sTotalString = "";
            java.io.InputStream l_urlStream;

            String ak = "wta4v5U7yy2B1BKGdE0UoDMoo1BQQCLn"; //webak
            ak = "VMnqFeqLRFX2DNcsKU0n8FQId2idx5VU"; //服务ak

            //地理编码:http://api.map.baidu.com/geocoding/v3/?address=北京市海淀区上地十街10号&output=json&ak=您的ak&callback=showLocation //GET请求

            java.net.URL l_url = new java.net.URL("http://api.map.baidu.com/geocoding/v3/?address=" + stores.getAddress().replaceAll(" ", "") + "&output=json&ak=" + ak);
            java.net.HttpURLConnection l_connection = (java.net.HttpURLConnection) l_url.openConnection();
            l_connection.connect();
            l_urlStream = l_connection.getInputStream();
            java.io.BufferedReader l_reader = new java.io.BufferedReader(new java.io.InputStreamReader(l_urlStream));
            String str = l_reader.readLine();
            System.out.println(str);

            //用经度分割返回的网页代码
            String s = "," + "\"" + "lat" + "\"" + ":";
            String[] strs = str.split(s, 2);
            String s1 = "\"" + "lng" + "\"" + ":";
            String[] a = strs[0].split(s1, 2);
//            System.out.println(a[1]);
            stores.setLng(Float.parseFloat(a[1]));
            s1 = "}" + "," + "\"";
            String[] a1 = strs[1].split(s1, 2);
//            System.out.println(a1[0]);
            stores.setLat(Float.parseFloat(a1[0]));
            return stores;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stores;
    }
}
