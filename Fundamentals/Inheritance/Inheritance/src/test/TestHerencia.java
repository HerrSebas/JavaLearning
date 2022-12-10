/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Date;

import domain.Cliente;
import domain.Empleado;

/**
 *
 * @author sebna
 */
public class TestHerencia {
    public static void main(String[] args) {
        /* Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1); */

        Cliente cliente1 = new Cliente(new Date(), true, "Sebas", 'M', 24, "SECUOYAS 35");

        System.out.println("cliente1 = " + cliente1);

    }
}
