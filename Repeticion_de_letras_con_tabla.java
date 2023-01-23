import java.util.Scanner;
public class Repeticion_de_letras_con_tabla{
    static String crearFrase(Scanner sc){
        String frase = null;
        char f = new char (frase.length());
        do{
            System.out.print("Teclee una cadena (máx. 30) => ");
                sc.nextLine();
        }while(c.length() > 30);
        return f;
    }
    static int invertirCadena{

    }
    static void contarCoincidencias(String cad1, String cad2, int c = []){
        int i = 0;
        char c1 = '', c2 = '';
        for(i = 0; i < cad.length(); i++){
            c1 = cad1.charAt(i);
            c2 = cad2.charAt(i);
            if (c1 == c2){
                c[0]++;
                if (Character.isLetter(c1)){
                    c[1]++;
                    else
                        if(Character.Digit(c1))
                            c[2]++;
                            else
                                c[3]++;
                }
            }
        }
    	/*Con el primer if contamos el total de caracteres que se repiten, luego con el segundo if contamos si es letra, sino, comprobamos si es número y si no sabemos que pertenece a otros*/
	static char teclearCaracter(){
		
	}
	static boolean comprobarCaracter(String cad, char c){
	boolean existe = false;
	
	}
	static void visualizarCoincidencias(int v[]){
		System.out.print("\nCoincidencias \n=============\n");
		Systrem.out.print("Total\t\tNúmeros\t\tOtros\t\tLetras");
		for (int i = 0; i < ){
			
		}
	}
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		char f = new char [];
		int vc[] = (0,0,0,0);
		char c = ' ';
		String cadena1 = null;
		String cadena2 = null;
		cadena1 = crearFrase(sc);
		cadena2 = invertirCadena(cadena1);
		visualizarCadenas(cadena1, cadena2);
		contarCoincidencias(cadena1,cadena2,vc);		visualizarCoincidencias(vc);
		c = teclearCaracter;
		if(comprobarCaracter(cadena1,c))
			System.out.println("\nEl caracter " + c + " SI")
	}
}
