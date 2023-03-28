## Array
- Array in* Java is index-based.
- Java array is an object of a dynamically generated class.
- Java array inherits the Object class, and implements the Serializable as well as  Cloneable interfaces.
- we can create single dimentional or multidimentional arrays in Java.
- We can store only the fixed size of elements in the array. Its size can not be increased at runtime. Thus, collection framework is used in Java which grows automatically.
**Array Decleration**
```
- datatype[] array;   
- datatype []array;   
- datatype array[];  
```
#### Irregular Array (Jagged Array)
Jagged Array has fixed size in one dimension and varying size in other dimension. It may be declared in one of the following ways.
```
int[][] B = new int[3][]; // two dimensional array
int[][][] C = new int[3][4][]; // three dimensional array
int[][][] D = new int[3][][]; // irregular three dimensional array
// int[][][] E = new int[][][]; // error
```