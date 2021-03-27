import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int db2 = 0;
        int db3 = 0;
        int db4 = 0;
        int db5 = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (number == 2) {
                db2++;
            }   else if (number == 3) {
                db3++;
            }   else if (number == 4) {
                db4++;
            }   else {
                db5++;
            }
        }
        System.out.println(db2 + " " + db3 + " " + db4 + " " + db5);
    }
}