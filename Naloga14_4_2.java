/*Napiši program, ki izpiše vsoto vsakega petega števila na intervalu med 3 in 59. Začni z izpisom števila 5.*/

public class Naloga14_4_2 {
    public static void main(String[] args) {
        int v;
        v = 0;

        for (int i = 5; i < 59; i += 5) {
            v = v + i;
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("------------------------");
    }
}
