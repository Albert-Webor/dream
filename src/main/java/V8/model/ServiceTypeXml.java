package V8.model;

import lombok.Data;

import java.util.List;

/*
* 一个实例对应一个serviceType.xml文件
* */
@Data
public class ServiceTypeXml {
    String ID;
    String longName;
    String kind;
    String packagePath;
    String description;
    List<Service> lstService;
}
