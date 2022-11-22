public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public char[] toArray(){
        char[] wordArray = new char[this.getWord().length()];
        for (int i = 0; i < word.length(); i++){
            wordArray[i] = word.charAt(i);
        }
        return wordArray;



    }
}







