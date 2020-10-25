def threeSum(nums):
    if not nums:
        return []
    res = []
    n = len(nums)
    nums = sorted(nums)
    for i in range(len(nums)-2):
        if i > 0 and nums[i] == nums[i-1]:
            continue
        j = i+1
        k = n-1
        new_target = -nums[i]
        while j < k:
            summ = nums[j] + nums[k]
            if summ < new_target:
                j += 1
            elif summ > new_target:
                k -= 1
            else:
                res.append([nums[i], nums[j], nums[k]])
                while j < k and nums[j+1] == nums[j]:
                    j += 1
                j += 1
                while k > j and nums[k-1] == nums[k]:
                    k -= 1
                k -= 1
    return res

print(threeSum([-1,0,1,2,-1,-4]))
print(threeSum([0]))
