# Quantexa coding style

## Key tenants

1. Functional programming
2. Test driven development

### Functional programming

Functional programming (often abbreviated FP) is the process of building software by composing pure functions, avoiding shared state, mutable data, and side-effects. Functional programming is declarative rather than imperative, and application state flows through pure functions.

A pure function is a function which:

- Given the same inputs, always returns the same output, and
- Has no side-effects (side effects modify some state variable value(s) outside its local environment, a function should only use or manipulate variables passed to it and within its scope)
- Functions should have no shared state
- all variables should be immutable 
  
Pure functions have lots of properties that are important in functional programming, including referential transparency (you can replace a function call with its resulting value without changing the meaning of the program)

At Quantexa we don't use pure functional programming (reading data in spark) but we make every effort to stick to these principles as closely as possible

### Test driven development

Test Driven Development (TDD) is software development approach in which test cases are developed to specify and validate what the code will do. In simple terms, test cases for each functionality are created and tested first and if the test fails then the new code is written in order to pass the test and making code simple and bug-free.

Test-Driven Development starts with designing and developing tests for every small functionality of an application. TDD instructs developers to write new code only if an automated test has failed. This avoids duplication of code. 

