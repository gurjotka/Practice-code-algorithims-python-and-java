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

        seen = set()
        current = self.head
        prev = None
        while current:
            if current.data in seen:
                prev.next = current.next
            else:
                seen.add(current.data)
                prev = current
            current = current.next

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

