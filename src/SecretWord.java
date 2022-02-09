public class SecretWord {
    public static final String[] WORDS = new String[]{"Tobillo", "Juego", "Eje", "Escritura", "Diputados", "Genio", "Cepo", "Manta", "Coma", "Borla"};
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