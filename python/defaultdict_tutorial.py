# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import defaultdict

A = defaultdict(list)
n, m = map(int, input().split())

for i in range(1, n + 1):
  A[input()].append(i)
  
for i in range(m):
  mc = input()
  if mc in A.keys():
    print(*A[mc])
  else:
    print(-1)
