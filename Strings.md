# 3-3-26
### String-Pool concept
- String1 = "cat"  ------------- "Cat"                         
- String2 = "cat"  ------------- "Dog"
- (--------------------------------------------)
- String = newString("car")  --- "cat' StringPool
- s1 == 2; //true
- s1 == 3; //false

### flow:
      start
        |
    constant Table
        |
    Soap String<-------| 
        |              |
    (Local Memory)     |
    Table              |
    - one ------------>|
    - two ------------> same string

## String builder and string buffer:
- both string builder and string buffer are classses in java used to create mutable string(we can change).
- unlike string which is imutable this classes allow you to modify the same object without new once which includes performance
- package we use is java.lang
#### Common methods
1. to append - add text
2. insert - insert text
3. delete = deletes part
4. reverse - reverse a string
5. capacity - returns capacity
### String BUffer:
- It is also a mutable sequence of characters but it is strech safe
- It is synchronize means it is safe for in multi-threaded environment
- package java.lang
#### When to use what
- Use String when value does not change
- Use string builder when modifing string frecuntly(single thread)
- use stirng buffer when wroking a multi-threaded environment
#### String

    sample string <-------------------------------------------------------|
          |                                                               |
     - welcome ------------------------- initial string                   |
     - welcome everyone                                                   |
     - welcome everyone                                                   |
     - welcome everyone,how are you? --- final string-------------------->|

#### String Builder

    sample string (initial ,final)
           |
        welcome
           +
    welcome everyone
           +
    welcome everyone
           +
    welcome everyone,
    how are you doing?

### Differences between string stringBuilder stringBuffer ?
    feature          string        stringBuillder          stringBuffer
      |                |                 |                      |
    Mutable           No                Yes                    Yes
    Thread-safe       No                No                     Yes
    Performance       Slow             Fast                    Medium
    Introduced        java1.0          java1.5                 java1.0

## String Array
- String array is an array that stores multiple string objects
- Syntax:
  - String[] arr = new String[3];
