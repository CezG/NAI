# Power of Thor - Episode 1
# https://www.codingame.com/ide/puzzle/power-of-thor-episode-1

# author of solution: Cezary Gulba

import sys
import math


light_x, light_y, initial_tx, initial_ty = [int(i) for i in input().split()]

thorX = initial_tx
thorY = initial_ty

while True:
    remaining_turns = int(input())  
    directionX=""
    directionY=""

    if thorY > light_y: 
        directionY = "N"
        thorY-=1
    elif thorY < light_y: 
        directionY = "S"
        thorY+=1     
    if thorX > light_x:
        directionX = "W"
        thorX-=1
    elif thorX < light_x:
        directionX = "E"
        thorX+=1
            
    print(directionY + directionX)
