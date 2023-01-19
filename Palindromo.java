import java.util.Scanner;
public class Palindromo {
    static String tecleaFrase (Scanner sc){
        System.out.print("Teclea una frase => ");
            String fr = sc.nextLine();
        return fr;
    }

    static String compPalindromo (String frase){
        int i1 = 0, i2 = frase.length()-1;
        boolean palin = true;
        String frase1 = frase.trim();
        for(i1=0; i1<frase1.length()-1; i1++){
                if (frase.charAt(i1) != frase.charAt(i2)){
                    palin = false;
                    i1 = frase.length()-1;
                }   
            i2–;
        }
        	
        if(palin == true)
            System.out.println(frase+" es palíndromo.");
            else
                System.out.println(frase+" no es palíndromo.");
        return frase;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String frase = "";

        frase = tecleaFrase(sc);
        compPalindromo(frase);
        sc.close();
    }  
}
