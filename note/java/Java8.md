# Java8特性：Lambda表达式，方法引用，Stream流，新的时间API

### Lambda表达式
* 注解：@FunctionalInterface，用于定义只有一个抽象方法的接口-函数式接口，这种接口可以通过Lambda表示式实例化
> 注意：函数式接口表示接口只有一个抽象方法（哪怕有多个方法，但是只有一个是抽象的），即使没有用上面的注解表示，也能使用Lambda表达式，上面注解的作用只是系统强制性验证确实是函数式接口
* 案例见jdk8包中的lambda包下的案例
*Lambda还有其他特殊用法：
> 遍历：
> 常规的for-each写法是：for (String s : list) {代码块}
> Lambda的写法是调用集合对象的foreach方法：(List)obj.foreach(s -> {代码块 })

> 其他用法待定：在Stream中，Run类实例化，Comparator的简化，一些通用的函数式接口Predicate、Function、Supplier、Consumer
# 新的日期和时间
* LocalDate，表达当时时间：LocalDate localDate = LocalDate.now();比如：2024-08-22
* LocalTime，表示当前日期，实例化方式类似以上，案例：00:02:00.309，表示2分0秒309毫秒
* LocalDateTime，日期和时间的组合，实例化方式类似以上，案例：2024-08-22T00:05:30.899，中间的T表示：
