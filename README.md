# Pre-work-in-java

**getting accustomed to this great programming language whose application fields range from understanding basic concepts of OOP to developing complex apps.**


*Java is a statically typed language, i.e., every variable must be declared with a data type. A variable cannot start off life without knowing the range of values it can hold, and once it is declared, the data type of the variable cannot change.(it is strongly typed).*

## Static initializer block in Java


*accessed only once:  **the first time you make an object of that class** or **the first time you access a static member of that class** (even if you never make an object of that class)*

Static initializer blocks are different from initializer blocks.![Check here](https://www.geeksforgeeks.org/g-fact-26-the-initializer-block-in-java/). Initializer blocks are executed before constructors and so are Static initializer blocks.


## Double data type (precision)
![see here](https://stackoverflow.com/questions/322749/retain-precision-with-double-in-java)

The float and double primitive types in Java are floating point numbers, where the number is stored as a binary representation of a fraction and a exponent.

More specifically, a double-precision floating point value such as the double type is a 64-bit value, where:

1 bit denotes the sign (positive or negative).
11 bits for the exponent.
52 bits for the significant digits (the fractional part as a binary).
These parts are combined to produce a double representation of a value.


The byte, char, int, long types are fixed-point numbers, which are exact representions of numbers. Unlike fixed point numbers, floating point numbers will some times (safe to assume "most of the time") not be able to return an exact representation of a number. This is the reason why you end up with 11.399999999999 as the result of 5.6 + 5.8.

When requiring a value that is exact, such as 1.5 or 150.1005, you'll want to use one of the fixed-point types, which will be able to represent the number exactly.


![see here](https://stackoverflow.com/questions/25981349/java-double-round-off-to-2-decimal-always)
casting double to BigDecimal in order to round it is very inefficient approach. You should use Math.round instead:

    double value = 1.125879D;
    double valueRounded = Math.round(value * 100D) / 100D;
Second, when you print or convert real number to string, you may consider using System.out.printf or String.format. In your case using format "%.2f" does the trick.

As has been mentioned several times already, Java has a BigDecimal class which will handle very large numbers and very small numbers.





