<h1>Implement a stack using singly linked list</h1>
To implement a stack using the singly linked list concept, all the singly linked list operations should be performed based on Stack operations LIFO(last in first out) and with the help of that knowledge, we are going to implement a stack using a singly linked list. 

So we need to follow a simple rule in the implementation of a stack which is last in first out and all the operations can be performed with the help of a top variable. Let us learn how to perform Pop, Push, Peek, and Display operations.



In the stack Implementation, a stack contains a top pointer. which is the “head” of the stack where pushing and popping items happens at the head of the list. The first node has a null in the link field and second node-link has the first node address in the link field and so on and the last node address is in the “top” pointer.


The main advantage of using a linked list over arrays is that it is possible to implement a stack that can shrink or grow as much as needed. Using an array will put a restriction on the maximum capacity of the array which can lead to stack overflow. Here each new node will be dynamically allocated. so overflow is not possible.

<h3>Stack Operations: </h3>
<ul><li>push(): Insert a new element into the stack i.e just insert a new element at the beginning of the linked list.
<li>pop(): Return the top element of the Stack i.e simply delete the first element from the linked list.
<li>peek(): Return the top element.
<li>display(): Print all elements in Stack.</ul>
  <h4>Push Operation:</h4>
<ul><li>Initialise a node
<li>Update the value of that node by data i.e. node->data = data
<li>Now link this node to the top of the linked list
  <li>And update top pointer to the current node</ul>
  <h4>Pop Operation:</h1>
<ul><li>First Check whether there is any node present in the linked list or not, if not then return
<li>Otherwise make pointer let say temp to the top node and move forward the top node by 1 step
  <li>Now free this temp node</ul>
<h4>Peek Operation:</h4>
<ul>
<li>Check if there is any node present or not, if not then return.
<li>Otherwise return the value of top node of the linked list
</ul><h4>Display Operation:
</h4><ul><li>Take a temp node and initialize it with top pointer 
<li>Now start traversing temp till it encounters NULL
<li>Simultaneously print the value of the temp node
