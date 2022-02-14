#!/bin/bash

javac InMemory.java
retVal=$?
if [ $retVal -ne 0 ]; then
  echo "Error"
  exit $retVal
fi

size=1
start=${1:-0}
if [ "$start" -ge "1" ]
then
  for i in $(seq 1 "$start");
  do
    ((size=$size * 2))
  done
fi

for i in $(seq "$start" 31);
do
	echo $i $size
	java -Xmx16g InMemory noio $size
	retVal=$?
	if [ $retVal -ne 0 ]; then
		echo "Error"
		exit $retVal
	fi
  ((size=$size * 2))
done


for i in $(seq "$start" 31);
do

  java -Xmx16g InMemory io $size to_sort_2147483647.txt

	retVal=$?
	if [ $retVal -ne 0 ]; then
		echo "Error"
		exit $retVal
	fi
  ((size=$size * 2))
done




