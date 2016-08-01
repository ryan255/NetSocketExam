# NetSocketExam
请按照以下说明运行项目

## EXAM1
1. 编译 mvn compile
2. 运行 mvn exec:java -Dexec.mainClass="com.hand.App"

## EXAM2
1. 编译 mvn compile

2. 运行 
要分别打开**两个**位于项目目录的**终端**（命令行）先在一个终端中运行打开服务端<br>
mvn exec:java -Dexec.mainClass="com.hand.Server" <br>
再在第二个命令行中运行客户端<br>
mvn exec:java -Dexec.mainClass="com.hand.Client"
3. 原文件位于项目根目录下，客户端接收的文件在source路径下。

## EXAM3
1. 编译 mvn compile
2. 运行 mvn exec:java -Dexec.mainClass="com.hand.XmlCreate"
3. 生成的文件在项目根目录下 new.xml