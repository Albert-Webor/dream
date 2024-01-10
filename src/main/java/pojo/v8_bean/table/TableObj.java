package pojo.v8_bean.table;
/*
* 一个Table对象对应一个表定义
* */

import lombok.Data;

import java.util.List;
@Data
public class TableObj {
        String id; //表定义中的ID
        String name;//表定义中的数据库表名
        String longname;//表定义中的中文名
        String param;
        String tableType;
        String category; //表定义中的业务类别
        String virtual;
        String extension;
        String datasource;
        String sAbstract;
        String tags;
        List<Field> flds;//字段集合
}
