<h1>Merge Sort Algorithm</h1>
<p>The Merge Sort algorithm is a sorting algorithm that is based on the Divide and Conquer paradigm. 
In this algorithm, the array is initially divided into two equal halves and then they are combined in a sorted manner.
</p>
<h3>Merge Sort Working Process:
</h3><p>Think of it as a recursive algorithm continuously splits the array in half until it cannot be further divided. 
This means that if the array becomes empty or has only one element left, the dividing will stop, i.e. it is the base case to stop the recursion. 
  If the array has multiple elements, split the array into halves and recursively invoke the merge sort on each of the halves.
  Finally, when both halves are sorted, the merge operation is applied.
  Merge operation is the process of taking two smaller sorted arrays and combining them to eventually make a larger one.</p>
  
 <h3>Algorithm:</h3>
<div><b>step 1:</b> start<br>
<b>step 2:</b> declare array and left, right, mid variable<br>
<b>step 3:</b> perform merge function.<br>
    if left > right<br>
        return<br>
    mid= (left+right)/2<br>
    mergesort(array, left, mid)<br>
    mergesort(array, mid+1, right)<br>
    merge(array, left, mid, right)<br>
<b>step 4:</b> Stop
</div><br>
<p>Follow the steps below to solve the problem:
<br>
MergeSort(arr[], l,  r)<br>
If r > l
<span>
<ul><li>Find the middle point to divide the array into two halves: <br>
  <ul><li>middle m = l + (r – l)/2<br><br>
</li></ul></li><li>Call mergeSort for first half:  <br> 
  <ul><li>Call mergeSort(arr, l, m)<br><br>
</li></ul></li><li>Call mergeSort for second half:<br>
  <ul><li>Call mergeSort(arr, m + 1, r)<br><br>
</li></ul></li><li>Merge the two halves sorted in steps 2 and 3:<br>
  <ul><li>Call merge(arr, l, m, r)</span>
