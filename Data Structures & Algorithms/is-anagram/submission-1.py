class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sdict = {}
        tdict = {}
        for i in s:
            if i not in sdict:
                sdict[i]=0
            sdict[i] = sdict.get(i)+1

        for j in t:
            if j not in tdict:
                tdict[j]=0
            tdict[j] = tdict.get(j)+1

        if(tdict==sdict):
            return True
        else: 
            return False