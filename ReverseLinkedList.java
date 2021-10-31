//time complexity: O(n)
//space complexity: O(n) because of stack frames

static Node reverseNodes(Node node){
  if(node == null || node.next == null)
    return node;
  Node reversed = reverseNodes(node.next);
  node.next.next = node;
  node.next = null;
  return reversed;
}

static void reverseList(LinkedList list){
  list.head = reverseNodes(list.head);
}
