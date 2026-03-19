package com.example;

import java.awt.Point;

public final class Rectangulo extends Poligono {
    
    private Point superiorIzquierda;
    private Point inferiorIzquierda;
    private Point superiorDerecha;
    private Point inferiorDerecha;
   
   
    public Rectangulo(String id, String color, int base, int altura, int numLados) {
        super(id, color, base, altura, numLados);
        this.superiorIzquierda = new Point(0, getAltura());
        this.inferiorIzquierda = new Point(0,0);
        this.inferiorDerecha = new Point(getBase(),0);
        this.superiorDerecha= new Point(getBase(),getAltura());
    }
    
    
    public Rectangulo() {
    }


    public Point getSuperiorIzquierda() {
        return superiorIzquierda;
    }


    public void setSuperiorIzquierda(Point superiorIzquierda) {
        this.superiorIzquierda = superiorIzquierda;
    }


    public Point getInferiorIzquierda() {
        return inferiorIzquierda;
    }


    public void setInferiorIzquierda(Point inferiorIzquierda) {
        this.inferiorIzquierda = inferiorIzquierda;
    }


    public Point getSuperiorDerecha() {
        return superiorDerecha;
    }


    public void setSuperiorDerecha(Point superiorDerecha) {
        this.superiorDerecha = superiorDerecha;
    }


    public Point getInferiorDerecha() {
        return inferiorDerecha;
    }


    public void setInferiorDerecha(Point inferiorDerecha) {
        this.inferiorDerecha = inferiorDerecha;
    }


    @Override
    public String toString() {
       
        return "Rectangulo [superiorIzquierda=" + superiorIzquierda + ", inferiorIzquierda=" + inferiorIzquierda
                + ", superiorDerecha=" + superiorDerecha + ", inferiorDerecha=" + inferiorDerecha + ", getId()="
                + getId() + ", getColor()=" + getColor() + ", getBase()=" + getBase() + ", getAltura()=" + getAltura()
                + "]";
    }


    @Override
    public double area() {
        
        return getBase()*getAltura();
    }

    

}
