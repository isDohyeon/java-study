package level4.cardgame;

public class CardGameMain {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어 1");
        Player player2 = new Player("플레이어 2");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        Player winner = getWinner(player1, player2);
        if (winner != null) {
            System.out.println(winner.getName() + " 승리");
        } else {
            System.out.println("무승");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        int rankSum1 = player1.rankSum();
        int rankSum2 = player2.rankSum();

        return rankSum1 > rankSum2 ? player1 : (rankSum1 == rankSum2 ? null : player2);
    }
}
