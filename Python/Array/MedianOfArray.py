def findMedianSortedArrays(nums1, nums2):
    if len(nums1) > len(nums2):
        return findMedianSortedArrays(nums2, nums1)
    x = len(nums1)
    y = len(nums2)
    low = 0
    high = x
    while low <= high:
        partitionX = (low + high) // 2
        partitionY = (x+y+1)//2 - partitionX
        maxLeftX = float("-inf") if partitionX == 0 else nums1[partitionX-1]
        maxLeftY = float("-inf") if partitionY == 0 else nums2[partitionY-1]
        minRightX = float("inf") if partitionX == x else nums1[partitionX]
        minRightY = float("inf") if partitionY == y else nums2[partitionY]

        if maxLeftX <= minRightY and maxLeftY <= minRightX:
            if (x+y)%2 == 0:
                return (max(maxLeftX,maxLeftY) + min(minRightX,minRightY)) / 2.0
            else:
                return float(max(maxLeftX,maxLeftY))
        elif maxLeftX > minRightY:
            high = partitionX-1
        else:
            low = partitionX+1

print(findMedianSortedArrays([1,3],[2]))
print(findMedianSortedArrays([1,2],[3,4]))
print(findMedianSortedArrays([0,0],[0,0]))
print(findMedianSortedArrays([],[2]))
