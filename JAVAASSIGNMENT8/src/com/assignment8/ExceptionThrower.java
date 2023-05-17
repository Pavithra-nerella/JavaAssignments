package com.assignment8;

public class ExceptionThrower {
    public static void throwExceptions() throws CustomException1, CustomException2, CustomException3 {
        // throw one of each custom exception
        throw new CustomException1("Exception 1 occurred.");
//        throw new CustomException2("Exception 2 occurred.");
//        throw new CustomException3("Exception 3 occurred.");
    }
}
