package com.example;

public class Geometria {
   public static void main(String[] args) {
    Rectangulo r1 = new Rectangulo("1", "rojo", 4, 10, 4);
    
    System.out.println(r1);
    r1.moverAbj(2);
    r1.moverDer(3);
    System.out.println(r1);
   }
}