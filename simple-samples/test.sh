# !/bin/bash

mvn clean install
if [ $? -ne 0 ]; then
	exit 1
fi
cd simple-hsqldb/
mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-mysql/
mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-postgresql/
mvn exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
#cd ../simple-oracle/
#mvn exec:java
#if [ $? -ne 0 ]; then
#	exit 1
#fi
#cd ../simple-informix/
#mvn exec:java
#if [ $? -ne 0 ]; then
#	exit 1
#fi
#cd ../simple-db2/
#mvn exec:java
#if [ $? -ne 0 ]; then
#	exit 1
#fi
#cd ../simple-mssql/
#mvn exec:java
#if [ $? -ne 0 ]; then
#	exit 1
#fi

