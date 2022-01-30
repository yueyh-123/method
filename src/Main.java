public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Percy", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table ");
    }

    public static int calculateHighScorePosition(int playerScore) {
//写法1：
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }
// 写法2： 删除判断中的冗余代码
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
//写法3：只使用一个 return 语句

        int positon = 4; //assuming position 4 will be returned
        if (playerScore >= 1000) {
            positon = 1;
        } else if (playerScore >= 500) {
            positon = 2;
        } else if (playerScore >= 100) {
            positon = 3;
        } else {
            positon = 4;
        }

        return positon;

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

}
