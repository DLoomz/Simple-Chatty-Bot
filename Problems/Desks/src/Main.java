import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGroup = scanner.nextInt();
        int secondGroup = scanner.nextInt();
        int thirdGroup = scanner.nextInt();

        int table1;
        int table2;
        int table3;
        if (firstGroup % 2 != 0) {
            table1 = firstGroup / 2 + 1;
        }   else {
            table1 = firstGroup / 2;
        }
        if (secondGroup % 2 != 0) {
            table2 = secondGroup / 2 + 1;
        }   else {
            table2 = secondGroup / 2;
        }
        if (thirdGroup % 2 != 0) {
            table3 = thirdGroup / 2 + 1;
        }   else {
            table3 = thirdGroup / 2;
        }

        System.out.println(table1 + table2 + table3);
    }
}