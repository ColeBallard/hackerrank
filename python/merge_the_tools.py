def merge_the_tools(string, k):
  # your code goes here
  substrings = []
  for i in range(int(len(string)/k)):
    substrings.append(string[k*i:(i+1)*k])
  
  for s in substrings:
    contains = ''
    for c in s:
      if contains.find(c) == -1:
        contains += c
    
    print(contains)

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
