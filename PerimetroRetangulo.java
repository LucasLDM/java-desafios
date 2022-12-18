public class PerimetroRetangulo {

    public static int calculaPerimetro(int larg, int alt){
        return (2*larg) + (2*alt);
    }

    public static void main(String[] args) {
        System.out.println(calculaPerimetro(2,9));
    }
}
