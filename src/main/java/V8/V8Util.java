package V8;

import AI.StringUtil;
import V8.bean.ServiceObj;
import V8.bean.ServiceTypeObj;
import org.springframework.aop.interceptor.ConcurrencyThrottleInterceptor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static V8.LtError.*;

/*
* v8专用的工具类，用来导出表，服务之类的
* */
public class V8Util {
    private static BizLog bizlog = new BizLog();
    private static final String U_TABLE_XML_SUFFIX = ".tables.xml";//表的XML后缀
    private static final String U_SERVICETYPE_XML_SUFFIX = ".serviceType.xml";//服务的XML后缀


    private static ArrayList<File> list = new ArrayList<>();

    public static void main(String[] args) throws Throwable {
        String path = "D:/tables";
        getAllTable(path);
    }


    /*
    * 获取目录下所有的ServiceType及其子服务
    * */
    public static ArrayList<ServiceTypeObj> getAllServiceType(String path) throws Throwable {
        ArrayList<ServiceTypeObj> cplOutput = new ArrayList<>();
        File fPath = new File(path);
        if(!fPath.exists())
            throw LtError.A001(path+"：该目录不存在");;
        ArrayList<File> lstFile = xianshi(path); //获取目录下所有文件
        boolean isSerTypeFlg; //当前行属于serviceType,则为true
        boolean isServiceFlg; //当前行属于Service，则为true
        boolean isExistsDes; // serviceType和service是否存在descrition
        for(File obj : lstFile){

            ServiceTypeObj serviceTypeObj = new ServiceTypeObj();
            //不属于服务的文件过滤
            if(StringUtil.chkExistsStr("servicetype",obj.getAbsolutePath()) == -1)
                continue;
            Scanner sFile = new Scanner(obj);
            //遍历每个ServiceType.xml
            isSerTypeFlg = false; //重置
            isServiceFlg = false; //重置
            isExistsDes =false;//重置
            StringBuilder sBuild = new StringBuilder(); // 因为ServiceType,description描述可能不止1行
            ServiceObj serviceObj = null;
            while(sFile.hasNextLine()){
                String lStr = sFile.nextLine();
                //获取除了description外的所有信息
                if(StringUtil.chkExistsStr("<serviceType",lStr) != -1){
                    //默认<ServiceType>就一行
                    int idIndex = StringUtil.chkExistsStr("id",lStr);
                    int kindIndex = StringUtil.chkExistsStr("kind",lStr);
                    int lNameIndex = StringUtil.chkExistsStr("longname",lStr);
                    int packIndex = StringUtil.chkExistsStr("package",lStr);
                    String serviceTypeId = lStr.substring(idIndex+4,kindIndex-2);
                    bizlog.debug(serviceTypeId+"\t");
                    serviceTypeObj.setId(serviceTypeId);  // 获取serviceTypeId
                    String serviceTypeLongName = lStr.substring(lNameIndex+10,packIndex-2);
                    bizlog.debug(serviceTypeLongName+"\t");
                    serviceTypeObj.setLongName(serviceTypeLongName); //获取到serviceTypeLongName
                    isSerTypeFlg = true;
                    isServiceFlg = false;
                    continue;
                }
                if(StringUtil.chkExistsStr("<service",lStr) != -1){
                    serviceObj=new ServiceObj();
                    //获取子服务的：id
                    int idIndex = StringUtil.chkExistsStr("id",lStr);
                    int nmIndex = StringUtil.chkExistsStr(" name",lStr);
                    int longNmIndex = StringUtil.chkExistsStr("longname",lStr);
                    String serviceId = lStr.substring(idIndex+4,nmIndex-1);
                    bizlog.debug(serviceId+"\t");
                    serviceObj.setId(serviceId);
                    //获取子服务的：name
                    String serviceNm = lStr.substring(nmIndex+7,longNmIndex-2);
                    bizlog.debug(serviceNm+"\t");
                    serviceObj.setMethodName(serviceNm);
                    //获取子服务的：LongName
                    String serviceLongNm = lStr.substring(longNmIndex+10,lStr.length()-2);
                    bizlog.debug(serviceLongNm+"\t");
                    serviceObj.setLongName(serviceLongNm);
                    isServiceFlg = true;
                    isSerTypeFlg = false;
                    continue;
                }
                if(StringUtil.chkExistsStr("</service",lStr) != -1){
                    isServiceFlg = false;
                    bizlog.debug("\n");
                    continue;
                }
                int desBegIndex = StringUtil.chkExistsStr("<description",lStr);
                if(desBegIndex != -1){
                    isExistsDes =true;
                }
                if(isSerTypeFlg == true
                        && isExistsDes == true){ //ServiceType的描述
                    int desEndIndex = StringUtil.chkExistsStr("/description",lStr);
                    sBuild.append(lStr);
                     if(desEndIndex != -1 ){ //匹配到则获取描述结束
                         int desFinalBegIndex = StringUtil.chkExistsStr("<description",sBuild.toString());
                         int desFinalEndIndex = StringUtil.chkExistsStr("/description",sBuild.toString());
                        String serviceTypeDes = sBuild.substring(desFinalBegIndex+22,desFinalEndIndex-4);
                        bizlog.debug(serviceTypeDes+"\t");
                        serviceTypeObj.setDescription(serviceTypeDes);
                        isSerTypeFlg = false;
                        sBuild.setLength(0);
                    }
                    continue;
                }
                if(isServiceFlg == true
                        && isExistsDes == true) { //Service的描述
                    int desEndIndex = StringUtil.chkExistsStr("/description",lStr);
                    sBuild.append(lStr);
                    if(desEndIndex != -1 ){ //匹配到则获取描述结束
                        int desFinalBegIndex = StringUtil.chkExistsStr("<description",sBuild.toString());
                        int desFinalEndIndex = StringUtil.chkExistsStr("/description",sBuild.toString());
                        String serviceDes = sBuild.substring(desFinalBegIndex+22,desFinalEndIndex-4);
                        bizlog.debug(serviceDes+"\t");
                        serviceObj.setDescription(serviceDes);
                        isServiceFlg = false;
                        sBuild.setLength(0);
                    }
                    continue;
                }
                if(StringUtil.chkExistsStr("/description",lStr) != -1){
                    isExistsDes =false; // 获取description结束
                }
            }
        }
        return cplOutput;
    }










    /*
     * 获取目录下的所有表以及中文
     * */
    public static ArrayList<String> getAllTable(String path) throws Throwable {
        ArrayList<String> lst = new ArrayList<>();
        File fPath = new File(path);
        if(!fPath.exists())
            return null;
        ArrayList<File> lstFile = xianshi(path);
        for(File obj : lstFile){
            if(StringUtil.chkExistsStr("tables",obj.getAbsolutePath()) == -1)
                continue;
            int length = obj.getName().length();
            StringBuilder resStr = new StringBuilder();
            // 获取英文表名
            resStr.append(obj.getName().substring(0,length - U_TABLE_XML_SUFFIX.length()));
            Scanner sFile = new Scanner(obj);
            while(sFile.hasNextLine()){
                String lStr = sFile.nextLine();
                int index =StringUtil.chkExistsStr("<description>",lStr);
                if(index == -1)
                    continue;
                String chinsName = lStr.substring(index + "<description>".length() + "<![CDATA[".length(), lStr.length() - 17);
                resStr.append("\t"+chinsName);
                lst.add(resStr.toString());
                System.out.println(resStr);
            }
        }
        return lst;
    }
    /*
     * 遍历目录下的所有文件，返回每个文件的File对象
     * */
    public static ArrayList<File> xianshi(String path) throws Throwable {
        File mPath = new File(path);
        if(!mPath.exists())
            throw LtError.A001("目录不存在");
        if(mPath.isDirectory()){
            for(File obj: mPath.listFiles())
                xianshi(obj.getAbsolutePath());
        }else{
            list.add(mPath);
        }
        return list;
    }
}
