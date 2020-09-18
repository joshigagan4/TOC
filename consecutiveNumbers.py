a=str(input())
flag = 0
for i in range(0,len(a)):
    if a[i]=="1":
        flag=flag+1
    elif a[i]=="0" and flag!=3:
        flag=0
for i in range(0,len(a)):
    if a[i]=="0":
        flag=flag+1
    elif a[i]=="1" and flag!=3:
        flag=0
if flag!=3:
    print("rejected")
elif flag==3:
    print("accepted")