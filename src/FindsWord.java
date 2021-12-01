import java.util.Scanner;

public class FindsWord {

    public static boolean bigString(String par, String parTwo) {
        boolean x = true;
        int number = par.length();
        int numberTwo = parTwo.length();
        if (number == numberTwo) {
            for (int i = 0; i < number; i++) {
                if (par.charAt(i) != parTwo.charAt(i)) {
                    System.out.println(parTwo + " No match " + false);
                    x = false;
                    break;
                }
            }
            System.out.println(x);
        }
        if (number > numberTwo) {
            int z = numberTwo;

            for (int i = 0; i < numberTwo; ) {
                for (int j = 0; j < number; j++) {
                    if (par.charAt(j) == parTwo.charAt(i)) {
                        i++;
                        z--;
                    }
                     if (z == 0) {
                        System.out.println("," + true + ",Found");
                    } else if (j == number - 1) {
                        System.out.println("," + "Not Found" + "," + false);
                        i = numberTwo;

                    }
                }
            }
        } else if (numberTwo > number) {
            System.out.println("out of bound");
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type original text");
        String text1 = scanner.nextLine();
        System.out.println("Word search in text");
        String text2 = scanner.nextLine();
        bigString(text1, text2);


    }
}



