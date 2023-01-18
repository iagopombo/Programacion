import java.util.Scanner;
public class Intercalar_cadenas{
	static void menu(Scanner sc){
		int o = 0;
		System.out.print("\t\t\tMENÚ\n\t\t====");
		System.out.print("\n1.- Teclear cadena.");
		System.out.print("\n2.- Intercalar cadena.");
		System.out.print("\n3.- Visualizar cadena.");
		System.out.print("\n4.- Fin.");
		do{
			System.out.print("Seleccione una opción (1-4) => ");
				sc.nextInt();
		}while (o < 1 || o > 4);
	}	
	static String teclearCadena(Scanner sc){
		String cadena = "";
		do{
		System.out.print("Teclee la primera cadena => ");
			cadena = sc.nextLine();
		}while(cadena.length() < 12);	
		return cadena;	
	}
	static String intercalarCadenas(String fr1, String fr2){
		System.out.print("La longitud de la primera cadena es => " + fr1.length());
		System.out.print("La longitud de la segunda cadena es => " + fr2.length());
		int i1 = 0, i2 = fr2.length();
		String inter = "";
		Boolean fc1 = false, fc2 = false;
		while(!fc1 || !fc2){
			if(i1 < fr1.length() && !fc1)
			inter += fr1.charAt(i1++);
			else	
				fc1 = true;
			if(i2 >= 0 && !fc2)
				inter += fr2.charAt(i2–);
				else 
				fc2 = true;
		}
		return inter;
	} 
	static void visualCadena (String inter){
		System.out.print("Frase intercalada => " + inter);
	}
	static void fin(){
		System.out.print("\n\n\t\tFIN DEL PROGRAMA");
	}
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		String fr1 = "", fr2 = "", inter = "";
		int o = 0;
		switch (o){
			case 1:
				fr1 = teclearCadena(sc);
				fr2 = teclearCadena(sc);
				System.out.print("La primera cadena es => " + fr1 + " \nLa segunda cadena es => "+ fr2);
				break;
			case 2: 
				inter = intercalarCadenas(fr1,fr2);
				break;
			case 3:
				visualCadena(inter);
				break;
				default:
					fin();
		}
	}
}
