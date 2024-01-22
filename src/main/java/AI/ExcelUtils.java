package AI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import pojo.excel.ExcelDetailObj;

import java.io.*;
import java.nio.file.Path;

public class ExcelUtils {
    /*
    * 生成一个空的Excel文件
    * */
    public static void createEmptyExcelFile(String dir) throws IOException {

    }

    /*
    * @function 生成一个Excel文件
    * @ExcelDetailObj  一个excel的一些信息，比如总的sheet数，xlsx还是xls等等
    * */
    public static void createExcelFile() throws IOException {
        String desDir = "C:\\Users\\pc\\Documents\\test5.xlsx"; //生成的文件位置
        OutputStream out = new FileOutputStream(desDir);

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = null;
        sheet = workbook.createSheet("sheetName");  //执行一次create方法，workbook自动添加一个sheet页
        /*
        Row对象可以代表sheet页面中的所有行，调用setRowNum可以指定操作哪一行
        或者使用sheet的createRow指定行
         */
        Row row =  sheet.createRow(3); //设置操作行的行号
        row.setHeight((short) 250); //设置行高
        Cell cell = row.createCell(0);
        cell.setCellValue("单元格\t");

        workbook.write(out);
        workbook.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        FileInputStream io = new FileInputStream("C:\\Users\\pc\\Documents\\SCB人员名单.xlsx");
        Workbook workbook = XSSFWorkbookFactory.createWorkbook(io);
        Sheet sheet = workbook.getSheetAt(0);
        int lastNum =sheet.getLastRowNum();
        for(int i=0;i<=lastNum;i++){
            System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
            File file = new File("C:\\Users\\pc\\Documents\\"+"22\\"+sheet.getRow(i).getCell(0).getStringCellValue());
            file.mkdir();
        }


    }

}
