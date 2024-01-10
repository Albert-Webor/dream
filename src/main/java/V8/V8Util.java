package V8;

import AI.StringUtil;
import pojo.v8_bean.servicetype.ServiceObj;
import pojo.v8_bean.servicetype.ServiceTypeObj;
import pojo.v8_bean.table.Field;
import pojo.v8_bean.table.TableObj;
import pojo.v8_bean.table.TablesXmlObj;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
* v8专用的工具类，用来导出表，服务之类的
* */
public class V8Util {
    private static BizLog bizlog = new BizLog();
    private static final String U_TABLE_XML_SUFFIX = ".tables.xml";//表的XML后缀
    private static final String U_SERVICETYPE_XML_SUFFIX = ".serviceType.xml";//服务的XML后缀


    private static ArrayList<File> list = new ArrayList<>();

    public static void main(String[] args) throws Throwable {
        String path = "C:\\Tailand\\v8app\\origin_code\\ta-parent\\ta-base\\src\\main\\resources\\servicetype";
        getAllServiceType(path);
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
     * 获取目录下的所有表
     * */
    public static ArrayList<TablesXmlObj> getAllTable(String path) throws Throwable {
        ArrayList<TablesXmlObj> cplOutput = new ArrayList<>();
        ArrayList<File> lstFile = xianshi(path);
        for(File fileObj : lstFile){
            if(StringUtil.chkExistsStr("tables.xml",fileObj.getAbsolutePath()) == -1){
                bizlog.debug("跳过非表定义文件："+fileObj.getAbsolutePath());
                continue;
            }
            TablesXmlObj tablesXmlObj = new TablesXmlObj();
            //开始读取文件
            Scanner scanner = new Scanner(fileObj);
            TableObj tableObj = null;
            boolean tblXmlFlg = false; //true表示正在收集xml信息
            boolean tblObjFlg = false; //true表示正在收集单个表的定义
            boolean mutilLineFLg = false; //是否多行标志,每个元素,每个标签都可能内容是多行
            while (scanner.hasNextLine()){
                String lineStr = scanner.nextLine();
                if(StringUtil.chkExistsStr("<schema",lineStr) != -1)
                    tblXmlFlg = true; //开始收集xml信息
                if(tblXmlFlg){
                    //获取XMl编号
                    int idBeg = StringUtil.chkExistsStr("id=",lineStr);
                    if(idBeg != -1){
                        int idEnd = StringUtil.chkExistsStrIndex("\" ",lineStr.substring(idBeg+3),idBeg);
                        tablesXmlObj.setId(lineStr.substring(idBeg,idEnd));
                    }
                    //获取XML中文名
                    int lNameBeg = StringUtil.chkExistsStr("longname=",lineStr);
                    if(lNameBeg != -1){
                        int lNameEnd = StringUtil.chkExistsStrIndex("\" ",lineStr.substring(lNameBeg+9),lNameBeg);
                        tablesXmlObj.setLongName(lineStr.substring(lNameBeg,lNameEnd));
                    }
                    //获取XML描述
                    int desBeg = StringUtil.chkExistsStr("<description",lineStr);
                    if(desBeg != -1) {
                        int desEnd = StringUtil.chkExistsStrIndex("\" ",lineStr.substring(desBeg+9),desBeg);
                        tablesXmlObj.setDescription(lineStr.substring(desBeg,desEnd));
                    }
                }
                int tableIdex = StringUtil.chkExistsStr("<table",lineStr);
                if(tableIdex != -1) {
                    tblXmlFlg = false; //当遇到第一个表定义标签之后,表示table.xml已经收集完毕
                    tblObjFlg = true; //表示开始收集每个表及字段
                    tableObj = new TableObj(); //遇到一次,新建一次表对象
                }
                if(tblObjFlg) {
                    int fldIndex = StringUtil.chkExistsStr("<field",lineStr);
                    if(fldIndex != -1) {
                        Field fld = new Field();
                                    <field id="abst_tp" longname="摘要类型" type="BaseEnumType.E_ABST_TP" ref="IgDict.A.abst_tp" primarykey="false" final="false" nullable="true" identity="false" allowSubType="true"/>
                        int idBeg = StringUtil.chkExistsStr("id=",lineStr);
                        int idEnd = StringUtil.chkExistsStrIndex("\" ",lineStr.substring(idBeg + 4),idBeg);
                        fld.setId(lineStr.substring(idBeg,idEnd));

                        int lNameBeg = StringUtil.chkExistsStr("longname=",lineStr);
                        int lNameEnd = StringUtil.chkExistsStrIndex("\" ",lineStr.substring(lNameBeg + 10),lNameBeg);
                        fld.setId(lineStr.substring(lNameBeg,lNameEnd));


                        tableObj.getFlds().add(fld);
                    }
                }




                if(true){

                }
                strBud.setLength(0); //清空可变数组
            }
            cplOutput.add(tablesXmlObj);
        }






        if(cplOutput.size() < 1){
            throw new RuntimeException("该目录下没有搜索到表定义");
        }
        return cplOutput;
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
