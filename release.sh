#!/bin/bash

~/apache-maven-3.3.9/bin/mvn release:clean && \
~/apache-maven-3.3.9/bin/mvn release:prepare -Ptotal && \
~/apache-maven-3.3.9/bin/mvn release:perform -Ptotal
