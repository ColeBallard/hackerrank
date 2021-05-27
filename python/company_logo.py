#!/bin/python3
s = input()
count = {}

for c in s:
  if count.get(c) == None:
    count[c] = 1
  else:
    count[c] = count.get(c) + 1

count = dict(sorted(count.items()))
count = sorted(count.items(), key=lambda item: item[1], reverse=True)
    
for i in range(3):
  print(str(count[i][0]) + ' ' + str(count[i][1]))
