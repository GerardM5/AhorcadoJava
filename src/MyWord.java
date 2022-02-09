public class MyWord {
    String word = "";// StringBuilder

    public MyWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            this.word += "_";
        }
    }

    public String getWord() {
        return word;
    }

    public String setLetterOfWord(char letter, int letterPosition) {
        word.
                word.charAt(letterPosition) = letter;
        return word;
    }


}
