#!/bin/bash

javac InMemory.java
retVal=$?
if [ $retVal -ne 0 ]; then
  echo "Error"
  exit $retVal
fi

size=1
for i in `seq 0 31`;
do
	echo $i $size
	java InMemory noio $size
	retVal=$?
	if [ $retVal -ne 0 ]; then
		echo "Error"
		exit $retVal
	fi
  ((size=$size * 2))
done

