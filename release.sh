#!/bin/bash

mvn release:clean && \

mvn --batch-mode -Dtag=tag-0.4 release:prepare \
                 -DreleaseVersion=0.4 \
                 -DdevelopmentVersion=0.4-SNAPSHOT \
                  -Ptotal && \

mvn release:perform -Ptotal