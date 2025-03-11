import java.util.Scanner;
import java.util.Random;

class Esercizio {
    private static Random random = new Random();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j, e;
        int[] ore = new int[n], pesi = new int[n];

        System.out.println("quanti pesci verranno pescati");
        n = in.nextInt();
        ore[i] = n;
        pesi[i] = n;
        i = 0;
        for (i = 0; i <= n - 1; i++) {
            peso = random.nextInt(100);
            System.out.println("inserisci l'ora di pesca tra le 0 e le 23");
            ora = in.nextLine();
            while (ora < 0 || ora > 23) {
                System.out.println("ora non valida deve essere tra le 0 e le 23");
            }
        }
        System.out.println("pescato pesce di peso" + peso + "alle ore" + ore + ":00");
        inserisci(pesi, orari, peso, ora);
        visualizza(pesi, orari);
        max = ricercaMassimo(pesi);
        System.out.println("il pesce più pesante" + pesi[max] + "è stato pescato agli orari" + orari[max] + ":00");
        pesi = rimuovi(pesi);
        orari = rimuovi(orari);
        System.out.println("pesci unci presenti nel secchio" + visualizza);
        visualizza(pesi, orari);
    }
    
    public static void inserisci(int[] pesi, int[] orari, int peso, int ora) {
        int i;

        if (pesi(i) || peso < max(pesi)) {
             = peso;
            orari[i] = ora;
        }
    }
    
    public static int ricercaMassimo(int[] pesi) {
        int max;

        
        return max;
    }
    
    public static int rimuovi(int[] pesi, int[] orari) {
        int i, pesciU;

        for (i = 0; i <= i < pesi; i++) {
            if (pesciU(pesi[i]) == pesciU) {
                pesciU[pesi[i]] = orari[i];
            }
        }
        
        return pesciU;
    }
    
    public static void visualizza(int[] pesi, int[] orari) {
        System.out.println("pesci nel secchio");
        for (i = 0; i <= pesi + 1; i++) {
            System.out.println("pesi" + pesi[i] + "orario" + ore[i]);
        }
    }
}
