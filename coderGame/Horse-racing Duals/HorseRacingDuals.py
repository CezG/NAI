# Horse-racing Duals
# https://www.codingame.com/ide/puzzle/horse-racing-duals

# author of solution: Cezary Gulba

import sys
import math

n = int(input())
tab = []
tab2 = []

for i in range(n):
    pi = int(input())
    tab.append(pi)
tab.sort()
for i in range(n-1):
    tab2.append(tab[i+1]-tab[i])
tab2.sort()
print(tab2[0])
