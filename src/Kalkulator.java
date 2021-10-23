import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        boolean koniec = true;
        int ilePodsieci, ileHostow;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj adres ip: ");
        String ip = in.nextLine();



        System.out.println("Wybierz, czy chcesz obliczyć podsieci na daną :\n a)liczbę podsieci \n b)liczbę hostów");
        char selectedOption = in.next().charAt(0);

        while (koniec) {
            if (selectedOption == 'a' || selectedOption == 'A' ) {
                System.out.println("Ile podsieci potrzebujesz?");
                ilePodsieci = in.nextInt();

                Podsieci podsieci = new Podsieci(ip, selectedOption, ilePodsieci);
                koniec = false;
            }
            else if(selectedOption == 'b' || selectedOption == 'B' ){
                System.out.println("Ile hostow potrzebujesz?");
                ileHostow = in.nextInt();

                Podsieci podsieci = new Podsieci(ip, selectedOption, ileHostow);
                koniec = false;
            }
            else {
                System.out.println("Błędnie wybrana opcja. Wybierz, czy chcesz obliczyć podsieci na daną :\n a)liczbę podsieci \n b)liczbę hostów");
                selectedOption = in.next().charAt(0);
            }
        }

    }
}
