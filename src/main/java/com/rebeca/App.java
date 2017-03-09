package com.rebeca;


import java.io.*;
import java.util.*;

public class App{
	private BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
	private Vector<Versiculos> versiculosAdded=new Vector<Versiculos>();
	

    public static void main( String[] args ) throws IOException
    {
    	  System.out.println("");
    	  System.out.println("Uno de los regalos que Dios nos ha dado es su palabra en forma de la Biblia. En ella podemos encontrar la verdad sobre Dios, consejos para el diario vivir y esperanza para mañana. Leerla es tan refrescante como tomarse un vaso de agua.");
    	  System.out.println("");
    	  App a = new App();
    	  a.menu();

    }

    public void menu() throws IOException{
		int opcion=0;
		do {	
			
			 System.out.println("");
			 System.out.println("==================================");
			 System.out.println("¿Cómo te sientes? Lee versiculos por sentimiento o emociones que sientes.");
			 System.out.println("1. Esperanza");
			 System.out.println("2. Fe");
			 System.out.println("3. Amor");
			 System.out.println("4. Animo");
			 System.out.println("5. Valentia");
			 System.out.println("6. Superar la tristeza");
			 System.out.println("7. Eliminar los celos");
			 System.out.println("8. Añadir Versiculo");
			 System.out.println("0. salir");
			 System.out.println("");
			 try{
				 System.out.println("Seleccione una opcion");
				 opcion=Integer.parseInt(teclado.readLine());
			 }catch (NumberFormatException e) {
				System.out.println("Debe introducir un numero de 0 a 6");
				opcion=-1;
			 }
			 
			 switch (opcion) {
			case 1:
				esperanza();
				break;
			case 2:
				fe();
				break;

			case 3:
				amor();
				break;

			case 4:
				animo();
				break;
			case 5:
				valentia();
				break;
			case 6:
				superarTristeza();
				break;
			case 7:
				eliminarCelos();
				break;
			case 8:
				addVersiculo();
				break;
			case 0:
				System.out.println("Dios te acompañe y guie. Ha salido del menú");
				break;
			default:
				System.out.println("Debe introducir un numero entre 0 y 4");
				break;
			}
		} while (opcion!=0);	
		
		
	}
    
    private void addVersiculo() throws IOException {
		Versiculos v = new Versiculos();
		v.pedirVersiculo();
		
		versiculosAdded.addElement(v);
		
	}
    
   

	private void amor() {
		Random rand = new Random();

        System.out.println(Versiculos.AMOR[rand.nextInt(Versiculos.AMOR.length)]);
    	
	}

	private void esperanza() {
    	Random rand = new Random();

        System.out.println(Versiculos.ESPERANZA[rand.nextInt(Versiculos.ESPERANZA.length)]);
    	
    
    }

	private void fe() {
		Random rand = new Random();

        System.out.println(Versiculos.FE[rand.nextInt(Versiculos.FE.length)]);
    	
		
	}
    
    private void animo() {
    	Random rand = new Random();

        System.out.println(Versiculos.ANIMO[rand.nextInt(Versiculos.ANIMO.length)]);
    	
		
	}

	private void valentia() {
		Random rand = new Random();

        System.out.println(Versiculos.VALENTIA[rand.nextInt(Versiculos.VALENTIA.length)]);
    	
		
	}

	private void eliminarCelos() {
		Random rand = new Random();

        System.out.println(Versiculos.DELETECELOS[rand.nextInt(Versiculos.DELETECELOS.length)]);
    	
		
	}

	private void superarTristeza() {
		Random rand = new Random();

        System.out.println(Versiculos.DELETETRISTEZA[rand.nextInt(Versiculos.DELETETRISTEZA.length)]);
    	
		
	}


    
    
		
}
