📊 Array Data Structure in Java
📌 Introduction
An array in Java is a container object that holds a fixed number of values of a single data type. The length of the array is established when the array is created and cannot be changed afterward.

🧠 Key Characteristics
Fixed Size: Once initialized, the size cannot be altered.

Indexed Access: Elements are accessed using zero-based indices (array[0], array[1], etc.).

Homogeneous Elements: All elements must be of the same type (e.g., int, String).

Stored in Contiguous Memory Locations.

💻 Syntax and Examples
Declaration and Initialization
java
// Declaration
int[] numbers;

// Memory allocation
numbers = new int[5];

// Declaration + Initialization
int[] scores = {90, 80, 70, 60, 50};
Accessing Elements
System.out.println(scores[2]); // Output: 70

Updating Elements
scores[2] = 75;
System.out.println(scores[2]); // Output: 75
Looping Through an Array

for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}

// Using enhanced for-loop
for (int score : scores) {
    System.out.println(score);
}
⚙️ Common Operations
Operation	Description	Time Complexity
Access	Get element by index	O(1)
Insertion	Insert at specific index (manual)	O(n)
Deletion	Remove element (manual shift)	O(n)
Traversal	Loop through elements	O(n)
Search	Linear or Binary Search	O(n) / O(log n)*

*Binary search only works on sorted arrays.

✅ Use Cases
When the size of the collection is known ahead of time.

For performance-critical applications where indexed access is important.

As the base for other data structures like matrices, heaps, stacks, etc.

🚫 Limitations
Fixed size once initialized.

No built-in methods for common operations (e.g., insert, delete) unlike ArrayList.

📚 Conclusion
Arrays in Java provide a powerful and efficient way to store and manipulate fixed-size collections of data. For more flexible alternatives, consider using ArrayList from the Java Collections Framework.
