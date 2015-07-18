# !/bin/bash

mvn6 clean install
if [ $? -ne 0 ]; then
	exit 1
fi
cd simple-hsqldb/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-mysql/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
cd ../simple-postgresql/
mvn6 exec:java
if [ $? -ne 0 ]; then
	exit 1
fi
#cd ../simple-oracle/
#mvn6 exec:java
#if [ $? -ne 0 ]; then
#	exit 1
#fi
#cd ../simple-informix/
#mvn6 exec:java
#if [ $? -ne 0 ]; then
#	exit 1
#fi
#cd ../simple-db2/
#mvn6 exec:java
#if [ $? -ne 0 ]; then
#	exit 1
#fi
#cd ../simple-mssql/
#mvn6 exec:java
#if [ $? -ne 0 ]; then
#	exit 1
#fi

