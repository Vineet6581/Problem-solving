"""Chapter 2"""

"""concatenation"""
# str1 = "Vineet"
# str2 = "Chaudhary"
# print(str1 +" "+ str2)
#print(len(str1))


"""indexing"""
# str = "apna college"
# print(str[3])



"""Slicing"""
#str[start:stop:step] where stop index is not included
# str = "apna college"
# print(str[1:4:1])
# print(str[4:12:2])
# print(str[::-3]) #str[0:len(str):-3]
# print(str[-5:-3:1])



"""String Functions"""
# str1 = "I am a coder."
# str1 = str1.capitalize()   #capitalizes 1st char
# print(str1.endswith("er."))  #returns True of string ends with substr
# print(str1.replace("coder", "lieutenant"))  #replaces all occurrences of old with new
# print(str1.find("am"))  #return 1st index of 1st occurrence
# print(str1.count("a"))  #counts the occurrence of the substr in string


"""length of a string"""
# name = input()
# print(len(name))


"""occurrence of a word"""
# name = input("enter your name:")
# print(name.count("e"))



"""conditional statements"""
# light = input("enter the color of traffic light:")
# if(light == "red"):
#     print("stop")
# elif(light == "green"):
#     print("go")
# elif(light == "yellow"):
#     print("look")
# else:
#     print("light is broken")
# print("end of the code")


"""greatest of 3 numbers"""
# print("enter three numbers:")
# a = int(input())
# b = int(input())
# c = int(input())
# if a>=b and a>=c:
#     print(a,"is greater")
# elif b>=c:
#     print(b,"is greater")
# else:
#     print(c,"is greater")



"""check multiple of 7 or not"""
# num = int(input("enter a number:"))
# if num%7==0:
#     print("multiple of 7")
# else:
#     print("not a multiple of 7")
