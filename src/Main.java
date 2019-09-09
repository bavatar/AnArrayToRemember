import java.util.Scanner;
public class Main {
//    Today you're going to write specific code to store the history of a list.
//    Type in the names of the last ten presidents in the order they were elected.
//    When you are done, enter the word history. Your program should display their names starting with the most recent.
//
//    For your convenience, the names of the last 10 presidents are:
//    Johnson, Nixon, Ford, Carter, Reagan, Bush, Clinton, Bush, Obama, Trump

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int[] testArray1 = {1, 2, 3, 4, 5};
        //String RecentPresidents[] = new String[10];
        String[] RecentPresidents = {"Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Osama", "Trump"};

        System.out.println("Would you like to see the history of presidents? (Y/N).");
        String userResp = keyboard.nextLine();
        if (userResp.equalsIgnoreCase("Y")) {
            System.out.println();
            for (int i = 9; i >= 0; i--) {
                System.out.println(RecentPresidents[i]);
            }
        }
    }
}
