# Assignment 6

You will make a program that determines what change to give a customer when they purchase a car wash (the number of dollar bills, quarters, dimes, etc.).

You will use the special procedure shown below in order to avoid rounding errors.

## Procedure

Take input from the user for the amount a car wash costs and store it as a decimal number, such as 4.99, 15.79, or 27.67. Then, take input from the user for the amount of money the person is giving, as a decimal.

You will be calculating the change (number of pennies, nickels, dimes, etc.) you would give by doing the following:

1. Convert the amount (e.g. 4.99) into cents (499) and store that as an `int` (you will end up getting an error because the compiler thinks you will be losing precision by dropping the decimal, but we aren't. You will need to force it to be an `int` by casting it, as shown below).

```
int myNum = 10.3;  // error: incompatible types: possible lossy conversion from double to int
```
```
int myNum = (int) 10.3;  // drops decimal to give 10
int num1 = (int) 355.0;  // drops decimal to give 355
```

2. Divide the cents by 100 and store the quotient (this is the number of dollars). Obtain the remaining cents storing remainder 100 in another variable.
3. Do this for quarters, dimes, nickels, and pennies, then display the result.

### Sample Outputs

```
Which wash would you like? (4.79, 15.47, 27.33) 15.47
How much are you giving me? 20
Your $4.53 in change consists of:
4 dollars
2 quarters
0 dimes
0 nickels
3 pennies
```

### Grading

Your program will be graded on its functionality according to the project specifications and proper code style (following naming conventions for identifiers, proper indentation, and proper spacing). Also, remember to put your name and the date in a comment at the top of your file.

