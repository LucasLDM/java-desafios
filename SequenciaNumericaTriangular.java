public class SequenciaNumericaTriangular {
    
    public static int triangulo(int n){

        // Fórmula para calcular a sequência triangular
        return (n * (n + 1)) / 2;

    }

    public static void main(String[] args) {
        System.out.println(triangulo(215));
    }

}
