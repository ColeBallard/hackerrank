# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())

words = {}
for i in range(n):
  word = input()
  
  if word not in words.keys():
    words[word] = 1
  else:
    words[word] = words.get(word) + 1

print(str(len(words)))

for word in words:
  print(words.get(word), end=' ')
