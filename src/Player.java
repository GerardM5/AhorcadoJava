public class Player {
    private String name;
    private int numAttempts;
    private char letter;
    private boolean playing = true;
    private boolean win = false;

    public Player(String name, int numAttempts) {
        this.name = name;
        this.numAttempts = numAttempts;
    }


    public char getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter.charAt(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumAttempts() {
        return numAttempts;
    }

    public void setNumAttempts(int numAttempts) {
        this.numAttempts = numAttempts;
    }

    public void sumAttempts() {
        this.numAttempts++;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
