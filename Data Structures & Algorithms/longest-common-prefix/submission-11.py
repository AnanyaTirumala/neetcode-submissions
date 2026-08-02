class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        commonPrefix = strs[0]
        if len(strs)>=2:
            lengthPrefix = len(strs[1])
            for i in range(1, len(strs)):
                for j in range(0, lengthPrefix):
                    print(j)
                    print(len(commonPrefix))
                    if j >= len(commonPrefix):
                        break
                    if j >= len(strs[i]):
                        lengthPrefix = j;
                        break
                    if commonPrefix[j] != strs[i][j]:
                        lengthPrefix = j
                        break

            return commonPrefix[0:lengthPrefix]
        else:
            return strs[0]