package pojo.excel;

import lombok.Data;

import java.util.List;

/*
* Apache POI有现成的API了，因此这个类作为excel的汇总信息，作为函数的输入
* */
@Data
public class ExcelDetailObj {
    static final String DEFAULT_LOCATION = "C:\\Users\\pc\\Documents\\test.xlsx";
    static final int DEFAULT_SHEET_NUM = 2;
    static final String DEFAULT_EXCEL_TYPE = "XLSX";

    String fileName ; //文件名
    String location ; //文件的绝对路径
    int sheetCount ; //文件中sheet页面的总数
    String excelType ; //excel文件类型
    List<String> lstSheetName; //每个sheet页的名字

    public ExcelDetailObj(){

    }
    public ExcelDetailObj(String location, int sheetCount) {
        this.location = (location == null)? DEFAULT_LOCATION : location;
        this.sheetCount = (sheetCount == 0)? DEFAULT_SHEET_NUM : sheetCount;

    }
}
