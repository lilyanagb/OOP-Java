import java.util.Locale;
import java.util.Scanner;
class RouteCipherTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cols = scanner.nextInt();
        scanner.nextLine();

        RouteCipher cipher = new RouteCipher(cols);
        String cipherText = scanner.nextLine();
        cipher.encrypt(cipherText);
        System.out.println(cipher.toString());
        //cipher.decrypt("ATSYVNTEDXXTEANITROBHSOESPOEHOMEIUB");
    }
}
