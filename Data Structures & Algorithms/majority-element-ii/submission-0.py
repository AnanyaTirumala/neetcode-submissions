class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        frequency = defaultdict()
        threshold = len(nums)//3
        output = set()

        for i in nums:
            frequency[i] = frequency.get(i, 0) + 1
            if frequency.get(i) > threshold:
                output.add(i)
            
        return list(output)

        