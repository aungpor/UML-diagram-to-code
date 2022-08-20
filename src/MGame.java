public class MGame {

    private int roundCount;
    private Die[] dice;
    private Board board;
    private Player[] players;
    private int N;
    public void playGame(){
        N = 20;
        for (roundCount=0 ; roundCount < N; roundCount++){
            playRound();
        }
    }

    private void playRound(){
        for (Player player: players){
            player.takeTurn();
        }
    }
}
