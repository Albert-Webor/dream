package pojo.v8_bean.table;

import lombok.Data;

import java.util.ArrayList;

/*
* 一个TableObj对象对应一个table.xml
* */
@Data
public class TablesXmlObj {
    String id; //基本信息中的编号
    String longName;//基本信息中的中文名
    String packageNm;//基本信息中的生成类的包名
    String description; //基本信息中的描述
    ArrayList<TableObj> tbls; //一个个的表定义
    public TablesXmlObj() {
        tbls = new ArrayList<>();
    }
    //表的字段对象
}
