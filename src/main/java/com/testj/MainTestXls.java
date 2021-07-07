package com.testj;


import com.testj.vo.Stores;
import com.testj.vo.StoresXls;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import org.apache.commons.lang.StringEscapeUtils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhufeng
 */
public class MainTestXls {

    public static void main(String[] args) {
        StringEscapeUtils.unescapeJava("\001");
        System.out.println("=====================");
        System.out.println("===" + StringEscapeUtils.unescapeJava("\001") + "===");
        System.out.println("=====================");

    }

    public static List<StoresXls> getListStores() {
        List<StoresXls> storesXlss = new ArrayList<StoresXls>();
        jxl.Workbook readwb = null;
        try {
            //构建Workbook对象, 只读Workbook对象

            //直接从本地文件创建Workbook
            InputStream instream = new FileInputStream("E:/stroe.xls");
            readwb = Workbook.getWorkbook(instream);
            //Sheet的下标是从0开始
            //获取第一张Sheet表
            Sheet readsheet = readwb.getSheet(0);

            //获取Sheet表中所包含的总列数
            int rsColumns = readsheet.getColumns();

            //获取Sheet表中所包含的总行数
            int rsRows = readsheet.getRows();

            //获取指定单元格的对象引用
            for (int i = 1; i < rsRows; i++) {
                System.out.print(i + "------");
                StoresXls stroesXls = new StoresXls();
                stroesXls.setPublic_id(1613);
                stroesXls.setShop_password("admin1");
                //1613
                stroesXls.setImg("");
                stroesXls.setShow_order("1");
                for (int j = 0; j < rsColumns; j++) {
                    Cell cell = readsheet.getCell(j, i);
                    String str = cell.getContents();
                    switch (j) {
                        case 0:
                            stroesXls.setName(str);
                            break;
                        case 1:
                            stroesXls.setPhone(str);
                            break;
                        case 2:
                            stroesXls.setProvince("广西自治区");
                            break;
                        case 3:
                            stroesXls.setCity(str);
                            break;
                        case 4:
                            stroesXls.setAddress(str);
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            stroesXls.setShop_login_name("admin" + i);
                            break;
                        case 8:
                            stroesXls.setShop_password("admin1");
                            break;
                    }

                }
                storesXlss.add(stroesXls);
            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            readwb.close();

        }
        return storesXlss;
    }

}
