#!/bin/bash

cd $1
echo $1
#exit
clear && make clean && make all && chmod +x rxeflash.sh && ./rxeflash.sh
cd -