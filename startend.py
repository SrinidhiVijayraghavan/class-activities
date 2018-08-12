def startEndVowels(word):
    stat=False
    if word[0] in ['a','e','i','o','u','A','E','I','O','U'] and word[-1] in ['a','e','i','o','u','A','E','I','O','U']:
        stat=True
    print(stat)    

a=raw_input("Enter a word")
startEndVowels(a)