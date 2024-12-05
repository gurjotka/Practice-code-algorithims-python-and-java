class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node

    def remove_duplicates(self):
        if not self.head:
            return

        # Step 1: Count frequencies of each value
        frequency = {}
        current = self.head
        while current:
            frequency[current.data] = frequency.get(current.data, 0) + 1
            current = current.next

        # Step 2: Rebuild the list, skipping values with frequency > 1
        dummy = Node(0)  # Temporary dummy node to simplify edge cases
        dummy.next = self.head
        prev = dummy
        current = self.head

        while current:
            if frequency[current.data] > 1:  # Skip nodes with duplicates
                prev.next = current.next
            else:
                prev = current
            current = current.next

        self.head = dummy.next  # Update head to skip any duplicates at the start

    def display(self):
        current = self.head
        while current:
            print(current.data, end="->")
            current = current.next
        print("None")

ll = LinkedList()
ll.append(10)
ll.append(20)
ll.append(10)
ll.append(30)
ll.append(20)

ll.display()
ll.remove_duplicates()
ll.display()

