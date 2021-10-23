import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        boolean koniec = true;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj adres ip: ");
        String ip = in.nextLine();



        System.out.println("Wybierz, czy chcesz obliczyć podsieci na daną :\n a)liczbę podsieci \n b)liczbę hostów");
        char selectedOption = in.next().charAt(0);

        while (koniec) {
            if (selectedOption == 'a' || selectedOption == 'b' || selectedOption == 'A' || selectedOption == 'B') {
                Podsieci podsieci = new Podsieci(ip, selectedOption);
                koniec = false;
            } else {
                System.out.println("Błędnie wybrana opcja. Wybierz, czy chcesz obliczyć podsieci na daną :\n a)liczbę podsieci \n b)liczbę hostów");
                selectedOption = in.next().charAt(0);
                

            }
        }

    }
}
