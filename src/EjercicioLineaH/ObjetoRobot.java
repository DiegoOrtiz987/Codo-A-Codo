package EjercicioLineaH;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ObjetoRobot {

	public boolean pedirNuevamente=true; 
	
	public int Leer ()
	{
		String  valorObtenido;
		int valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			valorConvertido = Integer.parseInt(valorObtenido);
			pedirNuevamente= false; 
			if (valorConvertido<=0) {
				System.out.println("	MENSAJE: El numero ingresado debe ser mayor a Cero(0).");
				System.out.println("                 *****************************         \n");
				pedirNuevamente = !pedirNuevamente;
			}
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorConvertido;
	}
	
	public int Leer2 ()
	{
		String  valorObtenido;
		int valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			valorConvertido = Integer.parseInt(valorObtenido);
			pedirNuevamente= false; 
			if (valorConvertido<=0 || valorConvertido>2 ) {
				System.out.println("	MENSAJE: El numero ingresado no corresponde a ninguna de las opciones propuestas.");
				System.out.println("                                  *****************************         \n");
				pedirNuevamente = !pedirNuevamente;
			}
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero valido.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorConvertido;
	}
	

	public float Leer3 ()
	{
		String  valorObtenido;
		float valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			valorConvertido = Float.parseFloat(valorObtenido);
			pedirNuevamente= false; 
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorConvertido;
	}
	
	

	// Leer Texto
	public String Leer4 ()
	{
		String  valorObtenido="";
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			
			pedirNuevamente= false; 
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}	
		return valorObtenido;
	}
	

	public int LeerEstacion ()
	{
		String  valorObtenido;
		int valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido = leo.readLine();
			valorConvertido = Integer.parseInt(valorObtenido);
			pedirNuevamente= false; 
			if (valorConvertido<=0 || valorConvertido>11 ) {
				System.out.println("	MENSAJE: El numero ingresado no corresponde a ninguna de las estaciones");
				System.out.println("                 *****************************         \n");
				pedirNuevamente = !pedirNuevamente;
			}
		    
		} catch (NumberFormatException nf) {
			System.out.println("	MENSAJE: El valor ingresado no corresponde a un numero.");
			System.out.println("                      *****************************         \n");
			pedirNuevamente= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente= true;
		}
		
		return valorConvertido;
	}
	
	
	
}
