import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Robot
{
	boolean pedirnuevamente = true;
	
	public float leer()
	{
		String valorleido = " ";
		float valorconvertido=0;
	try // trata de hacer
		{
			InputStreamReader io= new InputStreamReader(System.in);// BufferReader: Es una clase que es un buffer de lectura. y siver para almacenar datos de lectura,
			BufferedReader leer = new BufferedReader(io); //El inputStreamReader e es un flujo de entrada de datos, y se usa conjuntamente con el BufferReader para leer datos, ya sea del teclado, disco o red. 
			valorleido = leer.readLine();// lee el valor ingresado 
			valorconvertido = Float.parseFloat(valorleido);//aca se hace la conversion del texto ingresado a float
			
			pedirnuevamente=false;
					
		} 
	catch (NumberFormatException nf) // ingresa aca si es que hubo un error al tipeo o ingresaron un dato erroneo controla 
		{
			System.out.println("Disculpe Usted a Colocado un Valor Erroneo");
			pedirnuevamente= true;
			// TODO: handle exception
		}
	catch (Exception e)// aca muestra un error general
		{
			System.out.println("A Ocurrido un error General");
			pedirnuevamente= true;
			// TODO: handle exception
		}	
	return valorconvertido;
	}
	public String leertexto()
		{
			String valorobtenido = " ";
			
			try // trata de hacer
				
					{
						InputStreamReader io= new InputStreamReader(System.in);// Nombre del objeto de la clase imput
						BufferedReader leer = new BufferedReader(io); //crea la clase leer
						valorobtenido = leer.readLine();// lee el valor ingresado 		
						pedirnuevamente=false;
								
					} 
			catch (IOException objexception) // ingresa aca si es que hubo un error al tipeo o ingresaron un dato erroneo controla 
					{
						System.out.println("Disculpe ocurrio un Error");
						pedirnuevamente= true;
						// TODO: handle exception
					}
			catch (Exception e)// aca muestra un error general
					{
						System.out.println("A Ocurrido un Error General");
						pedirnuevamente= true;
						// TODO: handle exception
					}	
						return valorobtenido;
		}
public int[] ordenar(int[] arr)
	{
	Arrays.sort(arr);
	return arr;
	}
}
