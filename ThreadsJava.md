# 9-3-26
## Thread 
-  A thread is a smallest unit of execution inside a process.
-  A program can run multiple task at the same time using threads.
-  A thread is a light weight process that runs independently.
## Multi-Threading
- it is a process where multiple threads executes simultaneously within a single program.
## Why multi-threading is used
       Advantage                                         Explanation
    1. Faster execution                          multiple task run together
    2. Better CPU usage                          CPU does not stay idol
    3. Efficient Programs                        Last program runs smoothly
    4. Parallel Processing                       task run simultaneously

## Thread-life cycle : A thread goes 
     New 
      |
    Runnable
      |
    Running
      |
    Waiting
      |
    Terminated

1. New: Thread object created -> threaf t = new Thread();
2. Runnable : Thread ready to run -> t start();
3. Running : Thread executing CPU gives time to execute
4. Waiting : Threads are waiting for another thread
   - sleep()
   - waiting()
   - join()
5. Terminate : Thread finited exited.

## Important methods we use in threads:
      Methods           Purpose
    1. Start()    -   Starts thread
    2. run()      -   Code executed
    3. sleep()    -   Paused thread
    4. join()     -   waiting for another thread
    5. isalive    -   check thread status
    6. getName()  -   Thread name

## Ways to create threads in java
- There are two ways :
  1. Method 1 : Extending Thread class
  2. Method 2 : Impementing Runnable Interface

## Differences B/W thread class and Thread Runnable
        Thread Class                         Thread Runnable
    1. extend thread                       1. implement runnable interface
    2. cannot extend another class         2. can extend another class
    3. less flexible                       3. more flexible
