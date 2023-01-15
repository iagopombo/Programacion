package primero;
  import java.util.Scanner;
public class Primero{
  public static void main (String [] args){
    Scanner entrada = new Scanner (System.in);
		int numero = 0;
		System.out.println("Hoy es lunes");
		System.out.print("Teclea un número: ");
		numero = entrada.nextInt();
		System.out.println("El número introducido es: " + numero);
		entrada.close();
  }
}
