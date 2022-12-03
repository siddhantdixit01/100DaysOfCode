Queue

A queue is data structure that is based on first-in first-out (FIFO) in which the first item input is also the first item removed.
Items are added to the end of the line and removed from the beginning.
When utilising an array to construct a queue, the fact that an array has a fixed size once declared poses an issue in the queue implementation. When elements are added to a queue and then deleted, a gap is created. To fill the gap, we can rearrange the remaining components to fill the space, but it is a time-consuming procedure.
Queue Operations

For a Queue-based system these three operations are used:

Enqueue: To add an item at the back / rear end of the queue.
Dequeue: To delete an item from the front of the queue.
peek: Get a value from the front of the queue without having to remove it.