a=int(input("enter the first number"))
b=int(input("enter the second number"))
c=int(input("enter the third number"))
if((a>b)and(a>c)):
   large=a
elif((b>a)and(b>c)):
   large=b
else:
   large=c
print("largest number among",a,",",b,"and",c,"is",large)
