#!/bin/bash

BASE="$HOME/git/sql-processor/sql-samples"

run()
{
	cd $1
	mvn7 exec:exec -P db2mo
	if [ $? -ne 0 ]; then
		exit 1
	fi
	mvn7 exec:exec -P db2me
	if [ $? -ne 0 ]; then
		exit 1
	fi
	mvn7 exec:exec -P mo2ja
	if [ $? -ne 0 ]; then
		exit 1
	fi
	mvn6 clean install exec:java
	if [ $? -ne 0 ]; then
		exit 1
	fi
}

run $BASE/"simple-jdbc-crud"
run $BASE/"simple-jdbc-dao"
