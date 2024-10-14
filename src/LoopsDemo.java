public class LoopsDemo {

    public static void main(String[] args) {
        // for-Schleife

        System.out.println("For_Schleife Beispiel");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Durchlauf Nummer " + i);
        }
        // While-Schleife
        int i = 0;
        while (i <= 10) {
            System.out.println("\nWhile-Durchlauf Nummer " + i);
            i = i + 1;
        }
        //Do-While-Schleife
        System.out.println("\n------------------\nDo-While-Schleife Beispiel");
        int j = 10;
        do {
            System.out.println("Durchlauf nummer " + j);
            j--;
        } while (j > 0);

    }
}
