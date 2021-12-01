import java.util.Scanner;

public class IsraeliNumber {

    public static String numberPhone(String str) {
        String strOne = "";
        if ((str.length() == 10) || str.length() == 11) {
            if (str.charAt(0) == '0' && str.charAt(1) == '5') {
                if (str.charAt(4) == '-') {
                    strOne = strOne + str;
                } else if (str.charAt(4) - str.charAt(4) == 0) {
                    for (int i = 0; i < str.length(); i++) {
                        if (i == 3) {
                            strOne = strOne + "-";

                        }
                        strOne = strOne + str.charAt(i);
                    }
                }
            }
        } else if (str.length() == 12) {
            if (str.charAt(0) == '9' && str.charAt(1) == '7' && str.charAt(2) == '2') {
                strOne = strOne + "0";
                for (int i = 3; i < str.length(); i++) {
                    if (i == 5) {
                        strOne = strOne + "-";
                    }
                    strOne = strOne + str.charAt(i);
                }
            } else {
                strOne = "";
            }
        } else {
            if (str.length() > 12 || str.length() < 10) {
                strOne = "";
            }
        }
        return strOne;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Israeli phone number");
        String s = scanner.nextLine();
        System.out.println(numberPhone(s));
    }

}

