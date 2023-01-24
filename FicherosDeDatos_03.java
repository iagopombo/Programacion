import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class FicherosDeDatos_03 {
    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        String texto="", linea ="";
        int car=' ';
        try {
        	BufferedWriter grabar = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\OneDrive\\Escritorio\\OneDrive\\1ºDAM CPR AFUNDACIÓN\\Programación DAM-1\\ficherodedatos3.txt",false));
        	System.out.print("Teclear texto a grabar: ");
        	texto=e.nextLine();
        	while (!texto.equals("*")) {
        		grabar.write(texto);
        		grabar.newLine();
        		texto=e.nextLine();
        	}
        	grabar.close();
        }catch(IOException ioe){
            System.out.print(ioe.getMessage());
        }
        try {
        	BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\Usuario\\OneDrive\\Escritorio\\OneDrive\\1ºDAM CPR AFUNDACIÓN\\Programación DAM-1\\ficherodedatos3.txt"));
        	System.out.print("Teclear texto a grabar: ");
        	texto=e.nextLine();
        	while (linea != null) {
                System.out.print(linea);
                linea = leer.readLine();
        	}
        	leer.close();
        }catch(IOException ioe){
        System.out.print(ioe.getMessage());
    	}
	}
}
