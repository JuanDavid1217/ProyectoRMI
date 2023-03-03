/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author juand
 */
public class TriangulosIrregulares extends UnicastRemoteObject implements InterfaceRemota{
    //añade las caracteristicas del poligono irregular
    public TriangulosIrregulares() throws RemoteException{
        super();
    }
    
    
        
    
//        System.out.println("Solo se calculan areas de triangulos irregulares");
//        double lados[]=new double[3];
//        Scanner leer=new Scanner(System.in);
//        for(int i=0; i<3; i++){
//            System.out.println("Ingresa el valor para el lado "+(i+1)+":");
//            lados[i]=leer.nextDouble();   
//            
//        }
//        
//        Arrays.sort(lados);
//        
//        
//        if ((lados[0]+lados[1])>lados[2]){
//            double area=(2/lados[0])*(Math.sqrt(((lados[0]+lados[1]+lado[2])/2)*((lado[0]+lado[1]+lado[2])-lado[0])*((lado[0]+lado[1]+lado[2])-lado[1])*((lado[0]+lado[1]+lado[2])-lado[2])));
//        }else{
//            System.out.println("No se puede formar un triangulo");
//        }
//        return true;
    

    @Override
    public double calculararea(double radio) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculararea(int nlados, double lado) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculararea(double a, double b, double c) {
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
