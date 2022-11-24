<h1>Bucket Sort</h1>
<p>Bucket sort or bin sort is a sorting algorithm that works by distributing the elements into a number of buckets, homogenously. 
Each bucket is then sorted individually. In order to sort the bucket, we use the sort() method of the Arrays class. 
It is usually used to sort floating-point numbers.</p>
<br>
The basic idea to perform the bucket sort is:
<ul><li>
Partition the range into a fixed number of buckets.
</li><li>Toss each element into its appropriate bucket.
</li><li>Sort each bucket individually using insertion sort.
</li><li>Concatenate all the sorted buckets.</li></ul>
<h3>Pros</h3>
<ul><li>It is asymptotically fast because of uniform distribution.
</li><li>It reduces the number of comparisons.
</li><li>It is fast in comparison to bubble sort.</li></ul>
<h3>Cons</h3>
<ul><li>It is not an in-place sorting because we need some extra space to sort the buckets.
</li><li>It may or may not be the stable sorting algorithm.
</li><li>It is not useful if we have large array because it increases the cost.</li></ul>
<h3>Algorithm</h3>
<b>Bucket Sort(A[])
</b><ul><li>
Let B[0….n-1] be a new array</li><li>
n=length[A]</li><li>
for i=0 to n-1</li><li>
make B[i] an empty list</li><li>
for i=1 to n</li><li>
do insert A[i] into list B[n a[i]]</li><li>
for i=0 to n-1</li><li>
do sort list B[i] with insertion-sort</li><li>
Concatenate lists B[0], B[1],..……, B[n-1] together in order</li></ul>
