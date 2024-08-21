package base.jdk8.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        //验证带有@FunctionalInterface注解函数式接口能使用Lambda
        String c = "a";
        String d = "b";

        LambdaInterface lambdaInterface = (a,b) ->{
            System.out.println("带注解的函数式接口");
        };
        lambdaInterface.say(c,d);
        //验证不带@FunctionalInterface的函数式接口也能使用
        NormalInterface normalInterface = () ->{
            System.out.println("不带注解的函数式接口");
        };
        normalInterface.say();
        //即使接口不是函数式接口，但是只要接口内只有一个未实现的方法，那么也是函数式接口来使用
        MultiInterface multiInterface = () ->{
            System.out.println("多个方法但是只有一个抽象方法的接口也能用Lambda表达式");
        };
        multiInterface.say();
        //Lambda的特殊用法

        // 1，遍历
        List<String> list = Arrays.asList("a", "b");
        for (String s : list) {}
        // 使用Lambda表达式
        list.forEach(s -> {
            System.out.println(s);
            System.out.print(s);
        });
        // 2,其他用法待定

    }
}
