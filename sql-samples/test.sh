# !/bin/bash

mvn clean install
if [ $? -ne 0 ]; then
	exit 1
fi
cd simple-hibernate/
#mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-jdbc/
mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-jdbc-crud/
mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-jdbc-dao/
mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-jdbc-pojo/
mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-spring/
mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-spring-pojo/
mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi


