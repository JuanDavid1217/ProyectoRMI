/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;

import java.util.Scanner;
import java.rmi.*;
import java.util.Arrays;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author juand
 */
public class Cliente {
    Scanner leer=new Scanner(System.in);
    private static final String IP = "25.36.199.132"; // Puedes cambiar a localhost
    private static final int PUERTO = 1100;
    public void menu() throws RemoteException{
        Registry registry = LocateRegistry.getRegistry(IP, PUERTO);
        try{
            System.out.println("Selecciona una Opcion:\n1)Circulo\n2)Poligono Regular\n3)Poligono Irregular\nSalir");
            int pase=leer.nextInt();
            switch(pase){
                case 1:
                    Circulo();
                    break;
                case 2:
                    PoligonoRegular();
                    break;
                case 3:
                    PoligonoIrregular();
                    break;
                default:
                    System.out.println("Saliendo...");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Circulo(){
        try{
            InterfaceRemota circulo=(InterfaceRemota)Naming.lookup("25.36.199.132/Circulo");
            System.out.println("Ingresa el radio del Circulo: ");
            double radio=leer.nextDouble();
            if (radio>=0){
                System.out.println("El área del circulo es: "+circulo.calculararea(radio)+" unidades.");
            }else{
                System.out.println("No se aceptan valores negativos");
            }
        }catch(Exception e){
                e.printStackTrace();
        }
    }
    
    public void PoligonoRegular(){
        try{
            InterfaceRemota poligonoR=(InterfaceRemota)Naming.lookup("25.36.199.132/PoligonoR");
            System.out.println("Ingresa e numero de lados del poligono: ");
            int nlados=leer.nextInt();
            if(nlados>=3){
                System.out.println("Ingresa el valor de 1 lado del poligono: ");
                double lado=leer.nextDouble();
                if(lado>0){
                    System.out.println("El area del poligono regular es de: "+poligonoR.calculararea(nlados, lado));
                }else{
                    System.out.println("No se aceptan valores menores o iguales a 0");
                }
            }else{
                System.out.println("No se puede formar ningun poligono");
            }
            
        }catch(Exception e){
                e.printStackTrace();
        }
    }
    
    public void PoligonoIrregular(){
        try{
            double lados[]=new double[3];
            InterfaceRemota poligonoI=(InterfaceRemota)Naming.lookup("25.36.199.132/PoligonoI");
            double lado=0;
            System.out.println("Solo se calcula el area de triangulos");
            for(int i=0; i<3; i++){
                do{
                    System.out.println("Ingresa el valor para el lado "+(i+1)+": ");
                    lado=leer.nextDouble();
                    if (lado>=1){
                        lados[i]=lado;
                    }else{
                        System.out.println("No se aceptan valores negativos o iguales a 0.");
                    }
                }while(lado<=0);
            }
            
            Arrays.sort(lados);
            if((lados[0]+lados[1])>lados[2]){
                if((lados[0]==lados[1] && lados[1]!=lados[2])||(lados[0]!=lados[1] && lados[1]==lados[2])||(lados[0]!=lados[1] && lados[1]!=lados[2])){
                    System.out.print("El area del triangulo irregular es: "+poligonoI.calculararea(lados[0], lados[1], lados[2]));
                }else{
                    System.out.println("El triangulo ingresado es equilatero (no irregular).");
                }       
            }else{
                System.out.println("No se puede crear un tringulo con los datos ingresados.");
            }
            
        }catch(Exception e){
                e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws RemoteException{
        new Cliente().menu();
    }
}
