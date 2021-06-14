# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import combinations

N = int(input())
Nlist = input().split()
n = d = 0

for x in combinations(Nlist, int(input())):
  if 'a' in x:
    n += 1
  else:
    d += 1

print(n / (d + n))
