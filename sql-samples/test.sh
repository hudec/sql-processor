# !/bin/bash

mvn6 clean install
if [ $? -ne 0 ]; then
	exit 1
fi
cd simple-hibernate/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-jdbc/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-jdbc-crud/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-jdbc-dao/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-jdbc-pojo/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-spring/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-spring-pojo/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi


