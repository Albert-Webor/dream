package base.jdk8.lambda;

public interface MultiInterface {
    void say();
    static void get(){
        System.out.println("接口自带的实现方法");
    }
}
