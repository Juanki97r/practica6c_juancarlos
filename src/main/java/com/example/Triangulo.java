package com.example;

import java.awt.Point;

public final class Triangulo extends Poligono implements Comparable<Triangulo>  {
   
    private Point y;
    private Point x;
    private Point z;
    
    
    public Triangulo(String id, String color, int base, int altura, int numLados) {
        super(id, color, base, altura, 3);
        this.y = new Point(0,getAltura());
        this.x = new Point(0,0);
        this.z = new Point(0,getBase());
    }
    
    public Triangulo() {
        
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getZ() {
        return z;
    }

    public void setZ(Point z) {
        this.z = z;
    }

    @Override
    public double area() {
        return (getAltura()*getBase())/2;
    }

    @Override
    public int compareTo(Triangulo o) {
        return Integer.compare(getBase(), o.getBase());
    }

    @Override
    public String toString() {
        return "Triangulo [y=" + y + ", x=" + x + ", z=" + z + super.toString() + "]";
    }
   
   
    

    
}
