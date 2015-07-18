#!/bin/bash

BASE="$HOME/git/sql-processor/simple-samples"

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

#run $BASE/"simple-db2"
run $BASE/"simple-hsqldb"
run $BASE/"simple-informix"
#run $BASE/"simple-mssql"
run $BASE/"simple-mysql"
run $BASE/"simple-oracle"
run $BASE/"simple-postgresql"
