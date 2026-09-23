input="Zomato"
k=92
k=k%26
output=""
for i in input:
    if i.isupper():
        output+=chr(((ord(i)-ord('A')+k)%26)+ord('A'))
    else:
        output+=chr(((ord(i)-ord('a')+k)%26)+ord('a'))

print(output)