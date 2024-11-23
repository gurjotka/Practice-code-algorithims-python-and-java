class Solution:
    def addBinary(self, a: str, b: str) -> str:
        res = ""
        i = len(a) - 1
        j = len(b) - 1
        carry = 0
        while i >= 0 or j >= 0:
            sum = carry
            if i >= 0 : 
                sum += ord(a[i]) - ord('0') 
            if j >= 0 :
                sum += ord(b[j]) - ord('0')
            i = i - 1
            j = j - 1
            carry = 1 if sum > 1 else 0
            res += str(sum % 2)

        if carry != 0 : res += str(carry);
        return res[::-1]





sol = Solution()
print(sol.addBinary("11", "1"))
print(sol.addBinary("1010", "1011"))