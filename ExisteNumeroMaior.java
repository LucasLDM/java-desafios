public class ExisteNumeroMaior {
    
    public static boolean procuraNumero(int numeros[], int num){

        for(int n : numeros){

            if(n >= num){
                return true;
            }

        }

        return false;

    }

    public static void main(String[] args) {
        
        int numeros[] = {1,3,5,7};

        System.out.println(procuraNumero(numeros, 9));

    }

}
