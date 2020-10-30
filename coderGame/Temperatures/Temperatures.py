# TEMPERATURES
# https://www.codingame.com/ide/puzzle/temperatures

# author of solution: Cezary Gulba

import sys
import math

n = int(input())  # the number of temperatures to analyse
tab=[]
result = 5526
if n !=0:
    for i in input().split():
        # t: a temperature expressed as an integer ranging from -273 to 5526
        t = int(i)
        tab.append(t)
    for  x in tab:
        if (abs(result) > abs(x)) or (abs(result) == x and x > 0 ):
            result = x
else:
    result=0

print(result)
