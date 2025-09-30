class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def print_list(self):
        current = self.head
        while current:
            print(current.data, end="->")
            current = current.next
        print("None")

    def insert_at_end(self, data):
        new_node = Node(data)
        current = self.head
        if current is None:
            self.head = new_node
        else:
            while current.next != None:
                current = current.next
            current.next = new_node

    def insert_at_front(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node
        
    def delete(data):
        