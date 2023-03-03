/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package E1;
import java.rmi.*;
/**
 *
 * @author juand
 */
public interface InterfaceRemota extends Remote{
    
    public double calculararea(double radio)throws RemoteException;
    public double calculararea(int nlados, double lado)throws RemoteException;
    public double calculararea(double a, double b, double c)throws RemoteException;
}
