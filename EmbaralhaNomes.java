import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class EmbaralhaNomes {

    public static void embaralharNomes(String nome){

        // 1. Criando um array de strings que vai receber os nomes assim que o usuário apertar a barra de espaço.
        String partes[] = nome.split(" ");
        // 2. Da classe Collections, usei o método shuffle para embaralhar e dentro dele transformei o array "partes[]" em uma lista estática.
        // Ou seja, não vou poder adicionar nem remover algo dela. No caso vai embaralhar apenas os nomes que passei, e nada mais.
        Collections.shuffle(Arrays.asList(partes));
        // 3. Mostrei o nome embaralhado mas usando o método toString da classe Arrays, pra que não mostre o endereço do array e sim o que tem dentro dele.
        System.out.println(Arrays.toString(partes));

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um nome qualquer: ");
        String nome = scan.nextLine();

        embaralharNomes(nome);

        scan.close();
    }
}
