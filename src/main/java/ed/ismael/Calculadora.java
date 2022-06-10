package ed.ismael;

import java.util.InputMismatchException;

/**
 * Esta clase se utiliza como calculadora y poder realizar cuatro tipos de operaciones.
 * <p>
 * En esta clase hay cuatro metodos donde reciben dos parametros de tipo int y realizan unas operaciones, estan los metodos
 *  que suman, restan, multiplican y dividen dichos parametros y devuelven sus resultados.
 *
 * @author Ismael Marcos Díaz
 * @version 2.5
 * @since Disponible desde la version 1.9 Juny de 2019
 *
 **/
public class Calculadora {

	/**
	 * Devuelve un numero entero resultado de la suma entre dos enteros recibidos por el metodo.
	 *
	 * @param a es una variable de tipo entero recibida como parametro
	 * @param b es una variable de tipo entero recibida como parametro
	 * @return Entero resultado de la suma entre los parametros a y b
	 * @throws InputMismatchException cuando reciba un parametro que no corresponga con el tipo de variable que recibe
	 * @throws NullPointerException cuando reciba un parametro que sea nulo como el valor de una posicion de un
	 * array nulo (Cannot load from int array because "a" is null)
	 */
	public int suma(int a, int b) {
		return a + b;
	}

	/**
	 * Devuelve un numero entero resultado de la resta entre dos enteros recibidos por el metodo.
	 *
	 * @param a es una variable de tipo entero recibida como parametro
	 * @param b es una variable de tipo entero recibida como parametro que resta al volor de a
	 * @return Entero resultado de la resta entre los parametros a y b
	 * @throws InputMismatchException cuando reciba un parametro que no corresponga con el tipo de variable que recibe
	 * @throws NullPointerException cuando reciba un parametro que sea nulo como el valor de una posicion de un array nulo
	 * (Cannot load from int array because "a" is null)
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Devuelve un numero entero resultado de la multiplicacion entre dos enteros recibidos por el metodo.
	 *
	 * @param a es una variable de tipo entero recibida como parametro
	 * @param b es una variable de tipo entero recibida como parametro
	 * @return Entero resultado de la multiplicacion entre los parametros a y b
	 * @throws InputMismatchException cuando reciba un parametro que no corresponga con el tipo de variable que recibe
	 * @throws NullPointerException cuando reciba un parametro que sea nulo como el valor de una posicion de un array nulo
	 * (Cannot load from int array because "a" is null)
	 */
	public int multiplica(int a, int b){
		return a*b;
	}

	/**
	 * Devuelve un numero entero resultado de la division entre dos enteros recibidos por el metodo y si ese resultado es decimal lo
	 * transforma en un entero, eliminando los numeros decimales.
	 *
	 * @param a es una variable de tipo entero recibida como parametro que actua como dividendo
	 * @param b es una variable de tipo entero recibida como parametro que actua como divisor
	 * @return Entero resultado de la division entre los parametros a y b
	 * @throws InputMismatchException cuando reciba un parametro que no corresponga con el tipo de variable que recibe
	 * @throws NullPointerException cuando reciba un parametro que sea nulo como el valor de una posicion de un array nulo (Cannot load from int array because "a" is null)
	 * @throws ArithmeticException cuando el parametro b es cero y por lo tanto esa operacion no se puede realizar (/ by zero)
	 */
	public int diveix(int a, int b) {
		return a/b;
	}

	public int multiplicarNumeroNVeces(int numMultiplicador , int numeroVeces ){

		int numeroUno = 1;

		for ( int i = 0; i < numeroVeces ; i++ ){
			numeroUno = numeroUno * numMultiplicador;
		}

		return numeroUno;

	}

	public boolean comprobarNumeroPar(int numeroComprobar ){

		boolean resultadoComprobacion;

		if ( numeroComprobar % 2 == 0) {
			resultadoComprobacion = true;
		} else {
			resultadoComprobacion = false;
		}

		return resultadoComprobacion;

	}

	public String mostrarRestosNumero(int numeroDividendo) {

		String mensaje = "";
		int aux = numeroDividendo;
		int resto;

		while (aux > 0) {

			resto = aux % 2;

			mensaje = resto + mensaje;

			aux = aux / 2;


		}
		return mensaje;
	}


}
