def binary_search(array,x,low,high):
    while low<=high:
        mid=low+(high-low)//2
        if x==array[mid]:
            return mid
        elif x>array[mid]:
            low=mid+1
        else:
            high=mid-1
    return -1
array=[3,4,5,6,7,8,9]
x=4
result=binary_search(array,x,0,len(array)-1)
if result != -1:
        print("element is present at index: "+str(result))
else:
        print("not found")  
      