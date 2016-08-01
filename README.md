# NetSocketExam
请按照以下说明运行项目

## EXAM1
1. 编译 mvn compile
2. 运行 mvn exec:java -Dexec.mainClass="com.hand.App"

## EXAM2
1. 编译 mvn compile

2. 运行 <br>
要分别打开两个位于项目目录的终端（命令后）先在一个终端中运行打开服务端<br>
mvn exec:java -Dexec.mainClass="com.hand.Server" <br>
再在第二个命令行中运行客户端<br>
mvn exec:java -Dexec.mainClass="com.hand.Client"