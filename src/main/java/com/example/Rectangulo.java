package com.example;

import java.awt.Point;

public final class Rectangulo extends Poligono implements Movible,Dibujable{
    
    private Point superiorIzquierda;
    private Point inferiorIzquierda;
    private Point superiorDerecha;
    private Point inferiorDerecha;
   
   
    public Rectangulo(String id, String color, int base, int altura, int numLados) {
        super(id, color, base, altura, 4);
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
                + ", superiorDerecha=" + superiorDerecha + ", inferiorDerecha=" + inferiorDerecha + super.toString() + "]";
    }


    @Override
    public double area() {
        
        return getBase()*getAltura();
    }


    @Override
    public void moverIzq(int x) {
        this.inferiorDerecha = new Point(inferiorDerecha.x-x,inferiorDerecha.y);
        this.inferiorIzquierda = new Point(inferiorIzquierda.x-x,inferiorIzquierda.y);
        this.superiorDerecha = new Point(superiorDerecha.x-x,superiorDerecha.y);
        this.superiorIzquierda = new Point(superiorIzquierda.x-x,superiorIzquierda.y);
    }


    @Override
    public void moverDer(int x) {
        this.inferiorDerecha = new Point(inferiorDerecha.x+x,inferiorDerecha.y);
        this.inferiorIzquierda = new Point(inferiorIzquierda.x+x,inferiorIzquierda.y);
        this.superiorDerecha = new Point(superiorDerecha.x+x,superiorDerecha.y);
        this.superiorIzquierda = new Point(superiorIzquierda.x+x,superiorIzquierda.y);
    }


    @Override
    public void moverArr(int y) {
       this.inferiorDerecha = new Point(inferiorDerecha.x,inferiorDerecha.y+y);
        this.inferiorIzquierda = new Point(inferiorIzquierda.x,inferiorIzquierda.y+y);
        this.superiorDerecha = new Point(superiorDerecha.x,superiorDerecha.y+y);
        this.superiorIzquierda = new Point(superiorIzquierda.x,superiorIzquierda.y+y);
    }


    @Override
    public void moverAbj(int y) {
        this.inferiorDerecha = new Point(inferiorDerecha.x,inferiorDerecha.y-y);
        this.inferiorIzquierda = new Point(inferiorIzquierda.x,inferiorIzquierda.y-y);
        this.superiorDerecha = new Point(superiorDerecha.x,superiorDerecha.y-y);
        this.superiorIzquierda = new Point(superiorIzquierda.x,superiorIzquierda.y-y);
    }


    @Override
    public void dibujar() {
       
    }

    

}
