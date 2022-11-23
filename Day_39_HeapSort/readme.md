<h1>Heap Sort</h1>
Heap sort is a comparison-based sorting technique based on Binary Heap data structure. 
It is similar to the selection sort where we first find the minimum element and place the minimum element at the beginning. 
Repeat the same process for the remaining elements.

<h3>Advantages of heapsort:</h3>
<h4>Efficiency –</h4>  The time required to perform Heap sort increases logarithmically while other algorithms may grow exponentially slower as the number of items to sort increases. This sorting algorithm is very efficient.
<h4>Memory Usage –</h4> Memory usage is minimal because apart from what is necessary to hold the initial list of items to be sorted, it needs no additional memory space to work
<h4>Simplicity –</h4>  It is simpler to understand than other equally efficient sorting algorithms because it does not use advanced computer science concepts such as recursion
<h3>Applications of HeapSort:</h3>
<ul><li>Heapsort is mainly used in hybrid algorithms like the IntroSort.
</li><li>Sort a nearly sorted (or K sorted) array 
</li><li>k largest(or smallest) elements in an array </li></ul>
<h3>Heap Sort Algorithm</h3>
To solve the problem follow the below idea:

 First convert the array into heap data structure using heapify, than one by one delete the root node of the Max-heap and replace it with the last node in the heap and then heapify the root of the heap. Repeat this process until size of heap is greater than 1.

Follow the given steps to solve the problem:

<ul><li>Build a max heap from the input data. </li>
<li>At this point, the maximum element is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of the heap by 1. Finally, heapify the root of the tree. 
  </li><li>Repeat step 2 while the size of the heap is greater than 1.</li></ul>
<b>Note:</b> The heapify procedure can only be applied to a node if its children nodes are heapified. So the heapification must be performed in the bottom-up order.
