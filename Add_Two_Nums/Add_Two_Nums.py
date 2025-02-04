class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = None


class Solution:
    def addTwoNumbers(self, l1:ListNode, l2:ListNode) -> ListNode:
        dummyHead = ListNode(0)
        current = dummyHead
        carry = 0

        while l1 or l2 or carry:
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0
            total = v1 + v2 + carry
            carry = total // 10
            current.next = ListNode(total % 10)
            current = current.next

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return dummyHead.next


def create_linked_list(numbers):
    dummy = ListNode(0)
    current = dummy
    for num in numbers:
        current.next = ListNode(num)
        current = current.next

    return dummy.next


def print_linked_list(node):
    values = []
    while node:
        values.append(node.val)
        node= node.next
    print(values)


if __name__ == "__main__":

    l1 = create_linked_list([3,6,7])
    l2 = create_linked_list([4,2,1])

    solution = Solution()
    result = solution.addTwoNumbers(l1, l2)

    print_linked_list(result)
