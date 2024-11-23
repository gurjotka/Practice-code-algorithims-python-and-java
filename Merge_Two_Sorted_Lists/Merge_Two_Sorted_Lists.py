class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def merged_list(self, list1, list2):
        head = ListNode(0)
        current = head

        while list1 and list2:
            if list1.val <= list2.val:
                current.next = list1
                list1 = list1.next

            else:
                current.next = list2
                list2 = list2.next
            current = current.next

        if list1:
            current.next = list1
        if list2:
            current.next = list2

        return head.next

def to_linked_list(lst):
    head = ListNode(lst[0])
    current = head
    for val in lst[1:]:
        current.next = ListNode(val)
        current = current.next
    return head

def to_list(node):
    result = []
    while node:
        result.append(node.val)
        node = node.next
    return result

sol = Solution()
merged = sol.merged_list(to_linked_list([1,2,3]),to_linked_list([2,3,4]))
print(to_list(merged))