package com.cc.java;



public class Singleton {
    // objektbildung
private static Singleton instance;

private Singleton() {
   
}

public static Singleton getInstance() {
//     if (instance == null) {
//        return instance = new Singleton();
//     }
//    return instance; 

return instance == null ? instance = new Singleton() : instance;
 
 }
  
}





