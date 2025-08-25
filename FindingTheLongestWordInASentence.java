public class FindingTheLongestWordInASentence {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println("The longest word in the sentence is: " + longestWord);
    }
}
