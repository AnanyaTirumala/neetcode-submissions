class MyHashSet:

    def __init__(self):
        self.myHashSet = []

    def add(self, key: int) -> None:
        if(self.contains(key) is False):
            self.myHashSet.append(key)
        else:
            print("ERROR: Already contains key")

    def remove(self, key: int) -> None:
        if self.contains(key):
            self.myHashSet.remove(key)
        else:
            print("ERROR: Key does not exist")

    def contains(self, key: int) -> bool:
        for i in self.myHashSet:
            if i==key:
                return True
        return False


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)