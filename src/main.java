import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int ay, gun;

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ve Gün bilgilerinizi sayısal olarak giriniz");
        System.out.print(" Ay giriniz : ");
        ay = input.nextInt();
        System.out.print("Gün giriniz : ");
        gun = input.nextInt();

        if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            System.out.print(" Burcunuz : Kova ");
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            System.out.print(" Burcunuz : Balık ");
        } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            System.out.print(" Burcunuz : Koç ");
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            System.out.print(" Burcunuz : Boğa ");
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            System.out.print(" Burcunuz : İkizler ");
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            System.out.print(" Burcunuz : Yengeç ");
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            System.out.print(" Burcunuz : Aslan ");
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            System.out.print(" Burcunuz : Başak ");
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            System.out.print(" Burcunuz : Terazi ");
        } else if ((ay == 10 && gun <= 23) || (ay == 11 && gun <= 21)) {
            System.out.print(" Burcunuz : Akrep ");
        } else if ((ay == 11 && gun <= 22) || (ay == 12 && gun <= 21)) {
            System.out.print(" Burcunuz : Yay ");
        } else if ((ay == 12 && gun <= 22) || (ay == 1 && gun <= 21)) {
            System.out.print(" Burcunuz : Oğlak");
        } else {
            System.out.println(" Lütfen bilgilerinizi kontrol edin ");
        }

    }
}
