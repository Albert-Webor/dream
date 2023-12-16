# Kafka基于Scala语言环境，需要先安装Scala
    * 终端执行，显示成功则安装成功：scala -version
#### Kafka基于Zookeeper，其次需要安装Zookeeper
    * 解压完毕后，在解压目录新建目录：data
    * 复制data的绝对路径
    * 编辑./conf/zoo_sample.cfg文件，将“datadir”修改为data的绝对路径，比如：C:\\dev\\apache-zookeeper-3.7.2\\data，或者C:/dev/apache-zookeeper-3.7.2/data
    * 修改zoo_sample.cfg文件名成：zoo.cfg,这是启动时默认配置的配置文件名称
    * 配置环境变量：安装路径和bin的路径，要终端启动
    * 打开控制台，输入：zkServer启动Zookeeper
#### 安装Kafka
    * 在解压目录新建目录：logs
    * 复制logs的绝对路径
    * 打开./conf/server.properties,将“log.dir”修改为：C:/dev/kafka_2.13-3.6.0/logs 或者 C:\\dev\\kafka_2.13-3.6.0\\logs 
    * 启动kafka指令：kafka-server-start.bat 目录/server.properties,一般启动报错就是配置文件找不到，

