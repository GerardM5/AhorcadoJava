public class MyWord {
    StringBuilder word = new StringBuilder();

    public MyWord(String word) {
        this.word.append("_".repeat(word.length()));
    }

    public StringBuilder getWord() {
        return word;
    }

    public void setLetterOfWord(char letter, int letterPosition) {
        word.insert(letterPosition, letter);
    }


}
