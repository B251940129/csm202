package Lab07;
import java.util.Scanner;
import Lab07.Oyutan;
import Lab07.OyutanManager;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OyutanManager manager = new OyutanManager();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Oyutan nemeh");
            System.out.println("2. Oyutan ustgah");
            System.out.println("3. Oyutan haih");
            System.out.println("4. Nerere erembeleh");
            System.out.println("5. Buh oyutniig harah");
            System.out.println("6. Garah");
            System.out.print("Songolt: ");

            if (!sc.hasNextInt()) {
                System.out.println("Too oruulna uu!");
                sc.next();
                continue;
            }

            int songolt = sc.nextInt();
            sc.nextLine();

            switch (songolt) {
                case 1:
                    System.out.print("Ner: ");
                    String ner = sc.nextLine();

                    System.out.print("Nas: ");
                    int nas = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Kod: ");
                    String kod = sc.nextLine();

                    manager.oyutanNemex(new Oyutan(ner, nas, kod));
                    break;

                case 2:
                    System.out.print("Ustgah oyutnii kod: ");
                    manager.oyutanUsatgax(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Haih oyutnii kod: ");
                    Oyutan o = manager.oyutanHaix(sc.nextLine());
                    if (o != null) {
                        System.out.println(o);
                    } else {
                        System.out.println("Oyutan oldsongui!");
                    }
                    break;

                case 4:
                    manager.nereerEreembelye();
                    break;

                case 5:
                    manager.buhOyutniigHaruulah();
                    break;

                case 6:
                    System.out.println("Bayartai!");
                    sc.close();
                    return;

                default:
                    System.out.println("Buruu songolt!");
            }
        }
    }
}

