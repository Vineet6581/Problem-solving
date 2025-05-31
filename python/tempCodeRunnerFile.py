def binary_search(arr,x,low,high):
    while low<=high:
        mid=low+(high-low)//2
        if x==arr[mid]:
            return mid
        elif x>arr[mid]:
            low=mid+1
        else:
            high=mid-1
        return -1
    arr=[3,4,5,6,7,8,9]
    x=4
    result=binary_search(arr,x,0,len(arr)-1)
    if result != -1:
        print("element is present at index"+str(result))
    else:
        print("not found") 