package com.multipleexceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {

    public static void main(String[] args) {

        MultipleExceptionExample me = new MultipleExceptionExample();

//		try {
//			me.start();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		} catch (ParseException e) {
//				System.out.println("Incorrect format");
//		}

//		try {
//			me.start();
//		} catch (IOException | ParseException e) {
//
//			e.printStackTrace();
//		}

        try {
            me.start();
        } catch (Exception e) {

            e.printStackTrace();
        }

        try {
            me.example();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
