package Votacoes;

public class Votos {

    private int upvote;
    private int downvote;

    // UPVOTES
    public int getUpvote(){
        return upvote;
    }

    public void setUpvote(int upvote){
        this.upvote = upvote;
    }

    // DOWNVOTES
    public int getDownvote(){
        return downvote;
    }

    public void setDownvote(int downvote){
        this.downvote = downvote;
    }

    public static void main(String[] args) {
        
    }

    public int contaVotos(int upvote, int downvote){

        return upvote - downvote;

    }
}
