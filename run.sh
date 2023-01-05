#!/bin/bash

if test $# == 0; then
    echo "Missing file to compile and run!"
else
    if python3 compiler.py $1 Test.j; then
        if java -jar jasmin-2.4.jar Test.j; then
            java -cp . Test
        else
            rm -f Test.class
        fi
    else
        rm -f Test.j
    fi
fi

