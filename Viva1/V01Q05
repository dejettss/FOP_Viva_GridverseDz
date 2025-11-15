import java.util.Scanner;

public class V01Q05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        int T = input.nextInt();

        for(int i = 0; i < T; i++){
            String word = input.next().toLowerCase();
                if(isHarmony(word)){
                    System.out.print("Harmony\t");
                }
                else{
                     System.out.print("Chaos\t");
                }
            }
        input.close();                    
        }

    static boolean isAdjacentVowel(char c){
        String vowel = "aeiou";
        return vowel.indexOf(c) != -1;
    }
    
    static boolean isHarmony(String word){
        if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u")) {
            return false;
        }
        else{
            for(int i = 0; i < word.length() - 1; i++){
                if(isAdjacentVowel(word.charAt(i)) && isAdjacentVowel(word.charAt(i + 1))){
                    return false;
                }
            }
        }
        return true;
    }
}
