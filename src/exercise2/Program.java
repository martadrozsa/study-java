package exercise2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phraseA = sc.nextLine();
        System.out.print("Enter number b: ");
        String phraseB = sc.nextLine();

        int biggest = biggestSentence(phraseA, phraseB);

        System.out.println(biggest);
        sc.close();

    }

    public static int biggestSentence(String phraseA, String phraseB) {
        if(phraseA.length() > phraseB.length()) {
            return 1;
        } else if (phraseA.length() == phraseB.length()) {
            return 0;
        } else {
            return -1;
        }
    }
}



