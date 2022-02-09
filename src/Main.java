import java.util.Scanner;

public class Main {
    final static boolean PLAYING = true;

    public static void main(String[] args) {
        Player player1 = new Player(askForName(), 0);
        SecretWord secret = new SecretWord(secret.getRandom(SecretWord.WORDS));
        MyWord myWord = new MyWord(secret.getWord());
        while (player1.isPlaying()) {
            printProgress(myWord, player1);
            chooseLetter(player1);
            checkLetter(myWord,secret,player1);
            checkIfPlayerContinue();
        }

    }

    private static void checkLetter(MyWord myWord, SecretWord secret, Player player1) {
        for (int i = 0; i < secret.getWord().length(); i++) {
            if(secret.getWord().charAt(i)==player1.getLetter()) {
                myWord.setLetterOfWord(player1.getLetter(), i);
            }
        }
    }

    private static void chooseLetter(Player player1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una letra");
        player1.setLetter(sc.next());
    }

    private static void printProgress(MyWord myWord, Player player1) {
        System.out.println(myWord.getWord());
        System.out.println("Tienes " + player1.getNumAttempts() + " intentos");
    }

    private static String askForName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        return sc.next();


    }

    private static void generateSecretWord() {

    }
}
}
