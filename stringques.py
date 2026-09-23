str1="aaabbbccd"
str2=""
for i in str1:
    if(str1.count(i)<=2):
        str2.append(i)
print(str2)
    