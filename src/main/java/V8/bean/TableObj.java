package V8.bean;

import java.util.ArrayList;

/*
* 对应table.xml中的表对象
* */
public class TableObj {
    String id;
    String name;
    String longName;
    String description;
    String dictID;
    ArrayList<Field> fields;



    public static void main(String[] args) {
        TableObj ta = new TableObj();
        TableObj.Field tableObj = new TableObj().new Field();
        ta.fields.add(tableObj);

    }
    public TableObj() {
        fields = new ArrayList<>();
    }
    //表的字段对象
     class Field{
        String id;
        String dbname;
        String longname;
        String type;
        String ref;
        String primarykey;
        String encryptType;
        String encryptFactor;
        String sFinal; //和关键字final重名了，加个s
        String sDefault; //和关键字default重名了，加个s
        String nullable;
        String desc;
        String identity;
        String allowSubType;
    }
}
