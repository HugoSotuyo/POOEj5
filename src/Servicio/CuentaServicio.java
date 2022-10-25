/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author hdsot
 */
public class CuentaServicio {
    Scanner leer = new Scanner (System.in);
    // metodo para crear un objeto cuenta pidiendo los datos 
    // al usuario
    public Cuenta crearCuenta(){
        int numCuenta;
        double saldoActual;
        long dni;
        Cuenta cuentaCliente = new Cuenta();
       
        System.out.println("Ingrese Numero de Cuenta ");
        numCuenta=leer.nextInt();
        System.out.println("Ingrese DNI ");
        dni=leer.nextLong();
        System.out.println("Ingrese Saldo Actual");
        saldoActual=leer.nextDouble();
        //lleno los datos de mi objeto
        cuentaCliente.setNumeroCuenta(numCuenta);
        cuentaCliente.setDni(dni);
        cuentaCliente.setSaldoActual(saldoActual);
        //retorno el objeto creado
        
        return cuentaCliente;
    }

    
    public double ingresar(double ingreso, Cuenta cuentaCliente) {
        double saldo=cuentaCliente.getSaldoActual();
        saldo = ingreso + saldo ;
        return saldo;
    }
    public double retirar(double retiro, Cuenta cuentaCliente) {
        double saldo=cuentaCliente.getSaldoActual();
        saldo = saldo-retiro ;
        return saldo;
    }
    public double extraccionRapida(Cuenta cuentaCliente) {
        double saldo=cuentaCliente.getSaldoActual();
        saldo = saldo*0.8 ;
        return saldo;
    }
}
