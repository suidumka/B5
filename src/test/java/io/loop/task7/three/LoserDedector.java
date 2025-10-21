package io.loop.task7.three;

public class LoserDedector {

    public static void checkScore(int score) throws LoserException {

        if (score < 50) {
            throw new LoserException("You are a loser");
        }else {
            System.out.println("You are a winner");
        }
    }


    public static void main(String[] args) {

        try {
            checkScore(55);
            checkScore(44);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
