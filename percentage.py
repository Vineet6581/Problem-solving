marks = int(input("enter the marks: "));
if(marks>95):
    print("excellent")
elif(marks>=80 and marks<95):
    print("good")
elif(marks>=60 and marks<80):
    print("average")
else:
    print("below average")
print("marks:",marks)
