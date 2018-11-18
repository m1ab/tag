#!/bin/bash

MAVEN_HOME=~/apache-maven-3.3.9

MYVERSION=$1

if [ -z "${MYVERSION}" ] ;then
    echo "Run with a version number. Usage: chver <version number>"
    exit 1
fi

# ${MAVEN_HOME}/bin/
mvn versions:set -DnewVersion=${MYVERSION}

find ./ -name *.versionsBackup -exec rm {} \;

find ./ -name *.versionsBackup


