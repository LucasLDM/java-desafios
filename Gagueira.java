public class Gagueira {

    public static String gagueira(String txt){

        String primeira2Letras = txt.substring(0, 2);
        return primeira2Letras+"... " + primeira2Letras+"... " + txt+"?";
    }

    public static void main(String[] args) {
        System.out.println(gagueira("formiga"));
    }
}
