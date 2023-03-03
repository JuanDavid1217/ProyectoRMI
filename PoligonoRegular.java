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
public class PoligonoRegular extends UnicastRemoteObject implements InterfaceRemota{
    private Scanner leer=new Scanner(System.in);
    
    public PoligonoRegular() throws RemoteException{
        super();
    }
    @Override
    public double calculararea(int nlados, double lado) {
        double area=0;
        switch (nlados){
                case 3:
                    area=(lado*apotema(lado))/2;
                    break;
                case 4:
                    area=Math.pow(lado, 2);
                    break;
                default:
                    area=((nlados*lado)*apotema(lado))/2;
        }
        return area;
        //Aqui pon los datos para calcular el area del poligono regular
        
    }
    public double apotema(double lado){
        double a= lado/2;
        double apotema=Math.sqrt(Math.pow(lado, 2)-Math.pow(a, 2));
        return apotema;
    }

    @Override
    public double calculararea(double radio) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculararea(double a, double b, double c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
