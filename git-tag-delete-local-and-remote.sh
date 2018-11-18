#!/bin/bash

tag_name=$1

if [ -z "${tag_name}" ] ;then
    echo "Run with a tag name. Usage: ./git-tag-delete-local-and-remote.sh <tag-name>"
    exit 1
fi

git tag -d ${tag_name}
git push origin :refs/tags/${tag_name}
