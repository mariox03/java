/*Napiši program, ki izpiše vsoto vsakega drugega števila na intervalu med 4 in 37 in števila med 12 in 20.*/

public class Naloga10_3_6_1 {
    public static void main(String[] args) {
        int v;
        v = 0;

        for (int i = 5; i < 37; i += 2) {
            v = v + i;
        }
        for (int i = 13; i < 20; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("------------------------");
    }
}
