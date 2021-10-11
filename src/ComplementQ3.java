import java.util.Scanner;

public class ComplementDNAQ3 {
            public static void main(String[] str) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter DNA strand");
                String strandDNA = scan.next();
                do {
                    int length = strandDNA.length();
                    char[] complement = new char[length];
                    for(int i=0; i<strandDNA.length(); i++) {
                        char nextChar = strandDNA.charAt(i);
                        if( nextChar== 'A') {
                            complement[i] = 'T';
                        }
                        else if( nextChar== 'T') {
                            complement[i] = 'A';
                        }
                        else if( nextChar== 'G') {
                            complement[i] = 'C';
                        }
                        else if( nextChar== 'C') {
                            complement[i] = 'G';
                        }
                        else {
                            complement[i] = nextChar;
                        }
                    }// end of for loop
                    System.out.println("The complement of the DNA strand is:");
                    for(int i=0; i<complement.length; i++) {
                        System.out.print(complement[i]);
                    }
                    System.out.println("\n Enter DNA Strand Again ... ");
                    strandDNA = scan.next();
                }while(!strandDNA.equals(""));
                System.out.println("END! You entered empty string.");
            }
        }


    }
}
