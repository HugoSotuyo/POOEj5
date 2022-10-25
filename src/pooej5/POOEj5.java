/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class POOEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ingreso,retiro;
        double saldoAct;
        int opcion;
        String salir = "N";
        Scanner leer=new Scanner(System.in);
        
        CuentaServicio cuent = new CuentaServicio();
        Cuenta cuenta = cuent.crearCuenta();
        
        do{
        
        System.out.println("MENU");
        System.out.println("1.Ingresar");
        System.out.println("2.Retirar");
        System.out.println("3.Extraccion Rapida 20% del Saldo Actual");
        System.out.println("4.Consultar Saldo");
        System.out.println("5.Mostrar Datos");
        System.out.println("6.Salir");
        
        System.out.println("Elija una operacion de el MENU");
        opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Indique el monto a Ingresar");
                    ingreso = leer.nextDouble();
                    saldoAct = cuent.ingresar(ingreso, cuenta);
                    cuenta.setSaldoActual(saldoAct);
                    System.out.println("El SALDO actual es= " + cuenta.getSaldoActual());
                    break;
                case 2:
                    System.out.println("Indique el monto a Retirar");
                    retiro = leer.nextDouble();
                    saldoAct = cuent.retirar(retiro, cuenta);
                    cuenta.setSaldoActual(saldoAct);
                    System.out.println("El SALDO actual es= " + cuenta.getSaldoActual());
                    break;
              case 3:
              saldoAct = cuent.extraccionRapida(cuenta);
              cuenta.setSaldoActual(saldoAct);
              System.out.println("El SALDO actual es= " + cuenta.getSaldoActual());
              break;
              case 4:
              System.out.println("El SALDO actual es= " + cuenta.getSaldoActual());
              break;
              case 5:
                  System.out.println("Numero de Cuenta : " + cuenta.getNumeroCuenta());
                  System.out.println("DNI : "+ cuenta.getDni());
                  System.out.println("Saldo Actual : " + cuenta.getSaldoActual());
              break;
              case 6:
              System.out.println("¿Esta seguro que desea salir del programa S/N?");
              salir = leer.next();
              break;
            
            }
            
          } while (salir.equalsIgnoreCase("N"));
         
        //saldo=cuent.ingresar(0, cuenta)
    }
    
}
