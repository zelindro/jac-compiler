#!/bin/bash

if ! java -jar antlr-4.9.3-complete.jar -Dlanguage=Python3 -no-listener Jac.g4; then
    rm -f Jac*.py Jac*.interp Jac*.tokens
fi

