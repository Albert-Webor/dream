package AI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 字符串AI类
* */
public class StringUtil {



    public static void main(String[] args) throws FileNotFoundException {

    }





    /*
   * 判断字符串中是否存在子串,并返回第一次出现子串的位置
   @param1 subString 子串
   @param2 supString 母串
   @return 不存在返回：-1，存在则返回在母串中的位置(0是首字符位置)
    */
    public static int chkExistsStr(String subStr,String supStr){
        int index = 0;
        int successNum = 0; //成功匹配的字符个数
        char[] subList  = subStr.toCharArray();
        char[] supList  = supStr.toCharArray();
        for(int i=0;i<=supStr.length()-subStr.length();i++){
            successNum=0;
            for(int a=0;a<subStr.length();a++){
                index = i;
                char subChar = subList[a];
                char supChar = supList[a+i];
                if(subChar == supChar )
                    successNum+=1;
                else
                    break;
            }
            if(successNum == subStr.length())
                return index;
        }
        return -1;
    }

    /*
    * 从母串指定位置开始向后查,子串第一次出现的位置
    * @return 不存在返回：-1，存在则返回在母串中的位置(0是首字符位置)
    * */
    public static int chkExistsStrIndex(String subStr,String supStr,int beg){
        int firIndex = chkExistsStr(subStr,supStr.substring(beg));
        if(firIndex == -1)
            return -1;
        else
            return firIndex + beg;
    }


    /*
* 查询子串在母串中的个数,以及每次出现的位置
@forexample “111”在"111111"这种算两次，111在11111，这种算1次
@param1 subString 子串
@param2 supString 母串
@return
 */
    public static int[][] qryCountStr(String subStr,String supStr){
        StringBuilder supBuf = new StringBuilder(supStr);
        int arrLen = supStr.length() / subStr.length();
        int [][] subArr = new int[arrLen][2];
        int flg = chkExistsStr(subStr,supStr);
        if(flg != -1){
            for(int i=0;i < arrLen; i++){
                System.out.println(supBuf.toString());
                int index = chkExistsStr(subStr,supBuf.toString());
                if(index == -1)
                    break;
                subArr[i][0] = i;
                subArr[i][1] = (i > 0) ? index + subArr[i-1][1]+subStr.length() : index;
                supBuf.delete(0,index+subStr.length());
            }
            return subArr;
        }else
            return null;
    }
}
