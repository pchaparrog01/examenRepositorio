/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examenUT4;
/**
 * 
 * @author <b>Prudencio Chaparro Gonzalez</b>
 * @version <i>Examen de 08/03/2018.</i>
 *
 */

public class CCuenta {
	/**
	 * Atributos
	 */
	/**
	 * nombre: Introduce de la cuenta.
	 */

    private String nombre;
    /**
     * cuenta: Indica el tipo de cuenta.
     */
    private String cuenta;
    /**
     *saldo: indeca la cantidad de dinero que tiene la cuenta
     */
    private double saldo;
    /**
     * tiposInteres: Indica el tanto porciento de interes que tienes que solucionar.
     */
    private double tipoInteres;
/**
 * CCuenta: Constructores sin parametros
 */
    public CCuenta()
    {
    }
/**
 * CCuenta:Constructores con parametros
 * @param nom es el nombre de la cuenta
 * @param cue que cuenta tienes creado.
 * @param sal indca el salario cuenta que tienes
 * @param tipo indica el tipo de cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Sett and get Nombre.
 */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }

/**
 * estado es el metodo que te dice como esta tu estado en la cuenta.
 * @return saldo
 */
    public double estado()
    {
        return saldo;
    }// fin

/**
 * ingresar: es el metodo que permite ingresar que permite ingresar dienro en el saldo.
 * @param cantidad
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }//Fin
/**
 * retirar: Este metodo permite retirar el dinero de tu cuenta en el saldo.
 * @param cantidad
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }//fin

/**
 * obtenerCuenta: te retorna cuenta 
 * @return cuenta
 */
 
    public String obtenerCuenta()
    {
        return cuenta;
    }

/**
 * Gett and Set de nombre.
 */
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
 * Gett and Set de Tipo de interes
 */
    public double getTipoInteres() {
        return tipoInteres;
    }


    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
