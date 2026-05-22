/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exm1p1_manuelrodriguez;

import java.util.Scanner;

/**
 *
 * @author manu_
 */
public class Exm1P1_ManuelRodriguez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do{
            menu();
            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("CONVERSION BINARIO A DECIMAL");
                    break;
                case 2:
                    System.out.println("CONTAINS MANUAL");
                    break;
                case 3:
                    System.out.println(" REEMPLAZO DE PALABRAS");
                    break;
            }
        }
        
    }
    public static void menu(){
        System.out.println("------MENU------");
        System.out.println("1. Conversion de Binario a Decimal");
        System.out.println("2. Contains Manual");
        System.out.println("3. Reemplazo de palabras");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion");
    }
}
