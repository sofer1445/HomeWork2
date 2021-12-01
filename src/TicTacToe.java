import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] lineArray = {'-', '-', '-', '-', '-', '-', '-', '-', '-'};
        int counter = 0;
        boolean isWinner = false;
        char player = '-';

        while (!isWinner && counter < 9) {
            player = getPlayer(player);
            int number = getPositionFromUser(lineArray, player);
            isWinner = placeSymbolOnBoard(lineArray, number, player);
            counter++;
        }

        if (isWinner == true) {
            System.out.println(isWinner + "," + "The winner is " + player);
        } else {
            System.out.println("The game ended without a result");
        }
    }


    public static void printBoard(char[] lineArray) {
        System.out.println(lineArray[0] + "" + lineArray[1] + "" + lineArray[2]);
        System.out.println(lineArray[3] + "" + lineArray[4] + "" + lineArray[5]);
        System.out.println(lineArray[6] + "" + lineArray[7] + "" + lineArray[8]);
    }

    public static boolean isAvailable(char[] board, int location) {
        if (board[location] == 'x' || board[location] == '0') {
            return false;
        }
        return true;
    }
    // The function gets a character and checks if it is 'x' or '0'
    public static char getPlayer(char player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type player type");
        player = scanner.next().charAt(0);
        while (player != 'x' && player != '0') {
            System.out.println("Type player type");
            player = scanner.next().charAt(0);

        }
        return player;
    }


    public static int getPositionFromUser(char[] array, char player) {
        System.out.println("The next player chooses a number between 0-8");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0 && number < 9) {
            boolean available = isAvailable(array, number);
            while (!available) {
                System.out.println("This location is already occupied, type another number");
                number = scanner.nextInt();
                available = isAvailable(array, number);
            }
        } else while (number < 0 || number >= 9) {
            System.out.println("type a different number");
            number = scanner.nextInt();
        }
        return number;
    }

    public static char checkWinner(char[] array) {

        char player = '-';


        if ((array[0] != '-') && (array[0] == array[4]) && (array[0] == array[8])) {
            player = array[0];
        } else if ((array[2] != '-') && (array[2] == array[4]) && (array[2] == array[6])) {
            player = array[2];
        } else if ((array[1] != '-') && (array[0] == array[1]) && (array[0] == array[2])) {
            player = array[0];
        } else if ((array[3] != '-') && (array[3] == array[4]) && (array[3] == array[5])) {
            player = array[3];
        } else if ((array[6] != '-') && (array[6] == array[7]) && (array[6] == array[8])) {
            player = array[6];
        } else if ((array[3] != '-') && (array[0] == array[3]) && (array[0] == array[6])) {
            player = array[0];
        } else if ((array[4] != '-') && (array[1] == array[4]) && (array[1] == array[7])) {
            player = array[1];
        } else if ((array[5] != '-') && (array[2] == array[5]) && (array[2] == array[8])) {
            player = array[2];
        }
        return player;
    }


    public static boolean placeSymbolOnBoard(char[] array, int number, char player) {
        boolean isWinner = false;

        array[number] = player;
        printBoard(array);
        char answer = checkWinner(array);

        if (answer == 'x' || answer == '0') {
            isWinner = true;
        }
        return isWinner;

    }
}
