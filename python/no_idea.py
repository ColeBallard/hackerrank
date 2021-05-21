# Enter your code here. Read input from STDIN. Print output to STDOUT
ar, x, y = [list(map(int, input().split())) for _ in range(4)][1:]
A = set(x)
B = set(y)

print(sum([(i in A)-(i in B) for i in ar]))
