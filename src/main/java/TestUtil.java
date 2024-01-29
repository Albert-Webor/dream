import AI.StringUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class TestUtil {
    public static void main(String[] args) throws IOException {
        String as = "C:\\Tailand\\v8app\\scb_code";
        Scanner scanner = new Scanner(as+"\\pull.sh");
        FileWriter writer = new FileWriter(as+"\\pull.sh");
        File file = new File(as);
        for (String s : file.list()) {
            writer.write("echo 开始拉取"+s+"代码\n");
            writer.write("cd "+s+"\n");
            writer.write("git pull\n");
            writer.write("cd ..\n");
        }
        writer.flush();
        writer.close();
    }
}
