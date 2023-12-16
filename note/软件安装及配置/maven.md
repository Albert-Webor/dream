##### 安装maven
    * 阿里的maven仓库，添加子mirror  
    <mirror>
		<id>aliyunmaven</id>
		<mirrorOf>*</mirrorOf>
		<name>阿里云公共仓库</name>
		<url>https://maven.aliyun.com/repository/public</url>
	</mirror>
    * 设置本地maven库：<localRepository>C:\dev\maven-repo</localRepository>
    * 控制台测试： mvn help:system