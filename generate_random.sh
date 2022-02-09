#!/bin/bash

javac GenerateRandom.java
retVal=$?
if [ $retVal -ne 0 ]; then
  echo "Error"
  exit $retVal
fi

java GenerateRandom $1 $2
retVal=$?
if [ $retVal -ne 0 ]; then
  echo "Error"
  exit $retVal
fi

