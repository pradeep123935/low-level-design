# Adaptor
The Adapter Design Pattern is a structural design pattern that allows incompatible interfaces to work together by converting the interface of one class into another that the client expects.

It’s particularly useful in situations where:
1. You’re integrating with a legacy system or a third-party library that doesn’t match your current interface.
2. You want to reuse existing functionality without modifying its source code.
3. You need to bridge the gap between new and old code, or between systems built with different interface designs.

Two Types of Adapters
There are two primary ways to implement an adapter, depending on the language and use case:
1. Object Adapter (Preferred in Java)
    1. Uses composition: the adapter holds a reference to the adaptee (the object it wraps).
    2. Allows flexibility and reuse across class hierarchies.
    3. This is the most common and recommended approach in Java.
2. Class Adapter (Rare in Java)
    1. Uses inheritance: the adapter inherits from both the target interface and the adaptee.
    2. Requires multiple inheritance, which Java doesn’t support for classes.
    3. More suitable for languages like C++.