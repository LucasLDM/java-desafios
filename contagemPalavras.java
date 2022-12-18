import java.util.Arrays;
import java.util.Scanner;

public class contagemPalavras {

    static String texto;

    public static void contaPalavras(String txt){

        String partes[] = txt.split(" ");
        System.out.println(Arrays.toString(partes));

        int cont = 0;
        
        for(int i = 0; i < partes.length; i++){
            cont++;
        }
        System.out.printf("O seu texto tem %d palavras.", cont);

    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva algum texto!");
        texto = scan.nextLine();
        contaPalavras(texto);

        scan.close();
    }
}
