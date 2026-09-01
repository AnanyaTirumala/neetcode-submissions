# class Solution:

#     def encode(self, strs: List[str]) -> str:
#         encoded = ""
#         for s in strs: 
#             encoded = encoded + str(len(s)) + "#" + s
#         print(encoded)
#         return encoded

#     def decode(self, s: str) -> List[str]:
#         decoded = []
#         i=0
#         while i < len(s):
#             j=i
#             while s[j] != '#':
#                 j+=1
#             length = int(s[i:j])
#             decoded.append(s[j+1:j+length+1])
#             i = i+j+length+1
#         return decoded
        

class Solution:

    def encode(self, strs: List[str]) -> str:
        res = []
        for s in strs:
            res.append(str(len(s)))
            res.append("#")
            res.append(s)
        return "".join(res)

    def decode(self, s: str) -> List[str]:
        res = []
        i = 0

        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1
            length = int(s[i:j])
            i = j + 1
            j = i + length
            res.append(s[i:j])
            i = j

        return res