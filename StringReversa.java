public class StringReversa {
    
    public static void main(String[] args) {
        
        String texto = "Waddle Dee";

        StringBuilder sbObject = new StringBuilder();

        sbObject.append(texto);

        System.out.println("String Reversa: " + sbObject.reverse());

    }

}
