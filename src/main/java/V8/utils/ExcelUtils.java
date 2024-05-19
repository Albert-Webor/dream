package V8.utils;

import AI.StringUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* 用来批量操作数据文件的
*/
public class ExcelUtils {
        /*
        * 批量新建复合类型
        * */
    public static void addComplexType(){
        String excelNm = "/Users/shaun/Documents/批量新建复合类型模板.xlsx";


    }

    /*
     * 批量新建数据字典类型
     * */
    public static void addDict(String path) throws IOException {
        String format = "<element allowSubType=\"false\" array=\"false\" final=\"false\" id=\"12\" multi=\"false\" override=\"false\"\n" +
                "                 range=\"false\" required=\"false\" type=\"\" longname=\"23\"/>";
        String excelNm = "/Users/shaun/Documents/批量新建数据字典模板.xlsx";
        FileInputStream io = new FileInputStream(path);
        Workbook workbook = XSSFWorkbookFactory.createWorkbook(io);
        Sheet sheet = workbook.getSheetAt(0);
         for(int i=1;i<=sheet.getLastRowNum();i++){
            Row row = sheet.getRow(i);
            String fldNm = row.getCell(0).getStringCellValue();
            String ChiNm = row.getCell(1).getStringCellValue();
            int length = (int)row.getCell(2).getNumericCellValue();


            System.out.println(StringUtil.chkExistsStr("id",format));

            break;
        }


    }

    public static void main(String[] args) throws IOException {
        addDict("/Users/shaun/Desktop/SunCBS/文件/批量新建数据字典模板.xlsx");
    }



}
