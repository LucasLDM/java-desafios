public class Descontos {

    public static float desconto(int preco, int desc){
        
        // Cálculo do desconto
        return preco - (preco * desc) / 100;
    }
    
    public static void main(String[] args) {
        System.out.println(desconto(89, 20));
    }
    
}
