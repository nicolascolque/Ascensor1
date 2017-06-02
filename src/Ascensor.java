
public class Ascensor 
	{
	  public static void main(String[] args) 
		 {
		
				Robot obj = new Robot();
				int	nropiso = 0, opcion = 0;
				 
				do {
					System.out.println("Ingrese si desea subir(1) o bajar(2) ");
					opcion= (int)obj.leer();
					int ultimopiso=nropiso;
					
					if (opcion == 1)
						{
							System.out.println("Ingrese el piso que desea ir");
							nropiso = (int)obj.leer();
							System.out.println("Cerrando puertas Cuidado");
											
							if(nropiso > ultimopiso && nropiso<=15)						
								for (int i = ultimopiso+1; i <=nropiso ; i++)
								  {
									System.out.println("Pasando por el piso nro "+i );
									ultimopiso=i;
								  }
							System.out.println("Usted esta en el piso nro "+nropiso);	
							System.out.println("Abriendo puertas Salga por favor");
								  
						}			
					if (opcion == 2)
						
						{
							System.out.println("Ingrese el piso que desea ir");
							nropiso = (int)obj.leer();
							System.out.println("Cerrando puertas Cuidado");
							if(nropiso < ultimopiso && nropiso>0)						
								for (int i = ultimopiso-1; i >=nropiso ; i--)
								  {
									System.out.println("Pasando por el piso nro "+ i);
									ultimopiso=i;
								  }	
							System.out.println("Usted esta en el piso nro "+nropiso);	
							System.out.println("Abriendo puertas Salga por favor");
						}
				
					
			} while (opcion < 3);	 
				System.out.println("Opcion erronea");
				
		}
	}


