package com.multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptionExample {

    public void start() throws IOException, ParseException {

        // throw new IOException();

        throw new ParseException("Error at line 10", 2);

    }

    public void example() throws IOException, FileNotFoundException {

    }
}

