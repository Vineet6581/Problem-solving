"""LIST"""
"""Lists(it can store different datatypes as list)"""
# marks = [95.5, 97.8, 95.9, 68.5, 85.4]
# print(marks)
# print(len(marks))
# print(type(marks))
# print(marks[0])
# print(marks[1])

# student = ["karan", 89, "delhi"]



"""LIST METHODS"""
# list = [2,1,3]
# list.append(4) #adds one element at the end
# list.sort() #sorts in ascending order
# list.sort( reverse = True ) #sorts in descending order
# list.reverse() #reverse list
# list.insert(idx,el) #insert element at index
# list.remove() #removes first occurrence of the element
# list.pop(idx) #removes element at idx




""""TUPPLE"""
# tup = (2,1,3,4)
# print(tup)
# print(len(tup))
# print(tup[0])
# print(tup[1])
# print(type(tup))


"""TUPLE METHODS"""
# tup = (2,1,3,1)
# tup.index(el) #returns index of first occurrence
# tup.count(el) #counts total occurrences



"""input 3 movies and store them in list"""
# print("enter the names your 3 fav movies:")
# mov1 = input()
# mov2 = input()
# mov3 = input()
# List = [mov1, mov2, mov3]
# print(List)

# #OR
# movies = []
# mov = input("enter 1st movie:")
# movies.append(mov)
# mov = input("enter 2nd movie:")
# movies.append(mov)
# mov = input("enter 3rd movie:")
# movies.append(mov)
# print(movies)

# #OR
# movies = []
# movies.append(input("enter 1st movie: "))
# movies.append(input("enter 2nd movie: "))
# movies.append(input("enter 3rd movie: "))


"""Palindrome List"""
# print("Enter 4 elements for list:")
# elements = [input(), input(), input(), input()]
# new = elements[::-1]
# print(elements)
# print(new)
# if elements == new:
#     print("palindrome")
# else:
#     print("not a palindrome")


# # OR
# elements = [1,2,1]
# copy = elements.copy()
# copy.reverse()
# if elements == copy:
#     print("palindrome")
# else:
#     print("not a palindrome")
