package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Geometria {
   public static void main(String[] args) {

      //1 crear el conjunto, los objetos y añadirlos al conjunto
    Set<Figura> conjuntoFiguras = new HashSet<>();
   
    Figura r1 = new Rectangulo("234"  , "Azul", 10, 20);
    Figura r2 = new Rectangulo("345"  , "Verde", 5, 8);
    Figura t1 = new Triangulo("125", "Amarillo", 8, 5);
    Figura t2 = new Triangulo("333", "Rojo", 10, 7);
    Figura c1 = new Circulo("167", "Morado", 5);
    Figura c2 = new Circulo("278", "Negro", 15);

    conjuntoFiguras.add(r1);
    conjuntoFiguras.add(r2);
    conjuntoFiguras.add(t1);
    conjuntoFiguras.add(t2);
    conjuntoFiguras.add(c1);
    conjuntoFiguras.add(c2);

    //2) casting implicito y polimorfismo del toString y area al imprimir cada tipo de figura
    for (Figura f : conjuntoFiguras) {
      System.out.println("Datos figura: "+ f + " Area de la figura "+f.area());
    }
    


    //3) creamos la lista incluyendole el set directamente 

      List<Figura> listaFiguras = new ArrayList<>(conjuntoFiguras);

      //4) ordenamos la lista
      Collections.sort(listaFiguras, (f1,f2)->f1.getId().compareTo(f2.getId()));

      //5)busqueda binaria

      Figura figuraABuscar = new Circulo();
      figuraABuscar.setId("333");
      
      int posicionFigura = Collections.binarySearch(listaFiguras, figuraABuscar, (f1,f2)->f1.getId().compareTo(f2.getId()));

      System.out.println("Posicion de la figura " + figuraABuscar + " = " + posicionFigura);

      
      //6) ordenar por color y en segunda instancia por id

      listaFiguras.sort(Comparator.comparing(Figura :: getColor).thenComparing(Figura::getId));

      //7) recorrer lista y dividir entre las que son dibujables y movibles 

      List<Dibujable> listaDibujables = new ArrayList<>();
      List<Movible> listaMovibles = new ArrayList<>();

      for (Figura f : listaFiguras) {
         if( f instanceof Dibujable){
            listaDibujables.add((Dibujable)f); //casting explicito
         }

         else if( f instanceof Movible ){
            listaMovibles.add((Movible)f); //casting explicito
         }
      }

      //8) recorrer la lista de dibujables y llamar al metodo dibujar

      for (Dibujable f : listaDibujables) {
         f.dibujar();
      }

      //9) recorrer los movibles y moverlos segun que objeto sean

      for (Movible f : listaMovibles) {
         if(f instanceof Rectangulo){  //conversion implicita
            f.moverDer(2);
         }

         else if( f instanceof Circulo){ //conversion implicita
            f.moverArr(3);
         }
      }

      //10)guardo el map en un conjunto y lo recorro para mostrarlo

      Map<Figura,Double> conjuntoAreas = new HashMap<>(areaPorFigura(conjuntoFiguras));

      conjuntoAreas.forEach((key,value)->System.out.println(key+ " -> "+value));

      
   }

   public static Map<Figura,Double> areaPorFigura(Set<Figura> conjunto){
      Map<Figura,Double> areasFiguras = new HashMap<>();

      for (Figura figura : conjunto) {
         areasFiguras.put(figura, figura.area());
      }

      return areasFiguras;

   }
}