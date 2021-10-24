package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(long inputNumber) {
        long a = 0;
        long result = 0;
        while (inputNumber != 0) {
            a = inputNumber % 10;
            inputNumber /= 10;
            result = result * 10 + a;
        }
        if(Integer.MAX_VALUE < result  || Integer.MIN_VALUE > result) {
            throw new OutOfIntRangeException("Number is out of range");
        }
        return (int) result;
    }
}
