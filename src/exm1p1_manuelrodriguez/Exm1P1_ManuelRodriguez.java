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
        int opcion;
      do{
            menu();
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("CONVERSION BINARIO A DECIMAL");
                    ejercicio1();
                    break;
                case 2:
                    System.out.println("CONTAINS MANUAL");
                    System.out.println("Ingrese la cadena principal: ");
                    String cadena = scanner.nextLine();
                    System.out.println("Ingrese la cadena a buscar: ");
                    String subCadena = scanner.nextLine();
                    contenerPapu(cadena,subCadena);
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion!=4);
        scanner.close();
    }
    
    public static void menu(){
        System.out.println("------MENU------");
        System.out.println("1. Conversion de Binario a Decimal");
        System.out.println("2. Contains Manual");
        System.out.println("3. Reemplazo de palabras");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opcion:");
    }
    
    public static void ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena binaria de 8 caracteres: ");
        String cadena = entrada.nextLine();
        boolean validar = true;
      
        for (int i = 0; i <= cadena.length(); i++) {
            
        }
    }
    
    public static boolean contenerPapu(String texto, String buscar){
        for (int i = 0; i < texto.length(); i++) {
            
                
            
        }
    }
    
    public static String ejercicio3(String cadena, String search, String reemplazo){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cadena: ");
        cadena = sc.nextLine();
        System.out.println("");
    }
    
}
