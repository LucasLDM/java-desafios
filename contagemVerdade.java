public class contagemVerdade {

    // 2. Criando método que mostra a quantidade de "true" em um array de booleanos (boolean[])
    public static int contaTrue(boolean[] array){
        int cont = 0;

        // 3. Para cada item "b" do tipo boleano no array (que será a listaBool[])
        for(boolean b : array){
            if(b == true){
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args){
        
        // 1. Criando um array do tipo boolean
        boolean listaBool[] = {true, false, true};

        System.out.println(contaTrue(listaBool));
    }
}
