name="Welcome to My world!"
name2=name.split(" ")
n=len(name2)
for i in range(n-1,-1,-1):
    print(name2[i],end=" ")

print(" ")
print(name[::-1])
for i in range(0, n):
    print(name2[i][::-1],end=" ")
