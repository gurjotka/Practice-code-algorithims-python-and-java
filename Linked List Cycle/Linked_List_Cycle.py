class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def hasCycle(self, head) -> bool:
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True
        return False

def create_linked_list(values, pos):
    if not values:
        return None
    head = ListNode(values[0])
    current = head
    cycle_node = None

    if pos == 0:
        cycle_node = head

    for i in range(1, len(values)):
        current.next = ListNode(values[i])
        current = current.next

        if i == pos:
            cycle_node = current

    if pos != -1:
        current.next = cycle_node

    return head

def main():
    values = [3, 4, 0, -4]
    pos = 1
    head = create_linked_list(values, pos)
    sol = Solution()
    print(sol.hasCycle(head))

    values2 = [1,2]
    pos2 = 0
    head2 = create_linked_list(values2, pos2)
    print(sol.hasCycle(head2))

    values3 = [1]
    pos3 = -1
    head3 = create_linked_list(values3, pos3)
    print(sol.hasCycle(head3))

if __name__ == "__main__":
    main()
