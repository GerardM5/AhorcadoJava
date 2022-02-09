public class MyWord {
    StringBuilder word = new StringBuilder();

    public MyWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            this.word.append('_');
        }
    }

    public StringBuilder getWord() {
        return word;
    }

    public StringBuilder setLetterOfWord(char letter, int letterPosition) {
            word.insert(letterPosition, letter);
        return word;
    }


}
