import java.lang.Math;

public class Practice1 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your final Score was " + highScore);

        score = 10000;
        levelComplete = 8;
        bonus = 200;


        highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your final Score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Kristaps", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Diana", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Sandra", highScorePosition);

    }


    public static int calculateScore
            (boolean gameOver, int score, int levelComplete, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }


    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " is at highscore position: " + highScorePosition + " On the highscore table!");

    }

    //PW2


}
