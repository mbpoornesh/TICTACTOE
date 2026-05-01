import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int slot = getUserSlot(sc);
        System.out.println("Slot entered: " + slot);

        sc.close();
    }

    static int getUserSlot(Scanner sc) {
        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }
}
