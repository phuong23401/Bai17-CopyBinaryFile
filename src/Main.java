import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập file nguồn: ");
        String filePath = SCANNER.nextLine();
        IOFile.readFile(filePath);

        System.out.println("Nhập file đích: ");
        String filePath1 = SCANNER.nextLine();
        IOFile.writeFile(filePath1);
    }
}
