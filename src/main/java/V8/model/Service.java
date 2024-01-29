package V8.model;

import lombok.Data;

/*
* 一个实例对应一个ServiceType里面的一个服务
* */
@Data
public class Service {
    String ID;
    String name;
    String longName;
}
