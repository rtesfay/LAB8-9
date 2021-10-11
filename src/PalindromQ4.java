import java.util.Scanner;

public class PalindromQ4 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String sentence;
        char c;
        boolean isPalindrom=false;
        sentence=keyboard.nextLine();
        System.out.println("Enter a sentence");

                for(int i=sentence.length()-1;i>=0;i--) {
			System.out.print(sentence.charAt(i));
		}

                for(c= sentence.charAt(int length); c>= sentence.char At(int length); c--) {
     System.out.print(c );

int i;
     if ((sentence.charAt(i)).equalsIgnorecase(sentence.charAt(c))){
         isPalindrom=true;
         System.out.println("Sentence is Palindrom ");

     }
     else if(sentence.charAt(i).equals(sentence.isEmpty())) {

         System.out.println("STOP");
     }
}

                
            }
            
        }


