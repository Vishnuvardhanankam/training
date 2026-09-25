s="()))()"
l1=[]
count=0
for i in s:
    if(not l1):
        if(i==")"):
            count+1
    else:
        l1.append(i)
print(count)

    