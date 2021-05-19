def minion_game(string):
  # your code goes here
  vowels = 'AEIOU'
  stuart = 0
  kevin = 0
  
  i = 0
  for c in string: 
    if vowels.find(c) == -1:
      stuart += len(string) - i
    else:
      kevin += len(string) - i
    i += 1
    
  if stuart > kevin:
    print('Stuart ' + str(stuart))
  elif kevin > stuart:
    print('Kevin ' + str(kevin))
  else:
    print('Draw')
    
      

if __name__ == '__main__':
    s = input()
    minion_game(s)
