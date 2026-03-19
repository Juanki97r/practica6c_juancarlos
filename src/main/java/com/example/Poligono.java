package com.example;

public abstract class Poligono extends Figura{
    private int base;
    private int altura;
    private int numLados;
   
   
    public Poligono(String id, String color, int base, int altura, int numLados) {
        super(id, color);
        this.base = base;
        this.altura = altura;
        this.numLados = numLados;
    }
    
    public Poligono() {
       
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    @Override
    public String toString() {
        return "Poligono [base=" + base + ", altura=" + altura + ", numLados=" + numLados + super.toString() + "]";
    }

    
    
}
