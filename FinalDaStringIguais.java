public class FinalDaStringIguais {

    public static boolean checarFinal(String txt, String txtFinal){

        if(txt.endsWith(txtFinal)){ return true;}

        return false;

    }

    public static void main(String[] args) {
        System.out.println(checarFinal("feminine", "nine"));
    }
}
