class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        freq_map = defaultdict(list)
        for s in strs:
            frequency = [0]*26
            for j in s:
                frequency[ord(j)-ord('a')] += 1
            freq_map[tuple(frequency)].append(s)

        return list(freq_map.values())