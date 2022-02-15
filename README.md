This project attempts to experimentally determine when using one node to sort is
sufficient.


| Power  |   Entries | Disk Size  | Java In Memory (sec) | Java IO (sec) | BSD Sort (sec) |
|--------|-----------|------------|----------------------|---------------|----------------|
|   0    |         1 |        21B |                      |               |                |
|   1    |         2 |        41B |                      |               |                |
|   2    |         4 |        83B |                      |               |                |
|   3    |         8 |       164B |                      |               |                |
|   4    |        16 |       326B |                      |               |                |
|   5    |        32 |       655B |                      |               |                |
|   6    |        64 |       1.3K |                      |               |                |
|   7    |       128 |       2.5K |                      |               |                |
|   8    |       256 |       5.1K |                      |               |                |
|   9    |       512 |        10K |                      |               |                |
|  10    |      1024 |        20K |                      |               |                |
|  11    |      2048 |        41K |                      |               |                |
|  12    |      4096 |        82K |                      |               |                |
|  13    |      8192 |       163K |                      |               |                |
|  14    |     16384 |       326K |                      |               |                |
|  15    |     32768 |       652K |                      |               |                |
|  16    |     65536 |       1.3M |                      |               |                |
|  17    |    131072 |       2.5M |                      |               |                |
|  18    |    262144 |       5.1M |                      |               |                |
|  19    |    524288 |        10M |                      |               |                |
|  20    |   1048576 |        20M |                      |               |                |
|  21    |   2097152 |        41M |                      |               |                |
|  22    |   4194304 |        82M |                      |               |                |
|  23    |   8388608 |       163M |                      |               |                |
|  24    |  16777216 |       326M |                      |               |                |
|  25    |  33554432 |       652M |                      |               |                |
|  26    |  67108864 |       1.3G |                      |               |                |
|  27    | 134217728 |       2.5G |                      |               |                |
|  28    |           |            |                      |               |                |
|  29    |           |            |                      |               |                |
|  30    |           |            |                      |               |                |




0 1
0
1 2
0
2 4
0
3 8
1
4 16
0
5 32
2
6 64
1
7 128
1
8 256
2
9 512
3
10 1024
6
11 2048
6
12 4096
16
13 8192
16
14 16384
29
15 32768
183
16 65536
105
17 131072
200
18 262144
385
19 524288
1207
20 1048576
1327
21 2097152
2809
22 4194304
4760
23 8388608
10617
24 16777216
28311
25 33554432
77501
26 67108864
152051
27 134217728
384082
28 268435456
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.base/java.lang.Integer.valueOf(Integer.java:1073)
        at InMemory.sortExperiment(InMemory.java:29)
        at InMemory.main(InMemory.java:16)
Error
Error
28 268435456
511929
29 536870912
1614502
30 1073741824


exists: /tmp/unsorted.1.txt
0 1
2^0=1 0 secs
exists: /tmp/unsorted.2.txt
1 2
2^1=2 0 secs
exists: /tmp/unsorted.4.txt
2 4
2^2=4 0 secs
exists: /tmp/unsorted.8.txt
3 8
2^3=8 0 secs
exists: /tmp/unsorted.16.txt
4 16
2^4=16 0 secs
exists: /tmp/unsorted.32.txt
5 32
2^5=32 0 secs
exists: /tmp/unsorted.64.txt
6 64
2^6=64 0 secs
exists: /tmp/unsorted.128.txt
7 128
2^7=128 0 secs
exists: /tmp/unsorted.256.txt
8 256
2^8=256 0 secs
exists: /tmp/unsorted.512.txt
9 512
2^9=512 0 secs
exists: /tmp/unsorted.1024.txt
10 1024
2^10=1024 0 secs
exists: /tmp/unsorted.2048.txt
11 2048
2^11=2048 0 secs
exists: /tmp/unsorted.4096.txt
12 4096
2^12=4096 0 secs
exists: /tmp/unsorted.8192.txt
13 8192
2^13=8192 0 secs
exists: /tmp/unsorted.16384.txt
14 16384
2^14=16384 0 secs
exists: /tmp/unsorted.32768.txt
15 32768
2^15=32768 0 secs
exists: /tmp/unsorted.65536.txt
16 65536
2^16=65536 1 secs
exists: /tmp/unsorted.131072.txt
17 131072
2^17=131072 1 secs
exists: /tmp/unsorted.262144.txt
18 262144
2^18=262144 2 secs
exists: /tmp/unsorted.524288.txt
19 524288
2^19=524288 5 secs
exists: /tmp/unsorted.1048576.txt
20 1048576
2^20=1048576 10 secs
exists: /tmp/unsorted.2097152.txt
21 2097152
2^21=2097152 22 secs
exists: /tmp/unsorted.4194304.txt
22 4194304
2^22=4194304 50 secs
exists: /tmp/unsorted.8388608.txt
23 8388608
2^23=8388608 100 secs
exists: /tmp/unsorted.16777216.txt
24 16777216
2^24=16777216 211 secs
exists: /tmp/unsorted.33554432.txt
25 33554432
2^25=33554432 444 secs
creating: /tmp/unsorted.67108864.txt
created: /tmp/unsorted.67108864.txt
26 67108864
2^26=67108864 1060 secs
creating: /tmp/unsorted.134217728.txt
created: /tmp/unsorted.134217728.txt
27 134217728
exists: /tmp/unsorted.134217728.txt
27 134217728

Todo:
- DONE java using int index array (up to 4GB)
- DONE tool to generate files of random integers
- DONE bsd sort
- FAILED java in memory sort somehow using 'long' arrays
- - my laptop doesn't have enough memory
