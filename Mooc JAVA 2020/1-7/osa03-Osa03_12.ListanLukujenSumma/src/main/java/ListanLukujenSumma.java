
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");
        int summa=0;
        // toteuta listan lukujen summan laskeminen tänne
        for (Integer luku : lista) {
            summa=summa+luku;
            
        }
        System.out.println("Summa: "+summa);
    }
}