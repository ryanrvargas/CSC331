class Stack:  
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if len(self.items) == 0:
            return None
        return self.items.pop()
    
    def peek(self):
        if len(self.items) == 0:
            return None
        return self.items[-1]
    
    def is_empty(self):
        if len(self.items) == 0:
            return True
        return False
    
    def size(self):
        return len(self.items)