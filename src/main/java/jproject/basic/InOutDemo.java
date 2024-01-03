package jproject.basic;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 输入输出案例
* */
public class InOutDemo {
   static int sum=1;
   static List<String> lst =new ArrayList<>();
    public static void xunhuan(File file){
        if(file.exists()){
            if(file.isDirectory()){
                for (File obj : file.listFiles()) {
                    xunhuan(obj);
                }
            }else{
                sum++;
                lst.add(file.getAbsolutePath().replace("\\","\\\\"));
//                System.out.println(""+file.getAbsolutePath());
            }
        }else{
            System.out.println("目录不存在");
        }
    }
    public static void main(String[] args) throws Exception{
        String mPath = "D:\\tables";
        File fileTbl = new File(mPath);
        xunhuan(fileTbl);
        System.out.println("表的总数是："+sum);
        System.out.println(lst.get(0));
        Scanner scanner = new Scanner(new File(lst.get(0)));
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
