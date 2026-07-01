class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sdict = {}
        tdict = {}
        for i in s:
            sdict[i] = 1 + sdict.get(i, 0)

        for j in t:
            tdict[j] = 1 + tdict.get(j, 0)

        if(tdict==sdict):
            return True
        else: 
            return False