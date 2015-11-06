/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author java
 * Clase Cuadrado 
 */
public class Cuadrado {
    
//VARIABLES:    
    private int lado; //Variable privada de tipo entero llamada lado
    
    /*
    * Método Constructor de mi clase cuadrado
    */
    public  Cuadrado(int lado) {
        this.lado=lado; //La variable lado del constructor vale lo que valga mi variable global lado       
    } //cierra mi constructor
    
    //Luego van mis métodos

    //Primero mis métodos set, luego mis get; y finalmente mis otros métodos. Termino con metodo ToString();
    
    //Método para setear la variable lado
    public void /*vacio*/ setLado(int lado) {
        this.lado = lado;  //recibo y defino la variable lado
    }
    //Método para obtener mi variable lado
    public int getLado() {
        return lado; //devuelvo mi variable lado
    }
    /*
    * metodo area
    * @parameter lado
    * metodo para calcular el area de mi cuadrado, al recibir su lado
    */
    public float Area(int lado){      
        return lado*lado; //devuelve el calculo de la variable lado por su lado
    } //En el main imprimiré mi resultado así: System.out.println(claseCuadrado.Area(lado));
    
    //Perimetro
    public float Perimetro(int lado){      
        return lado*4; //devuelve el calculo de la variable lado multiplicado por 4
    }

    /**
     *método toString
     * @return datos concatenado de la clase
     * almacena para impresión datos en las clases
     */
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}' + "Área del Cuadrado: " + this.Area(lado)+" Perimetro del Cuadrado: "+ this.Perimetro(lado);
    }
    
    
    
    
}
