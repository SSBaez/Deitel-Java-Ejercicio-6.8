package com.ssbaez.ejercicio68;

import java.util.Scanner;

public class CargoEstacionamietno {
	
public static double cargosTotales = 0;
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            
            System.out.printf("Seleccione una opcion%n%s%n%s%n%s%n%s", 
                          "1) Nuevo cargo de estacionamiento",
                          "2) Total corriente de ayer",
                          "3) Terminar",
                          "----> ");
            
            int opcion = input.nextInt();
            
            if(opcion == 1){
                
                while(true){
                    
                    System.out.println("Ingrese la cantidad de horas estacionado (minutos como punto decimal)");
                    System.out.print("----> ");
                    double horas = input.nextDouble();
                    
                    if(horas > 0 && horas <= 24){
                        calcularCargos(horas);
                        break;
                    }else{
                        System.out.println("***DATO ERRONEO***");
                    }
                    
                }
                
            }//Fin de opcion 1
            
            else if(opcion == 2){
                
                System.out.printf("Total corriente de los recibos de ayer: $ %.2f%n%n", cargosTotales);
                
            }//Fin de opcion2
            
            else if(opcion == 3){
                
                System.out.println("PROGRAMA TERMINADO");
                break;
                
            }//Fin de opcion 3
            
            else{
                
                System.out.println("\n***DATO ERRONEO***\n");
                
            }//Fin de else
            
            }//Fin de while
            
        } //Fin de metodo main
        
        
    public static double calcularCargos(double horas){
        
        double cargo = 2.00;
        
        if(horas <= 3)
            cargo += 0.00;
        
        else if(horas == 24 || Math.ceil(horas) == 24)
            cargo = 10.00;
        
        else
            cargo += (Math.ceil(horas) - 3) * 0.50;
        
        cargosTotales += cargo;
        System.out.printf("Cargo para cliente actual: $ %.2f", cargo);
        System.out.printf("%nTotal corriente de los recibos de ayer:$ %.2f%n%n", cargosTotales);
        
        return cargo;
        
    }//Fin metodo calcularCargos

}
