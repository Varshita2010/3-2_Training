A Red black tree
- a red black tree is a self balancing binary search tree where each node has a color(red/black).
- it follows specific rules to keep the tree balanced.
- time complexity : 0(log n).
- Operations
  1. Search
  2. insert
  3. Delete
- Properties
  1. every node is either red or black
  2. root is always black
  3. no to nodes are adjacent
  4. no red paret child
  5. every path from root to leaf has same no.of black nodes
  6. new node are always inserted as red
- Insertion steps
  1. Insert nodes like a vst
  2. Color it red
  3. Fx voilation usung recoloring - left rotation and right rotation 
