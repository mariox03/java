/*Napiši program, ki izpiše vsoto števil na intervalu med 3 in 35 in števila med 23 in 35.*/

public class Naloga17_2_c_1 {
    public static void main(String[] args) {
        int v;
        v = 0;

        for (int i = 4; i < 35; i++) {
            v = v + i;
            if (i > 23) {
                System.out.println(i);
            }
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("------------------------");
    }
}
