/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author juand
 */
public class Servidor {
    private static final int PUERTO = 1100;
    public Servidor(){
        
        try{
            /*System.setProperty(
                    "java.rmi.server.codebase",
                    "25.36.199.132"
            );*/
            
            Registry registry = LocateRegistry.createRegistry(PUERTO);
            
            InterfaceRemota circulo=new Circulo();
            InterfaceRemota PoligonoR=new PoligonoRegular();
            InterfaceRemota PoligonoI=new TriangulosIrregulares();
            
            Naming.rebind("25.36.199.132/Circulo", circulo);
            Naming.rebind("25.36.199.132/PoligonoR", PoligonoR);
            Naming.rebind("25.36.199.132/PoligonoI", PoligonoI);
            
            System.out.println("Servidor Iniciado...");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws RemoteException{
        new Servidor();
        
    }
}
