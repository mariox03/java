//Napiši program, ki izpiše vsoto števil na intervalu med 2 in 39 in števila med 9 in 20.

public class Naloga3_3_c_1 {
    public static void main(String[] args) {
        int v;
        v = 0;

        for (int i = 3; i < 39; i++) {
            v = v + i;
            if (i > 9 && i < 20) {
                System.out.println(i);
            }
        }
        System.out.println("------------------------");
        System.out.println("Vsota je: " + v);
        System.out.println("------------------------");
    }
}
