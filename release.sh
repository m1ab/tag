#!/bin/bash

mvn release:clean && \
mvn --batch-mode -Dtag=tag-1.4 release:prepare \
                 -DreleaseVersion=1.4 \
                 -DdevelopmentVersion=1.4-SNAPSHOT \
                  -Ptotal && \
mvn release:perform -Ptotal