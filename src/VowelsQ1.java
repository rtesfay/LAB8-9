import java.util.Scanner;

public class VowelsQ1 {
    public static void main(String[] args) {
        String sentence;
        Scanner keyboard=new Scanner(System.in);
        sentence=keyboard.nextLine();
        int count=0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u');
            count++;
            System.out.println("There are: "+count+ "vowels in the sentence");
            if (sentence.charAt(i)==' ');
            count=0;
            System.out.println(" The sentence is empty");

        }
    }
}
