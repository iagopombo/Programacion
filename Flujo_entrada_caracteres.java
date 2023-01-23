import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Flujo_entrada_caracteres {
    public static void main (String[]args){
        int car = 0;
        String texto = null;
        try{
            FileWriter esc = new FileWriter("C:\\Users\\Profesor\\JavaDAM_1\\textoprueba.txt,false");
            System.out.print("Teclear texto a grabar: ");
            car = (char)System.in.read();
            while (car != '*'){
                esc.write(car);
                car = (char) System.in.read();
            }
            esc.close();
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        System.out.print("Fin de proceso de escritura.");
        texto = "";
        try{
            FileReader in = new FileReader("C:\\Users\\Profesor\\JavaDAM_1\\textoprueba.txt,true");
            car = in.read();
            while(car != -1){
                texto += (char) car;
                System.out.print((char) car);
                car = in.read();
            }
            System.out.print("Texto leído caracter a caracter.");
            in.close();
        }catch(IOException ioe){
            System.out.print(ioe.getMessage());
        }
    }
}
