/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examenUT4;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;//Ejercico 1.He dado metodo miCuenta por cuenta1 de la siguiente forma
        //he dado clic derecho, nos vamos a la opcion refactor y pulsamos con el cursor 
       //en rename y ponemos cuenta1.
        double saldoActual;

        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 0);//Ejercicio 2 
        //Lo he creado de la siguiente forma, he señalado todo con el curso
        //las operaciones y luego he dado clic derecho refactor extract methodos
        
    }

	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		//Ejercicio 4 he añadido el parametro cuenta de la siguiente forma, he dado clic
		//derecho sobre operativa_cuenta y luego he ido ha refactor Change Methodo Signature...
		//Se te habre una pestaña donde tenemos que dar al boton de la derecha donde pone add
		//type le he puesto float, en name cantidad y el valor 0 y luego damos a siguiente.
		//Finalizar
		try {
            cuenta1.retirar(2300);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
		try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
