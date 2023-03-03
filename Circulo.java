/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.Scanner;
/**
 *
 * @author juand
 */
public class Circulo extends UnicastRemoteObject implements InterfaceRemota{
    private double radio=0;
    private Scanner leer=new Scanner(System.in);
    
    public Circulo() throws RemoteException{
        super();
    }
    @Override
    public double calculararea(double radio) {
        return Math.PI*(Math.pow(radio, 2));
    }
    
    @Override
    public double calculararea(int nlados, double lado) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double calculararea(double a, double b, double c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
