#!/bin/zsh
RM=/usr/bin/rm
cd antlr || exit
$RM ./*.class
cd ..
cd app || exit
$RM ./*.class
cd ..
cd expression || exit
$RM ./*.class
