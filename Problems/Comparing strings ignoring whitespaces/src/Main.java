import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String line3 = line1.trim().replace(" ", "");
        String line4 = line3.replace("\t", "");
        String line5 = line2.trim().replace(" ", "");
        String line6 = line5.replace("\t", "");

        System.out.println(line4.equals(line6));
    }
}