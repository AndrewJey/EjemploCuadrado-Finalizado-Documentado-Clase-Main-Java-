
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import javax.swing.JOptionPane;

/**
 *
 * @author Arbay Fernandez
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //definir VARIABLES
        String lado;
        int ld;
        
        //JOptionPane para que usuario ingrese el valor de lado
        lado=JOptionPane.showInputDialog("Escriba el valor del lado");
        ld=Integer.parseInt(lado); //Praseado el String, para que lea el int      
        //JoptionPane.showInputDialog(null, "solicitud");
        
        //crear instancia de la clase
        Cuadrado c1 = new Cuadrado(ld);
        //Clase nombre = new Constructor(variables del constructor);
        
        //imprimir a clase.toString()
        System.out.println(c1.toString());
    }
    
}
