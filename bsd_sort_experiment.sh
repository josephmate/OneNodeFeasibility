#!/bin/bash

size=1
start=${1:-1}
if [ "$start" -gt "1" ]
then
  for i in $(seq 1 "$start");
  do
    ((size=$size * 2))
  done
fi

for i in $(seq "$start" 31);
do
	if [ -f "/tmp/unsorted.$size.txt" ]
	then
	  echo exists: /tmp/unsorted.$size.txt
  else
	  echo creating: /tmp/unsorted.$size.txt
	  head -n $size to_sort_2147483647.txt > /tmp/unsorted.$size.txt
	  echo created: /tmp/unsorted.$size.txt
  fi
  echo $i $size

  t1=$(date +%s)
  sort /tmp/unsorted.$size.txt > /dev/null
  t2=$(date +%s)
  secs=$((t2-t1))
  echo 2^$i=$size $secs secs

	retVal=$?
	if [ $retVal -ne 0 ]; then
		echo "Error"
		exit $retVal
	fi
  ((size=$size * 2))
done

