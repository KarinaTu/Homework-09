public class Word {
    private String word;

    public Word() {
        //this.word = word;
    }
    public String getWord() {
        return word;
    }
    public char[] toArray(String sample){
        char[] wordArray = new char[sample.length()];
        for (int i = 0; i < sample.length(); i++){
            wordArray[i] = sample.charAt(i);
        }
        return wordArray;

    }
}







