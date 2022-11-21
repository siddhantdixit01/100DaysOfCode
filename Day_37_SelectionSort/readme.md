<h1>Selection Sort Algorithm</h1>
<p>The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from the unsorted part and putting it at the beginning. 
</p>
<p>The algorithm maintains two subarrays in a given array.
<ul>
<li>The subarray which already sorted. 
</li><li>The remaining subarray was unsorted.</li></ul>
</p><p>In every iteration of the selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. </p>
<p>Follow the below steps to solve the problem:

<ul><li>Initialize minimum value(min_idx) to location 0.
</li><li>Traverse the array to find the minimum element in the array.
</li><li>While traversing if any element smaller than min_idx is found then swap both the values.
</li><li>Then, increment min_idx to point to the next element.</li><li>
Repeat until the array is sorted.</li></ul></p>
