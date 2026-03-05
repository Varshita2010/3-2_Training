## Aptitude
- Percentage
   $$ sum divide $$

- the item price has increased from 1750 to 3500 how much is the percentage difference ?

### Succesive percentage:
- if two changes x% and y% happen
$$
Net\% = \mathbf{x} + \mathbf{y} + \frac{\mathbf{xy}}{100}
$$
- Q: - increase by 20% then 30%
### 6.Reverse Percentage 
1. if final value is given and increase% known
$$
original = \frac{final}{1 + \frac{\mathbf{x}}{100}}
$$
2. if decreas
$$
original = \frac{final}{1 - \frac{\mathbf{x}}{100}}
$$
- Q: after 20% increase a salary becomes 36000 find the original salary :1384/30000
- Q: after 25% decrese price becomes 900 find original : 1200
- Q: A number increased by 40% and becomes 350 find the original : 250
- Q: a number is increased by 20% and then decreased by 20% final value is 480 find original number : 500
- sol:
  1. increase by 20% --> base changes
  2. then decreases by 20% --> applied on new value ,they dont increase Means overall decrease for 20%
     $$
     change = \frac{20^2}{100} = \frac{400}{100} = 4\%
     $$
     $$
     => \mathbf{4} - \mathbf{100} = 96 = \frac{\mathbf{96}}{\mathbf{100}} = 0.96
     $$
  3. final value = original after 4% decrease
     $$
     final = original * 0.96
     $$
     $$
     original = \frac{final}{\mathbf{0.96}}
     $$
  
- Q: Population after 10% increase becomes 55000 find original : 50000
- Q: after 25% of profit selling price becomes 1250 find cost price : 1000
- Q: a value becomes 960 after being decreased by 20% find original : 1200
- Q: after 37.5% increase value becomes 1100 find the original : 800
### Short cut fractions:
1. 50% = 1/2
2. 25% = 1/4
3. 75% = 3/4
4. 20% = 1/5
5. 10% = 1/10
6. 12.5% = 1/8
7. 33.33% = 1/3
8. 66.66% = 2/3

## X% of y = Y% of X
$$ 
\mathbf{20\%} of \mathbf{50} = \mathbf{50\%} of 20
$$
$$
=> to find \mathbf{15%} = \mathbf{10\%} + \mathbf{5\%} 
$$
similarly ,
$$
\mathbf{35\%} = \mathbf{30\%} + \mathbf{5\%}
$$





# 2-3-26
## DataStructures
- how data is stored and organised
- Example :-
  - linke list,Stack,Queue,Trees,Graphs..
#### Algorithms:
- step-by-step procedure to solve a problem efficiently
- Example:-
  - Searching,Sorting,Recursion,Dynamic Programming
- DSA = Organizing data + Solving problems efficiently
### RoadMap
1. Arrays
2. String
3. Recurrsion
4. Searching and sorting
5. Linked list
6. Stack & Queue
7. Trees
8. Graphs
9. Dynamic programming(Advanced)

## String in java: 
- In java a string is a sequence of patterns used to store text
- In java string is a class present in java.util.lang
- Strings are imutable(cannot be changed after creation)
- String obj are stored in special memory of area called string Constant pool
  - Example: string_Name = "Varshita"
#### ways to create a string:
- creating a string
> Using string literals(Stroed in string pool)
  - String s1 = Hello 
> Using new keyword(Stored in Heap Memory)
  - String s2 = new String("Hello");
> Immutability of String
- String object cannot be change once created
- String s = "hello";
- s.contact("World");
- System.out.println(s);
- Because concat() creates a new object but does not modify original.
  - s = s.contact("world");
  - System.out.println(s);
- Important Striing Methods
### Print String Algorithm FlowChart:
        start
          |
        String[50]*c
          |
        Input String
          |
        C=String[0]
          |
        While C != null - no
          | 
        yes
          |
        if no *C>'A' && *C <='2'
          |
        yes
          |
        *C = *c+32
        c++
          |
        print string
          |
          stop

### Execution floWchart of a java code
        start Java Source code exe.java
           |
    Java Compiler
    - lexical analysis
    - Grammatical analysis
    - Semantic analysis
    - Byte function
           |
       Byte Code
       (xxx.class)
           |
     class loader
           |
        Byte Checker  -> Operation System
           |
    - Translated by byte code
    - J/T Compiler(compile and execute)
