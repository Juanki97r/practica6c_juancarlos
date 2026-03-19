package com.example;
import java.awt.Point;

public class Circulo extends Figura implements Movible{
    private int longitudRadio;
    private Point centro = new Point(0,0);
    
    public Circulo(String id, String color, int longitudRadio) {
        super(id, color);
        this.longitudRadio = longitudRadio;
        this.centro = new Point(0,0);
    }
    public Circulo() {
        
    }
    
    @Override
    public String toString() {
        return "Circulo [longitudRadio=" + longitudRadio + ", centro=" + centro + super.toString()+ "]";
    }
    public int getLongitudRadio() {
        return longitudRadio;
    }
    public void setLongitudRadio(int longitudRadio) {
        this.longitudRadio = longitudRadio;
    }
    public Point getCentro() {
        return centro;
    }

    //o mover
    public void setCentro(Point centro) {
        this.centro = centro;
    }
   
    @Override
    public double area() {
        return Math.PI*Math.pow(longitudRadio, 2);
    }
    @Override
    
    public void moverIzq(int x) {
        this.centro = new Point(x,centro.y);
    }
    @Override
    public void moverDer(int x) {
        this.centro = new Point(x,centro.y);
    }
    @Override
    public void moverArr(int y) {
        this.centro= new Point(centro.x,y);
    }
    @Override
    public void moverAbj(int y) {
        this.centro=new Point(centro.x,y);
    }

    
}
