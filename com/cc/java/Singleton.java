package com.cc.java;



public class Singleton {
    // objektbildung in der Klasse
private static Singleton instance;

// feld, auf das nach der objektbildung zugriffen wird
private int counter;


private Singleton() {
   
}
// in der  Klasse
public static Singleton getInstance() {
//     if (instance == null) {
//        return instance = new Singleton();
//     }
//    return instance; 

// oder mit ternären operator
return instance == null ? instance = new Singleton() : instance;
 
 }
//   funktionalität im Objekt

    public int getCounter() {
        return counter;
    }

    public void actOnEvent() {
        this.counter ++;
    }

}





