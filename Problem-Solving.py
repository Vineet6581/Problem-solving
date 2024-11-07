n = int(input("Enter the number of elements: "))
arr = []
for i in range(n):
    element = int(input(f"Enter element {i + 1}: "))
    arr.append(element)
even_numbers = [x for x in arr if x % 2 == 0]
odd_numbers = [x for x in arr if x % 2 != 0]
even_numbers.sort(reverse=True)
odd_numbers.sort()
print("Even numbers in descending order:", even_numbers)
print("Odd numbers in ascending order:", odd_numbers)
