import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player(askForName(), 0);
        SecretWord secret = new SecretWord();
        MyWord myWord = new MyWord(secret.getWord());
        while (player1.isPlaying()) playGame(myWord, player1, secret);
        printResult(secret, player1);
    }

    private static void playGame(MyWord myWord, Player player1, SecretWord secret) {
        printProgress(myWord, player1);
        chooseLetter(player1);
        checkLetter(myWord, secret, player1);
        checkIfPlayerContinue(myWord, secret, player1);
    }

    private static void printResult(SecretWord secret, Player player1) {
        if (player1.isWin()) System.out.println("HAS GANADO ");
        else System.out.println("HAS PERDIDO");
        System.out.println("La palabra correcta era " + secret.getWord() + ", lo has conseguido " + player1.getName());
    }

    private static void checkIfPlayerContinue(MyWord myWord, SecretWord secret, Player player1) {
        if (myWord.getWord().toString().equalsIgnoreCase(secret.getWord()) || player1.getNumAttempts() == 5) {
            player1.setPlaying(false);
            checkIfPlayerWin(player1, secret, myWord);
        }
    }

    private static void checkIfPlayerWin(Player player1, SecretWord secret, MyWord myWord) {
        if (myWord.getWord().toString().equalsIgnoreCase(secret.getWord())) player1.setWin(true);
    }

    private static void checkLetter(MyWord myWord, SecretWord secret, Player player1) {
        boolean isCorrect = false;
        for (int i = 0; i < secret.getWord().length(); i++) {
            if (secret.getWord().charAt(i) == player1.getLetter()) {
                myWord.setLetterOfWord(player1.getLetter(), i);
                isCorrect = true;
            }
        }
        if (!isCorrect) player1.sumAttempts();
    }

    private static void chooseLetter(Player player1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una letra");
        player1.setLetter(sc.next());
    }

    private static void printProgress(MyWord myWord, Player player1) {
        System.out.println(myWord.getWord());
        System.out.println("Tienes " + player1.getNumAttempts() + " errores");
    }

    private static String askForName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        return sc.next();


    }
}

