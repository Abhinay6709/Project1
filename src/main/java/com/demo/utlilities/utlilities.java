package com.demo.utlilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class utlilities {
    public static String MY_PATH="C:\\Users\\ABTELU\\Documents\\Eclipse Workspace\\Project1\\src\\main\\java\\com\\demo\\config\\config.properties";
    public static String EXCEL_PATH="C:\\Users\\ABTELU\\Desktop\\Book1.xlsx";
    public static Object[][] getExcelData() throws IOException {

        FileInputStream fis = new FileInputStream(EXCEL_PATH);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet =workbook.getSheet("Sheet1");
        Object [][] ab = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i=0;i<sheet.getLastRowNum();i++){
            for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
                ab[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
            }
        }
        return ab;
    }

}
