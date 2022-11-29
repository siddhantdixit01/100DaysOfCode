<h1>Circular Doubly Linked List In Java</h1>
A circular doubly linked list is one of the complex structures. 
In this list, the last node of the doubly linked list contains the address of the first node and the first node contains the address of the last node. 
Thus in a circular doubly linked list, there is a cycle and none of the node pointers are set to null.
Circular doubly linked lists have wide applications in the software industry. One such application is the musical app which has a playlist. In the playlist, when you finish playing all the songs, then at the end of the last song, you go back to the first song automatically. This is done using circular lists.

<h3>Advantages of a Circular Double Linked List:</h3>
<ul><li>
The circular doubly linked list can be traversed from head to tail or tail to head.<li>
Going from head to tail or tail to head is efficient and takes only constant time O(1).<li>
It can be used for implementing advanced data structures including Fibonacci heap.</ul>
<h3>Disadvantages:</h3>
<ul><li>
As each node needs to make space for the previous pointer, extra memory is required.<li>
We need to deal with lots of pointers while performing operations on a circular doubly linked list. 
  If pointers are not handled properly, then the implementation may break.</ul>
