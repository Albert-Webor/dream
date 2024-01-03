package V8.bean;

import java.util.ArrayList;

/*
* 等价于V8中的ServiceType.xml文件
* */
public class ServiceTypeObj {
    String id;
    String kind;
    String longName;
    String packages;
    String description;
    ArrayList<ServiceObj> lstSerivceObj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<ServiceObj> getLstSerivceObj() {
        return lstSerivceObj;
    }

    public void setLstSerivceObj(ArrayList<ServiceObj> lstSerivceObj) {
        this.lstSerivceObj = lstSerivceObj;
    }
}
