import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean noWeekend = cups >= 15 && cups <= 25 && weekend;
        boolean yesWeekend = cups >= 10 && cups <= 20 && !weekend;
        boolean successful = noWeekend || yesWeekend;
        System.out.println(successful);
    }
}