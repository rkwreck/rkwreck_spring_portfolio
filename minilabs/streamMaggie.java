/*
======
STREAM
======

REQUIREMENTS:
5 points--> Based on TPT 5 and Tech Talk 5.   Each individual will take an algorithm and implement it 4 different ways(similar to Fibonacci)
Individuals will send a DM that points to Code and Video.   Video will be approximately 30 seconds and show runtime.
You must create...
1. Abstract Class
2. Abstract Interface
3. Polymorphic Behavior in Class that extends
4. A screen allowing input and showing analysis on HTML frontend
5. something unique.
3 points--> Journal plus Unit 6 assignments.

LINKS:
https://csa.nighthawkcodingsociety.com/fib
https://theboreddev.com/understanding-java-streams/
https://www.w3schools.com/java/java_lambda.asp
 */

/*
public class streamMaggie{

    public static void main(String[] args) {
        System.out.println("Welcome to Stream");



    }
}


EXAMPLE:
package com.nighthawk.csa.algorithm.fibonacciModel;

import java.util.stream.Stream;

public class FibStream extends _Fibonacci {
    public FibStream() {
        super();
    }
    public FibStream(int nth) {
        super(nth);
    }
    // Abstract Polymorphic "init()" method using Stream and Lambda expressions

@Override
protected void init() {
    super.name = "Stream";
    // Stream iterates using lambda "->" syntax unil ".limit" is reached
    // Streams and Lambda have been added to more recent versions of Java, this will NOT be on AP Test
    // Streams are prevalent in Big Data, in this example it seems to perform the worst
    Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
            .limit(super.size)
            .forEach(f -> super.setData(f[0]) );
}


    // Class method "main" with purpose of testing FibStream
    public static void main(String[] args) {
        _Fibonacci fibonacci = new FibStream();
        fibonacci.print();
    }
}
*/