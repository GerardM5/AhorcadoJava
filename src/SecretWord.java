public class SecretWord {
    public static final String[] WORDS = new String[]{"tobillo", "juego", "eje", "escritura", "diputados", "genio", "cepo", "manta", "coma", "borla"};
    private String word = "";

    public SecretWord() {
        this.word = getRandom(SecretWord.WORDS);
    }

    public String getRandom(String[] words) {
        String word = words[(int) (Math.random() * 10)];
        return word;
    }

    public String getWord() {
        return word;
    }


}