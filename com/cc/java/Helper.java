package com.cc.java;

public class Helper {
    public static void output(String outputData) {
        System.out.println(outputData);  
    }

    // Überladene Methode
    public static void output(int outputData){
        System.out.println(outputData);
    }

    // Überladene Methode
    public static void output(boolean outputData){
        System.out.println(outputData);
    }

    public static void output(Object outputData){
        System.out.println(outputData);
    }



}
