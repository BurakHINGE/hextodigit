import java.util.Scanner;

public class hextodigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String hex;
        
        while (true) {
            System.out.println("Hesaplamak istediğiniz hexadecimal değeri giriniz: ");
            hex = input.nextLine();

            if (isValidHex(hex)) {
                break;
            }
            else {
                System.out.println("Hatalı giriş lütfen (0-9) ve (a-f,A-F) arası değerler kullanın.");
            }
        }


        System.out.println(hex + " hexadecimal sayısının tam sayı karşılığı: " + hexToDecimal(hex));
   
    }

    public static boolean isValidHex(String value) {

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);

            if (c <= '9' && c >= '0') {
                continue;
            }
            else if (c <= 'f' && c >= 'a') {
                continue;
            }
            else if (c <= 'F' && c >= 'A') {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static int hexToDecimal(String hex) {
        int result = 0;

        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);

            int value; 

            if (c <= '9' && c >= '0') {
                value = c - '0';
            }
            else if (c <= 'f' && c >= 'a') {
                value = (c - 'a') + 10;
            }
            else if (c <= 'F' && c >= 'A') {
                value = (c - 'A') + 10;
            }
            else {
                return -1;
            }

            result = result * 16 + value;

        }

        return result;

    }
}
