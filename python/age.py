age = int(input("enter the age:"))
if age>0:
    if age<=18:
        print("minor")
    elif(age>18 and age<=45):
        print("young")
    elif(age<60):
        print("mid age")
    elif(age>60):
        print("senior citize")
        