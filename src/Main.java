import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rg;
        int[] size = { 2, 3, 4, 5, 6, 7, 8, 9 };

        int sum = 0;
        int digit = 0;

        System.out.println("Digite o RG que deseja saber se é válido ou não");
        rg = sc.next();
        rg = rg.replaceAll("[^0-9]", "");

        System.out.println(rg.length());

        for (int i = 0; i < 8; i++) {
            sum += (Character.getNumericValue(rg.charAt(i)) * size[i]);
        }

        digit = 11 - (sum % 11);

        if (digit >= 10 || digit <= 2) {
            digit = 0;
        }

        if (digit != Character.getNumericValue(rg.charAt(8))
                || rg.length() != 9) {
            System.out.println("RG INVÁLIDO");
        } else {
            System.out.println("RG VÁLIDO");
        }

        sc.close();

    }
}