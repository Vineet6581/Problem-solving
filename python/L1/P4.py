"""DICTIONARY & SET"""

# info = {
#     "key" : "value",
#     "name" : "vineet",
#     "learning" : "coding",
#     "age" : 20,
#     "is_adult": True,
#     "marks" : 83.2,
#     "subjects" : ["python", "UHV", "DS", "DE", "DSTL", "COA"],
#     "today's topic" : ("dict","set")
# }
# info["surname"] = "chaudhary"
# print(info)
# print(type(info)) #can store any datatype
# print(info["name"])



"""nested dictionary"""
# student = {
#     "name" : "vineet",
#     "subjects" : {
#         "phy" :97,
#         "chem" : 98,
#         "math" : 95
#     }
# }
# print(student["subjects"]["chem"])




"""Dictionary Methods """
# myDict = {
#     "key" : "value",
#     "name" : "vineet",
#     "learning" : "coding",
#     "age" : 20,
#     "is_adult": True,
#     "marks" : 83.2,
#     "subjects" : ["python", "UHV", "DS", "DE", "DSTL", "COA"],
#     "today's topic" : ("dict","set")
# }
# myDict.keys() #return all key
# myDict.values() #returns all values
# myDict.items() #return all (key, val) pairs as tuples
# myDict.get("key") #return the key according to value
# #myDict.update(newDict) #insett the specified items to the dictionary
# print(list(myDict.keys()))
# print("\n")
# print(list(myDict.values()))
# print("\n")
# print(myDict.items())
# print("\n")
# print(myDict.get("name"))
# print("\n")
# print(myDict.get("name2"))
# print("\n")
# myDict.update({"city":"Agra"})
# print(myDict)




"""SET in PYTHON"""
# collection = {1,2,2,2,"hello","world"}
# print(collection)
# print(len(collection))
# empty_set = set()
# print(type(empty_set))
# empty_dict = {}
# print(type(empty_dict))


"""SET METHODS"""
# collection = set()

# collection.add(1)
# collection.add(2)
# collection.add(2)
# collection.add(3)
# print(collection)

# collection.remove(3)
# print(collection)

# collection.pop()
# print(collection)

# collection.clear()
# print(collection)
# print(len(collection))


# set1 = {1,2,3}
# set2 = {3,4,5}
# print(set1.union(set2))
# print(set.intersection(set2))





"""store words in dictionary"""
# info = {
#     "table" : ["a piece of furniture", "list of facts & figures"],
#     "cat" : "a small animal"
# }
# print(info)



""" you have given a list of subjects for students. Assume one classroom is
    required for 1 subject.How many classrooms are needed by all students."""
# subjects = {"python", "java", "C++", "python", "javascript", "java", "python", "java", "C++", "C"}
# print(subjects)
# print("required classrooms",len(subjects))



""" WAP to enter marks of 3 subjects from the user and store them in a 
    dictionary.Start with an empty dictionary & add one by one.Use subject
    name as key & marks as value."""
marks = {}
x = int(input("enter phy : "))
marks.update({"phy" : x})
x = int(input("enter math : "))
marks.update({"math" : x})
x = int(input("enter chem : "))
marks.update({"chem" : x})
print(marks)


