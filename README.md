# Data Structures And Leetcode A-Z
This repository will provide everything you need to master Datastructures and algorithm and the most common leetcode questions. 
<p align="center">
<img src="https://skillsdynamix.com/wp-content/uploads/2020/06/Data-Structures-and-Algorithms.jpg">
</p>

## Table of Content
* [Complexity Analysis](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#complexity-analysis)
* [Memory](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#memory)
* [Big O Notation](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#big-o-notation)
* [Logarithm](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#logarithm)
* [Arrays](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#arrays)
* [Linked List](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#linked-list)
* [Hash Tables](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#hash-tables)
* [Stacks and Queues](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#stacks-and-queues)
* [Strings](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#strings)
* [Graphs](https://github.com/GivralNguyen/Data-Structures-And-Leetcode-A-Z/blob/main/README.md#graphs)
## Complexity Analysis
* Complexity analysis
	* The process of determining how efficient an algorithm is. Comlexity analysis usually involves finding both the time and space complexity of an algorithm
	* Complexity analysis if effectively used to determine how "good" an algorithm is and whether it's "better" than another one. 
* Time Complexity 
	* A measure of how fast an algorithm runs, time complexity is a central concept in the field of algorithms and in coding interviews. It's expressed using **Big O** notation. 
* Space Complexity 
	* A measure of how much auxiliary memory an algorithm takes up, space complexity is a central concept in the field of algorithms and in coding interviews.
	*  It's expressed using **Big O** notation. 
<p align="center">
<img src="https://pbs.twimg.com/media/CRW23IcWEAAgpdd.png">
</p>

## Memory 
<p align="center">
<img src="https://beginnersbook.com/wp-content/uploads/2018/10/array.jpg">
</p>

* Bit
	* Short for <b>binary digit</b> , a bit is a fundamental unit of information in Computer Science that represents a state with one of two values, typically <b>0</b>  and <b>1</b>.
	* Any data stored in a computer is, at the most basic level, represented in bits.
* Byte
	* A group of eight <b>bits</b>. For example, <b>01101000</b>  is a byte.
	* A single byte can represent up to <b>256</b>  data values (<b>2<sup>8</sup></b>).
	* Since a <b>binary number</b> is a number expressed with only two symbols, like 
  <b>0</b> and <b>1</b> , a byte can effectively represent all of the numbers
  between 0 and 255, inclusive, in binary format.
	 * The following bytes represent the numbers 1, 2, 3, and 4 in binary format.
		>
		>1: 00000000 
		>2: 00000000 
		>3 :00000000
		>4 :00000001
		>
* Fixed-Width Integer
	* An integer represented by a fixed amount of <b>bits</b> . For example, a <b>32-bit integer</b>  is an integer represented by 32 bits (4 bytes), and a <b>64-bit integer</b>  is an integer represented by 64 bits (8 bytes).
	>   00000000 00000000 00000000 00000001
    >
	 * The following is the 64-bit representation of the number 10, with clearly
  separated bytes:
  > 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00001010
  > 
  * Regardless of how large an integer is, its fixed-width-integer representation
  is, by definition, made up of a constant number of bits.
  * It follows that, regardless of how large an integer is, an operation performed
  on its fixed-width-integer representation consists of a constant number of bit
  manipulations, since the integer is made up of a fixed number of bits.
 * Memory
	 * Broadly speaking, memory is the foundational layer of computing, where all
  data is stored.
		  * In the context of coding interviews, it's important to note the following
  points:
			  * Data stored in memory is stored in bytes and, by extension, bits.
			  * Bytes in memory can "point" to other bytes in memory, so as to store
    references to other data.
			  * The amount of memory that a machine has is bounded, making it valuable to limit how much memory an algorithm takes up.
			   * Accessing a byte or a fixed number of bytes (like 4 bytes or 8 bytes in the
    case of <b>32-bit</b> and <b>64-bit integers</b> ) is an elementary
    operation, which can be loosely treated as a single unit of operational
    work.
 ## Big O Notation
 <p align="center">
<img src="https://res.cloudinary.com/practicaldev/image/fetch/s--ark_FZG1--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://thepracticaldev.s3.amazonaws.com/i/1omv0tmikzeaj24z8ps2.jpeg">
</p>

 * The notation used to describe the <b>time complexity</b> and <b>space complexity</b>  of algorithms. 
 * Variables used in Big O notation denote the sizes of inputs to algorithms. For example, <b>O(n)</b>  might be the time complexity of an algorithm that traverses through an array of length <b>n</b> ; similarly, <b>O(n + m)</b>  might be the time complexity of an algorithm that traverses through an array of length <b>n</b>  and through a string of length <b>m</b>.
 * The following are examples of common complexities and their Big O notations,
  ordered from fastest to slowest:
	  * Constant: O(1)
	  * Logarithmic : O(log(n))
	  * Linear: O(n)
	  * Log-Linear : O(nlog(n))
	  * Quadratic: O(n^2)
	  * Cubic : O(N^3)
	  * Exponential: O(2^n)
	  * Factorial: O(n!) 
* Note that in the context of coding interviews, Big O notation is usually
  understood to describe the <b>worst-case</b> complexity of an algorithm, even though the worst-case complexity might differ from the <b>average-case</b> complexity. 
 * For example, some sorting algorithms have different time complexities depending on the layout of elements in their input array. In rare cases, their time complexity will be much worse than in more common cases. Similarly, an algorithm that takes in a string and performs special operations on uppercase characters might have a different time complexity when run on an input string of only uppercase characters vs. on an input string with just a few uppercase characters.
 * Thus, when describing the time complexity of the algorithm can be divided into <b>average case</b> and the <b>worst case</b>.
 ## Logarithm 
  <p align="center">
<img src="https://slideplayer.com/slide/12487487/74/images/9/Logarithms+and+Exponents.jpg">
</p>

 * A mathematical concept that's widely used in Computer Science and that's defined by the following equation:
 * log<sub>b</sub>(x) = y  if and only if  b<sup>y</sup> = x
 * In the context of coding interviews, the logarithm is used to describe the complexity analysis of algorithms, and its usage always implies logarithm of base 2. 
 * log(n) = y  if and only if  2<sup>y</sup> = n
 * I plain English, if an algorithm has a logarithmic time complexity (O(log(n)), where n is the size of the input, then whenever the algorithm's input size ( when n doubles), the number of operations needed to complete the algorithm only increases by one unit. Conversely, an algorithm with a linear time complxity would see its number of operations double if its input size doubled. 
 * As an example. a linear time complexity algorithm with an input size of 1000 might take roughly 1000 operations to complete, whereas a logarithmic time complexity algorithmwith the same input would take roughly 10 operations to complete, since 2^10 = 1000.
  ## Arrays 
 <p align="center">
<img src="data:image/png;base64,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">
</p>

  * A linear collection of data values that are accessible at numbered indices, starting at index 0. The following are an array's standard operations and their corresponding time complexities.
	  * Accessing value at a given index: O(1)
	  * Updating a value at a given index: O(1)
	  * Inserting a value at the beginning : O(n)
	  * Inserting a value in the middle: O(n) 
	  * Inserting a value at the end: dynamic array : armotized O(1), static array : O(n)
	  * Removing a value at the beginning : O(n)
	  * Removing a value in the middle : O(n)
	  * Removing a value at the end: O(1)
	  * Copying the array: O(n)
* A static array is an implementation of an array that allocates a fixed amount of memory to be used for storing the array's values. Appending values to the array therefore involves copying the entire array and allocating new memory for it, accounting for the extra space needed for the newly appended value. This is a linear-time operation. 
* A dynamic array is an implementation of an array that preemptively allocates double the amount of memory needed to store the array's values. Appending values to the array is a constant time operation until the allocated memory is filled up, at which point the array is copied and double the memory is once again allocated for it. This implementation leads to an amortized constant-time insertion at end operation. 
 ## Linked List
<p align="center">
<img src="https://static.javatpoint.com/ds/images/singly-linked-list-vs-doubly-linked-list.png">
</p>

 * Singly Linked List
	 * A data structure that consists of nodes, each with some value and a pointer to the next node in the linked list. A linked list  pronode's value and next node are typically stored in "value" and "next" properties, respectively.
	 * The first node in a linked list is referred to as the head of the linked list, while the last node in a linked list, whose next property points to the null cale, is known as the tail of the linked list. 
	 * Below is a visual representation of a singly linked lst whose nodes hold interger values: 
	 > 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> null 
	 >
	 * A singly linked list typicall exposes its head to its user for easy access. While finding a node in asingly linked list involves traversing through all of the nodes leading up to the node in question ( as opposed to instant access with an array), adding or removing nodes simply involves overwriting "next" pointers (assuming that you have access to the node right before the node that you're adding or removing).
	 * The following are a a singly linked list's standard operations and their corresponding time complexities:
		 * Accessing the head: O(1)
		 * Accessing the tail: O(n)
		 * Accessing the middle node: O(n)
		 * Inserting/ Removing the head: O(1)
		 * Inserting/ Removing the tail: O(n) to access + O(1)
		 * Inserting/Removing a middle note: O(n) to access + O(1)
		 * Searching for a value: O(n) 
  * Doubly linked list
	  * Similar to a singly linked list, except that each node in a doubly linked list also has a pointer to the previous node in the linked list. The previous node is typically stored in "prev " property. 
	  * Just as the "next" property of a doubly linked list's tail points to the null value, so too does the prev property of a doubly linked list's head.
	  > null <- 0 <-> 1 <-> 2 <->3 <->4 <->5 -> null
	  >
	  * While a doubly linked list typically exposes both it's head and tail to it's user, as opposed to just it's head in the case of a singly linked list, it otherwise behaves very similarly to a singly linked list. 
	  * The following are a doubly linked list's standard operations and their corresponding complexities: 
		  * Accessing the head: O(1)
		  * Accessing the tail : O(1)
		  * Accessing a middle node: O(n)
		  * Inserting / Removing the head: O(1)
		  * Inserting/ Removing the tail: O(1)
		  * Inserting/ Removing a middle node: O(n) to access + O(1)
		  * Searching for a value : O(n)
* Circular linked list 
	* A linked list that has no clear head or tail, because its  "tail" points to its "head", effectively forming a closed circle. 
	* A circular linked list can be either a singly circular linked list or a doubly circular linked list. 
 ## Hash Tables 
<p align="center">
<img src="https://miro.medium.com/max/1400/1*l9eCykFTYwvLZgy62id5Ag.png">
</p>

  * Hash Table.
	  * A data structure taht provides fast insertion, deletion, and lookup of key/value pairs.
	  * Under the hood, a hash table uses a dynamic array of linked lists to efficiently store key/value pairs. When inserting a key/value pairs. When inserting a key/value pair, a hash fucntion first maps the key, which is typically a string (or any data that can be hashed , depending on the implementation of the hash table), to an integer value and by extension, to an index in the underlying dynamic array. Then, the valuse associated with the key is added to the linked list stored at that index int he dynamic array , and a reference to the key is also stored with the value. 
	  * Hash tables rely on highly optimized hash functions to minimize the number of collisions that occur when storing values: cases where two keys map to the same index. 
	  * Below is the example of what a hash table might look like under the hood: 
		  >[
		  0: (value1, key1) -> null
		  1: (value2, key2) -> (value3, key3) -> (value4, key4)
		  2: (value5, key5) -> null
		  3: (value6, key6) -> null
		  4: null
		  5: (value7, key7) -> (value8, key8)
		  6: (value9, key9) -> null
			]
		  > 
	* In the hash table above, the keys key2, key3 and key4 collided by all being hashed to 1, and the keys key7 and key8 collided by both being hashed to 5.
	* The following are a hash table's standard opreations and their corresponding time complexities. 
		* Inserting a key/value pair: O(1) on average, O(n) in the worse case. 
		* removing a key/value pair: O(1) on average, O(n) in the worse case
		* Looking up a key: O(1) on average, O(n) in the worse case
	* The worst-case linear-time operations occur when a hash table experiences a lot of collisions, leading to long linked lists internall, which take O(n) time to traverse.
	* However, in practive and especially in coding interviews, we typically assume that the hash functions employed by hash tables are so optimized that collisions are extremely rare and constant-time operations are all but guaranteed.
	* 
  ## Stack and Queues
<p align="center">
<img src="https://miro.medium.com/max/1000/0*-y92CX3NIm9SkYSx.png">
</p>

  * Stack 
	  * An array-like data structure whose elements follow the LIFO rule: Last In, First Out.
	  * A stack is often compared to a stack of books on the table: the last book that's placed on the stack of books is the first one that's taken off the stack .
	  * The following are a stack's standarad operations and their corresponding time complexities. 
		  * Pushing an element onto the stack: O(1)
		  * Popping an element off the stack: O(1)
		  * Peeking at the element of the top of the stack : O(1) 
		  * Searching for an element int he stack: O(n)
	* A stack is typically implemented with a linked list.
* Queue
	* An array-like data structure whose elements follow the FIFO rule: First in First out.
	* A queue is often compared to a group of people standing in line to purchase items at a store: the first person to get in line is ther first one to purchase items and to get out of the queue.
	* The following are a queue's standard operations and thier corresponding time complexities:
		* Enqueuing an element into the queue: O(1)
		* Dequeuing an element out of the queue :O(1)
		* Peeking at the element at the front of the queue: O(1)
		* Searching for an element in the queue: O(n)
	* A queue is typically implemented with a doubly linked list. 
 ## Strings 
<p align="center">
<img src="https://upload.wikimedia.org/wikipedia/commons/4/45/String_Variable_Diagram_Middle_Aspect_Ratio.png">
</p>

  * One of the fundamental data types in Computer Science, Strings are stored in memory as arrays of integers, where each character in a given string is mapped to an integer via some character-encoding standard like ASCII.
  * Strings behave much like normal arrays, with the main distinction being that, in most programming languages, (C++ is a notable exception), strings are immutable, meaning that they can't be dited after creation. This also means that simple operations like appending a character to a string are more expensive than they might appear.
  * The canonical example of an operation that's deceptive;y expensive  due to string immutabiloty is the following:
  >string = "this is a string"
  >newString = ""
  >for character in string:
	  >\\\\\\newString += character
	* The operation above has a time complexity of O(n^2) where n is the length of string, because each addition of a character to "newString"  creates an entirely new string and is itself an O(n) operation. therefore, n O(n) operations are performed, leading to an O(n^2) time complexity operation overall.
## Graphs
<p align="center">
<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/undirectedgraph.png">
</p>

* A collection of nodes or values called vertices that might be related, relations between vertices are called edges. 
* Many things in life can be represented by graphs, for example, a social network can be represented by a graph whose vertices are users and whose edges are friendships between users. Similarly, a city map can be represented by a graph whose vertices are locations in the city and whose edges are roads between the locations.
*  Graph cycle
	* Simply put, a cycle occurs where three or more vertices in the graph are connected so as to form a closed loop. 
	* Note that the definition of a graph cycle is sometimes broadended to include cycles of length two or one, in the context of coding interviews, when dealing with questions that involve graph cycles, it;s important to clarify waht exactly constitutes a cycle. 
* Acyclic graph
	* A graph that has no cycles.
* Cyclic Graph
	* A graph that has at least one cycle
* Directed Graph
	* A graph whose edges are directed, meaning that they can only be traversed in one direction, which is specified 
	* For example, a graph of airports and flights would likely be directed, since a flight specifically goes from one airport to another (i.e., it has a direction), without necessarily implying the presence of a flight in the opposite direction.    
* Undirected graph 
	* A graph whose edges are undriected, meaning that they can only be traversed in both directions 
	* For example, a graph of friends would lkely be undirected, since a friendship is, by nature , bidirectional.
* Connected Graph
	* A graph is connected if for every pair of vertices in the graph, ther's a apath of one ore more edges connecting the given vertices. In the case of a directed graph, the graph is:
		* Strongly connected if there are bidirectional connections between the vertices of every pari of vertices 
		* weekly connected if there are connections between the vertices of every pair of vertices. 
		* A graph which isn't connected is called a disconnected graph  

## Trees 
	* A tree is a type of graph. 
	* A data stucture that consists of nodes, each with some value and pointers to child node, which recuresively form subtrees in the tree.
	* The first node in a tree is referred to as the root of the tree, while the nodes at the bottom of a tree are referred to as leaf nodes or simply leaves. The paths between the root of a tree and its leaves are called branches, and the height of a tree is the length of its longest branch. The depth of a tree node is its distance from its tree's root, this is also known as the node's level in the tree.
	* A tree is effectively a graph that's connected , directed and acyclic, that has an explicit root node, and whose nodes all have a single parent ( except the root node whioch has no parents). Note that in most implementations of trees, tree nodes don't have a pointer to their parent, but they can if desired .
	* There are many types of trees and tree-like structures, including binary treesm heaps and tries.
* Binary Tree
	* A tree whose nodes have up to two child-nodes
	* The structure of a binary tree us such that many of its operation have a logarithmic time complexity , making the binary tree an incredibly attractive and commonly used data structure.
* K-ary tree
	* A tree whose nodfes have up to k child=nodes. A binary tree is a k-ary tree where k==2.
* Perfect Binary Tree 
	* A binary tree whose interior nodes all have two child-nodes and whose leaf nodes all have the same depth. Example:
>
><pre>           
>		  1
>      /         \
>    2           3
>   /   \       /   \
>  4     5     6     7
>/ \   / \   / \   / \
>8   9 10 11 12 13 14 15
></pre>
>
* Complete Binary Tree
	* A binary tree that's almost perfect; its interior nodes all have two child-nodes , but its leaf nodes dont't  necessarily all have the same depth. Furhtermore, the nodes in the last level of a complete nianry tree are as far left as possible. Example: 
><pre>          
>          1
>       /     \
>      2       3
>    /   \   /   \
>   4     5 6     7
> /   \
>8     9
></pre>
>
	* Conversely, the following binary tree isn't complete because the nodes in its 
	last lvel aren't as far left as possible 
<pre>          1
       /     \
      2       3
    /   \   /   \
   4     5 6     7
 /   \
8     9
</pre>
* Balanced Binary Tree
	* A binary tree whose nodes all have lest and right subtrees whose heights differ by no more than 1. 
	* A balanced binary tree is such that the logarithmic time complexity of it's value is maintained. 
	* For example, inserting a node at the bottom of the following imbalanced binary tree'a left subtree would clearly not be a logarithmic time operation , since it would involve traversing through most of the tree's nodes:
>
><pre>             
>		    1
>          /     \
>         2       3
>       /
>      4
>    /
>   8
>  /
>10
></pre>
	* The following is an example of a balanced binary tree:
			         1
		           /     \
		          2         3
		        /   \     /   \
		      4      5    6     7
		     /        \        /
		   10          9      8
   * Full binary tree 
	   * A binary tree whose nodes all have either two child-nodes or zerp child-nodes. Example:
	   *     	   1
				 /     \
				2       3
				      /   \
				     6     7
				   /   \
				  8     9

    
   

	

 


  
  
