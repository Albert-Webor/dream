package pojo.v8_bean.table;

import lombok.Data;

@Data
public class Field {
    String id;//字段名
    String longName;//字段中文
    String type;//基础类型
    String ref;//字典id
    String primaryKey;
    String nullable;
    String identity;
    String allowSubType;
}

