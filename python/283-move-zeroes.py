def movezeroes(array):
    for i in array:
        if i == 0:
            array.remove(i)
            array.append(i)
    return array

nums = [0, 1, 0, 3, 12, 1, 3, 5, 0, 0, 1, 0, 7, 8, 3, 5, 2, 0,]
print(nums)
result = movezeroes(nums)
print(result)