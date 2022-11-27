<h1>Doubly Linked List</h1>
A Doubly Linked List (DLL) contains an extra pointer, typically called the previous pointer, 
together with the next pointer and data which are there in the singly linked list.
<h3>Advantages of DLL over the singly linked list:</h3>
<ul><li>A DLL can be traversed in both forward and backward directions. </li><li>
The delete operation in DLL is more efficient if a pointer to the node to be deleted is given. </li><li>
We can quickly insert a new node before a given node. </li><li>
In a singly linked list, to delete a node, a pointer to the previous node is needed.
  To get this previous node, sometimes the list is traversed. In DLL, we can get the previous node using the previous pointer. </li></ul>
<h3>Disadvantages of DLL over the singly linked list:</h3>
<ul><li>Every node of DLL Requires extra space for a previous pointer. It is possible to implement DLL with a single pointer though. </li><li>
All operations require an extra pointer previous to be maintained. 
  For example, in insertion, we need to modify previous pointers together with the next pointers. 
  For example in the following functions for insertions at different positions, we need 1 or 2 extra steps to set the previous pointer.</li></ul>
