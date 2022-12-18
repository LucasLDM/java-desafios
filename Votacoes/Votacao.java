package Votacoes;

public class Votacao {
    
    public static void main(String[] args){

        Votos c = new Votos();
        Votos u = new Votos();
        Votos d = new Votos();

        // "Setando" valores para os upvotes e downvotes
        u.setUpvote(13);
        d.setDownvote(24);

        System.out.println("Upvotes: " + u.getUpvote());
        System.out.println("Downvotes: " + d.getDownvote());
        System.out.println("Contagem de votos: " + c.contaVotos(u.getUpvote(), d.getDownvote()));
    
    }

}
