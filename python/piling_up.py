# Enter your code here. Read input from STDIN. Print output to STDOUT

for _ in range(int(input())):
  _, b = input(), list(map(int, input().split()))
  m = len(b)
  n = m // 2 if m % 2 == 0 else (m + 1) // 2
  
  ans = 'Yes'
  for i in range(1, n):
    if b[i] > b[i-1] and b[-i-1] > b[-i]:
      ans = 'No'
      break
    
  print(ans)
