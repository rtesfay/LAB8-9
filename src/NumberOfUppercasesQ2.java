import java.util.Scanner;
import  java.lang.Character;
public class NumberOfUppercasesQ2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String sentence;
        sentence=keyboard.nextLine();
        boolean isUPPERCASE=false;
        int count=0;
        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i)>=65) && (sentence.charAt(i)<=90)){
                isUPPERCASE=true;
count++;
            }
          else if(sentence.equals(sentence.isEmpty())){
          isUPPERCASE=false;
          count=0;
          }
        }
    }
}
